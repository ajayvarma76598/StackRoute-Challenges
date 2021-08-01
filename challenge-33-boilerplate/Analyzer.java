import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Analyzer {
    private ProductData[] productDataList;
    public int noProduct(){
        int count = 0;
        String file_location = "/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/flipkart_product_sample.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file_location))){
            bufferedReader.readLine();
            String line;
            while((line=bufferedReader.readLine())!=null){
                count++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return count;
    }
    public void readProductData(){
        productDataList = new ProductData[noProduct()];
        int k=0;
        String file_location = "/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/flipkart_product_sample.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file_location))){
            String header = bufferedReader.readLine();
            String line;
            while((line=bufferedReader.readLine())!=null){
                productDataList[k++] = getOneProduct(line);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public ProductData getOneProduct(String line){
        String[] columns = line.split(",(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))");
        ProductData oneProductData = new ProductData();
        oneProductData.setPid(columns[0]);
        oneProductData.setProduct_name(columns[1]);
        oneProductData.setBrand(columns[2]);
        oneProductData.setProduct_url(columns[3]);
        try{
            oneProductData.setRetail_price(Integer.parseInt(columns[4]));
            oneProductData.setDiscounted_price(Double.parseDouble(columns[5]));
            oneProductData.setProduct_rating(Double.parseDouble(columns[6]));
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception Handled");
        }catch(NumberFormatException e){
            System.out.println("Number Format Exception Handled");
        }
        return oneProductData;
    }
    public ProductData[] getDetails(){
        if(productDataList==null){
            readProductData();
        }
        return productDataList;
    }
    public void sortProductsPrice(int low, int high) 
    {
        getDetails();
        if (low >= high){
            return;
        }
        double pivot = productDataList[(low+high)/2].getRetail_price();
        int i = low, j = high;
        while (i <= j) 
        {
            while (productDataList[i].getRetail_price() < pivot) 
            {
                i++;
            }
            while (productDataList[j].getRetail_price() > pivot) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            sortProductsPrice(low, j);
        }
        if (high > i){
            sortProductsPrice(i, high);
        }
    }
    public void swap(int x, int y){
        ProductData temp;
        temp = productDataList[x];
        productDataList[x] = productDataList[y];
        productDataList[y] = temp;
    }
    public void createSortedPriceFile(){
        File fileSortedPrice = new File("/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/SortedDataPrice.csv");
        try {
            if (fileSortedPrice.createNewFile()) {
                System.out.println("New file (for data sorting on the basis of retail price in ascending order) is created.");
            } else {
                System.out.println("File, (for data sorting on the basis of retail price in ascending order) that you want to create, already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void file_write()  {
        getDetails();
        sortProductsPrice(0, productDataList.length-1);
        try (FileWriter write = new FileWriter("/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/SortedDataPrice.csv"))
        {
            write.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating\n");
            for(int i=0; i<productDataList.length; i++){
            write.write(productDataList[i].getPid()+","+productDataList[i].getProduct_name()+","+productDataList[i].getBrand()+","+productDataList[i].getProduct_url()+","+productDataList[i].getRetail_price()+","+productDataList[i].getDiscounted_price()+","+productDataList[i].getProduct_rating()+"\n");
            write.flush();
            }
            write.close();
            System.out.println("Written successfully in SortedDataPrice.csv file (for data sorting on the basis of retail price in ascending order).");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public void sortProductsRating(int low, int high) {
        getDetails();
        if (low >= high){
            return;
        }
        double pivot = productDataList[(low+high)/2].getProduct_rating();
        int i = low, j = high;
        while (i <= j) 
        {
            while (productDataList[i].getProduct_rating() > pivot) 
            {
                i++;
            }
            while (productDataList[j].getProduct_rating() < pivot) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            sortProductsRating(low, j);
        }
        if (high > i){
            sortProductsRating(i, high);
        }
    }
    public void createSortedRatingFile(){
        File fileSortedPrice = new File("/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/SortedDataRating.csv");
        try {
            if (fileSortedPrice.createNewFile()) {
                System.out.println("New file (for data sorting on the basis of rating in descending order) is created.");
            } else {
                System.out.println("File, (for data sorting on the basis of rating in descending order) that you want to create, already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fileWriteRating()  {
        getDetails();
        sortProductsRating(0, productDataList.length-1);
        try (FileWriter write = new FileWriter("/home/ajay/Desktop/challenges/challenge-33-boilerplate/data/SortedDataRating.csv"))
        {
            write.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating\n");
            for(int i=0; i<productDataList.length; i++){
                write.write(productDataList[i].getPid()+","+productDataList[i].getProduct_name()+","+productDataList[i].getBrand()+","+productDataList[i].getProduct_url()+","+productDataList[i].getRetail_price()+","+productDataList[i].getDiscounted_price()+","+productDataList[i].getProduct_rating()+"\n");
                write.flush();
            }
            write.close();
            System.out.println("Written successfully in SortedDataRating.csv (for data sorting on the basis of rating in descending order)");
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}

