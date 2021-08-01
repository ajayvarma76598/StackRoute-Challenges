import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StockAnalyzer 
{
    double value;
    
    Scanner sc=new Scanner(System.in);
    int count,i=0,count1=1;
        String[] array;
        String[] arr;
       Stock[] stockcount;


       public int Count(){

        String line;
        try
        (
            BufferedReader reader=new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-31-boilerplate/data/CIPLA.NS.csv"));
        ){
            reader.readLine();
            while((line=reader.readLine())!=null)
            {
               arr=line.split(",");
               if(arr[1].contentEquals("null") || arr[2].contentEquals("null") || arr[3].contentEquals("null") || arr[4].contentEquals("null") || arr[5].contentEquals("null") || arr[6].contentEquals("null"))
               {
                   continue;
               } else{
                   count++;
               }
                
            } 
           
            }catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }catch(IOException e)
            {
                e.printStackTrace();
            }

            return count;

       }
       public Stock[] process(){
           String line;
        try(
            BufferedReader record =new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-31-boilerplate/data/CIPLA.NS.csv"));
        ){
            stockcount=new Stock[count];
            
             record.readLine();
             while((line=record.readLine())!=null)
             { 
                array=line.split(",");
                 if(array[1].contentEquals("null") || array[2].contentEquals("null") || array[3].contentEquals("null") || array[4].contentEquals("null") || array[5].contentEquals("null") || array[6].contentEquals("null"))
                 {
                     continue;
                 }else
                 {
                    
                 stockcount[i]=new Stock(array[0],Double.parseDouble(array[1]),Double.parseDouble(array[2]),Double.parseDouble(array[3]),Double.parseDouble(array[4]),Double.parseDouble(array[5]),Integer.parseInt(array[6]));
                 i++;
                
                 }} }catch(FileNotFoundException e){
            e.printStackTrace();
          }catch(IOException e){
            e.printStackTrace();
          }catch(NumberFormatException e){
            e.printStackTrace();
         }
           return stockcount;
       }
public double absoluteReturn()
{
    String d1;
    String d2;
    d1=stockcount[0].getDate();
    d2=stockcount[(stockcount.length-1)].getDate();
    Cal(d1,d2);

 return 0;
}
public  double absoluteReturn1()
    {
        String d1;
        String d2;
        
        
        System.out.println("Enter the First date  ");
         d1=sc.next();
         System.out.println("Enter the second date ");
         d2=sc.next();
        Cal(d1, d2);
         return 0;
    }
    private void Cal(String d1, String d2)
    {
        double openPrice=0;
        double closePrice=0;
         for(int i=0;i<stockcount.length;i++)
        {
           
          if(stockcount[i].getDate().contentEquals(d1))
          {
              openPrice=stockcount[i].getOpen();
          }
        }
          for(int j=0;j<stockcount.length;j++)
          {
              if(stockcount[j].getDate().contentEquals(d2))
              {
               closePrice=stockcount[j].getClose();
              }
          }
          value=(((closePrice-openPrice)/openPrice));

          System.out.println("Absolute Return is :"+value);
          
        }
        public void investment()
        {
            String invDate;
            String endDate;
            int stockPurcahsed=0;
            double openPrice=0;
            double closePrice=0;
            double stockPriceInvestedDate=0; 
            double stockPricetilldate=0;
            double profitOrloss=0;

            System.out.println("Enter the Date  when you purchased the stock ");
            invDate=sc.next();
            System.out.println("Enter the lot purchased");
             stockPurcahsed=sc.nextInt();
            System.out.println("Enter the end Date to be check for stock price ");
            endDate=sc.next();
            for(int i=0;i<stockcount.length;i++)
            {
                if(stockcount[i].getDate().contentEquals(invDate))
                {
                    openPrice=stockcount[i].getOpen();
                    
                }
            }
            for(int j=0;j<stockcount.length;j++)
            {
                if(stockcount[j].getDate().contentEquals(endDate)){
                    closePrice=stockcount[j].getClose();
                }

            }
            stockPricetilldate=(closePrice*stockPurcahsed);
            stockPriceInvestedDate=(openPrice*stockPurcahsed);
           profitOrloss=(stockPricetilldate-stockPriceInvestedDate);
           System.out.println("Stock price at the date of puchase was "+openPrice);
           System.out.println("The Amount Invested by you at the date of purchase was "+stockPriceInvestedDate);
           System.out.println("The Amount of growth of your Investment till date mentioned by you is "+stockPricetilldate);
           if(profitOrloss>0){
               System.out.println("You are in Profit, Profit amount is "+profitOrloss);
           }else{
               System.out.println("Your are in Loss, Loss amount is "+(-1*profitOrloss));
           }

        }
         public void highestOrlowestPrice()
         {
             double temp;
           double[] arr=new double[count];
           for(int i=0;i<arr.length;i++){
               arr[i]=stockcount[i].getClose();
           }

          for(int k=0;k<arr.length;k++){
              for(int l=k+1;l<arr.length;l++)
              {  
                  if(arr[k]>arr[l])
                  {
                    temp=arr[k];
                    arr[k]=arr[l];
                    arr[l]=temp;
                  }
                  
              }
          }
         for(int m=0;m<stockcount.length;m++)
         {
             if(arr[0]==stockcount[m].getClose())
             {
                System.out.println("Lowest Stock price is  "+stockcount[m].getClose()+"  with volume  "+stockcount[m].getVolume()+"  one date "+stockcount[m].getDate());

             }
             
             if(arr[stockcount.length-1]==stockcount[m].getClose())
             {
                System.out.println("Highest Stock price is  "+stockcount[m].getClose()+"  with volume  "+stockcount[m].getVolume()+"  one date "+stockcount[m].getDate());

             }

         }
      
        }

        public void averageDailyReturn(){
            int i=0;
            double openPrice;
            double closePrice;
            double calculation=0;
           

            while(i<stockcount.length-1)
            {
               openPrice= stockcount[i].getOpen();
               closePrice=stockcount[i+1].getClose();
                calculation=calculation+(closePrice-openPrice);
                 i++;
            }
            System.out.println("Average Daily Return is "+calculation/(stockcount.length-1));
        }
}

