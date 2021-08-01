import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SalesOperation {

    public void sortRPrice(ArrayList<Sales> list,int count) throws IOException {
        Collections.sort(list,new SalesPriceComparator());
        File file1=new File("./data/file1.txt");
        if(file1.createNewFile()){
            System.out.println("new file is created");
        }
        else{
            System.out.println("file already exists");
        }
        FileWriter writer=new FileWriter(file1);
        
        try{

        for(int i=0;i<count;i++)
        {
            writer.write(list.get(i).toString()+"\n");
        }
        writer.close();
        }catch(NullPointerException e){}

        catch(IOException e1){}

        System.out.println("successfully wrote");

    }

    public void sortRating(ArrayList<Sales> list,int count) throws IOException {
        Collections.sort(list,new SalesPRatingComparartor());
        File file2=new File("./data/file2.txt");
        if(file2.createNewFile()){
            System.out.println("new file is created");
        }
        else{
            System.out.println("file already exists");
        }
        FileWriter writer1=new FileWriter(file2);
        
        try{

        for(int i=0;i<count;i++)
        {
            writer1.write(list.get(i).toString()+"\n");
        }
        writer1.close();
        }catch(NullPointerException e){}

        catch(IOException e1){}

        System.out.println("successfully wrote");

    }
    
}
