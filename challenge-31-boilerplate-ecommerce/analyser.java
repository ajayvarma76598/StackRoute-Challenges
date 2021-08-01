import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class analyser {
    String line;
    String[] arr;
    static int counter = 0;

    public int count() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-31-boilerplate-ecommerce/data/purchase_details.csv"));) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                arr = line.split(",");
                if (arr[0].contains("null") || arr[1].contains("null") || arr[2].contains("null") || arr[3].contains("null") || arr[4].contains("null") || arr[5].contains("null") || arr[6].contains("null") || arr[0].contains(" ") || arr[1].contains(" ") || arr[2].contains(" ") || arr[3].contains(" ") || arr[4].contains(" ") || arr[5].contains(" ") || arr[6].contains(" ")) {
                    continue;
                } else {
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

    int length = count();
    Details[] listDetails = new Details[length];

    public void process() {
        int i = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-31-boilerplate-ecommerce/data/purchase_details.csv"))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                arr = line.split(",");
                if (arr[0].contains("null") || arr[1].contains("null") || arr[2].contains("null") || arr[3].contains("null") || arr[4].contains("null") || arr[5].contains("null") || arr[6].contains("null") || arr[0].contains(" ") || arr[1].contains(" ") || arr[2].contains(" ") || arr[3].contains(" ") || arr[4].contains(" ") || arr[5].contains(" ") || arr[6].contains(" ")) {
                    continue;
                } else {
                    Details list = new Details(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3], Float.parseFloat(arr[4]), Float.parseFloat(arr[5]), Integer.parseInt(arr[6]));
                    listDetails[i] = list;
                    i = i + 1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void unique_ProductCatagory() {
        int count_unique = 0;
        System.out.println("The unique product categories that are sold in this tenure are: ");
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (listDetails[i].getProduct_category() == listDetails[j].getProduct_category()) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(listDetails[i].getProduct_category()+" ");
            }
        }
    }
    public void dateWiseHighLow() {
        int count_unique = 0;
        int[] count_array = new int[15];
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (listDetails[i].getDate().contains(listDetails[j].getDate())) {
                    break;
                }
            }
            if (i == j) {
                count_unique++;
            }
        }
        String[] unq_dates = new String[count_unique];
        int m = 0;
        for (int i = 0; i < length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (listDetails[i].getDate().contains(listDetails[j].getDate())) {
                    break;
                }
            }
            if (i == j) {
                unq_dates[m] = listDetails[i].getDate();
                m++;
            }
        }
        for (int i = 0; i < unq_dates.length; i++) {
            for (int j = 0; j < length; j++) {

                if (unq_dates[i].contains(listDetails[j].getDate())) {
                    if (listDetails[j].getProduct_category() == 501) {
                        count_array[0]++;
                    } 
                    else if (listDetails[j].getProduct_category() == 502) {
                        count_array[1]++;
                    } 
                    else if (listDetails[j].getProduct_category() == 503) {
                        count_array[2]++;
                    }
                    else if (listDetails[j].getProduct_category() == 504) {
                        count_array[3]++;
                    }
                    else if (listDetails[j].getProduct_category() == 505) {
                        count_array[4]++;
                    }
                    else if (listDetails[j].getProduct_category() == 506) {
                        count_array[5]++;
                    }
                    else if (listDetails[j].getProduct_category() == 507) {
                        count_array[6]++;
                    }
                    else if (listDetails[j].getProduct_category() == 508) {
                        count_array[7]++;
                    }
                    else if (listDetails[j].getProduct_category() == 509) {
                        count_array[8]++;
                    }
                    else if (listDetails[j].getProduct_category() == 510) {
                        count_array[9]++;
                    }
                    else if (listDetails[j].getProduct_category() == 511) {
                        count_array[10]++;
                    }
                    else if (listDetails[j].getProduct_category() == 512) {
                        count_array[11]++;
                    }
                    else if (listDetails[j].getProduct_category() == 513) {
                        count_array[12]++;
                    }
                    else if (listDetails[j].getProduct_category() == 514) {
                        count_array[13]++;
                    }
                    else if (listDetails[j].getProduct_category() == 515) {
                        count_array[14]++;
                    }
                }

            }
            int largest = 0;
            int l = 0;
            int smallest = 0;
            int s = 0;
            for (int x = 0; x < count_array.length; x++) {
                if (count_array[x] > largest) {
                    largest = count_array[x];
                    l = x + 501;
                }
            }
            smallest = largest;
            for (int x = 0; x < count_array.length; x++) {
                if (count_array[x] < smallest) {
                    smallest = count_array[x];
                    s = x + 501;
                }
            }
            for (int x = 0; x < count_array.length; x++) {
                count_array[x] = 0;
            }
            System.out.println("On " + unq_dates[i] + " the highest selling product category is " + l + " with " + largest + " sales and the lowest selling product category is " + s + " with " + smallest + " sales");
        }
    }
    public void PreferedMode(){
        int count_credit = 0;
        int count_paypal = 0;
        for(int i = 0;i < length; i++){
            if(listDetails[i].getPayment_method()=="credit"){
                count_credit++;
            }
            else{
                count_paypal++;
            }
        }
        if(count_credit > count_paypal){
            System.out.println("The prefered mode of payment of customers is by credit");
        }
        else if(count_credit < count_paypal){
            System.out.println("The prefered mode of payment of customers is by paypal");
        }
        else{
            System.out.println("The prefered mode of payment is equal");
        }
    }
    public void highestSold(){
        int[] count_array = new int[15];
            for (int j = 0; j < length; j++) {
                if (listDetails[j].getProduct_category() == 501) {
                    count_array[0]++;
                }
                else if (listDetails[j].getProduct_category() == 502) {
                    count_array[1]++;
                }
                else if (listDetails[j].getProduct_category() == 503) {
                    count_array[2]++;
                }
                else if (listDetails[j].getProduct_category() == 504) {
                    count_array[3]++;
                }
                else if (listDetails[j].getProduct_category() == 505) {
                    count_array[4]++;
                }
                else if (listDetails[j].getProduct_category() == 506) {
                    count_array[5]++;
                } 
                else if (listDetails[j].getProduct_category() == 507) {
                    count_array[6]++;
                }
                else if (listDetails[j].getProduct_category() == 508) {
                    count_array[7]++;
                }
                else if (listDetails[j].getProduct_category() == 509) {
                    count_array[8]++;
                }
                else if (listDetails[j].getProduct_category() == 510) {
                    count_array[9]++;
                }
                else if (listDetails[j].getProduct_category() == 511) {
                    count_array[10]++;
                }
                else if (listDetails[j].getProduct_category() == 512) {
                    count_array[11]++;
                }
                else if (listDetails[j].getProduct_category() == 513) {
                    count_array[12]++;
                }
                else if (listDetails[j].getProduct_category() == 514) {
                    count_array[13]++;
                }
                else if (listDetails[j].getProduct_category() == 515) {
                    count_array[14]++;
                }
            }
            int largest = 0;
            int l = 0;
            for (int x = 0; x < count_array.length; x++) {
                if (count_array[x] > largest) {
                    largest = count_array[x];
                    l = x + 501;
                }
            }
            System.out.println("The highest selling product category is " + l + " with " + largest + " sales " );
        }
    public void analyzeCustomerByTime() {
        int count_below15min = 0;
        int count_above15min = 0;
        for (int j = 0; j < length; j++) {
            if (listDetails[j].getTime_on_site() <= 15) {
                count_below15min++;
            } else {
                count_above15min++;
            }
        }
        if (count_below15min<count_above15min) {
            System.out.println("Spending more time on site generates more sales");
        } else if (count_below15min>count_above15min){
            System.out.println("Spending less time on site generates more sales");
        }
        else {
            System.out.println("The sales does not depend on time spent on the ");
        }

    }
    public void analyzeCustomerByClicks() {
        int clicks=0;
        int count_clicks =0;
        for (int j = 0; j < length; j++) {
            clicks+=listDetails[j].getClicks_on_site();
            count_clicks++;
        }
        clicks/=count_clicks;
        System.out.println("Average number of clicks made by the customers before making their purchasing decision : "+clicks);
    }
}
