import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ecommerce{
    public static void main(String args[]) throws IOException {
        try{
        int count = fCount();
        FileReader file = new FileReader("/home/ajay/Desktop/challenges/challenge-41-boilerplate/data/flipkart-product-sample.csv");
        BufferedReader reader = new BufferedReader(file);
        Sales s=new Sales();
        ArrayList<Sales> list=new ArrayList<>();
        SalesOperation sales=new SalesOperation();
        String line=null;
        String arr[];
        line=reader.readLine();
        while((line=reader.readLine()) !=null){
            arr=line.split(",");
            if ((arr[0].equals(null)) || (arr[1].equals(null)) || (arr[2].equals(null))
                    || (arr[3].equals(null)) || (arr[4].equals(null)) || (arr[5].equals(null))
                    || (arr[6].equals(null))) {
                
                break;
            }
            s.setPid(arr[0]);
            s.setProdName(arr[1]);
            s.setBrand(arr[2]);
            s.setProdURL(arr[3]);
            s.setrPrice(arr[4]);
            s.setdPrice(arr[5]);
            s.setProdRating(arr[6]);
            list.add(new Sales(s.getPid(),s.getProdName(),s.getBrand(),s.getProdURL(),s.getrPrice(),s.getdPrice(),s.getProdRating()));  
        }
        sales.sortRPrice(list,count);
        sales.sortRating(list,count);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }

    public static int fCount() throws IOException {
        FileReader file=new FileReader("/home/ajay/Desktop/challenges/challenge-41-boilerplate/data/flipkart-product-sample.csv");
        BufferedReader reader=new BufferedReader(file);
        String line;
        line=reader.readLine();
        int count=0;
        while((line=reader.readLine())!=null){
            count++;
        }
        reader.close();
        return count;
    }

}
