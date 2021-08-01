import java.io.*;
    public class SortingEcommerce {
        String line;
        String[] arr;
        static int counter = 0;
        public int count() {
            try (BufferedReader reader = new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-32-boilerplate/data/flipkart_product_sample.csv"))) {
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    arr = line.split(",");
                    if (arr[0].contains("null") || arr[1].contains("null") || arr[3].contains("null") || arr[4].contains("null") || arr[5].contains("null") || arr[6].contains("null")) {
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
        Sorting_Ecommerce_products[] products = new Sorting_Ecommerce_products[length];
        public void process() {
            int index_storing = 0;
            String s;
            try (BufferedReader reader = new BufferedReader(new FileReader("/home/ajay/Desktop/challenges/challenge-32-boilerplate/data/flipkart_product_sample.csv"))) {
                reader.readLine();
                while ((line = reader.readLine()) != null) {
                    arr = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    if (arr[0].contains("null") || arr[1].contains("null") || arr[3].contains("null") || arr[4].contains("null") || arr[5].contains("null") || arr[6].contains("null")) {
                        continue;
                    } else {
                        if (arr[6].contains("1") || arr[6].contains("2") || arr[6].contains("3") || arr[6].contains("4") || arr[6].contains("5")) {
                            s = arr[6];
                        } else {
                            s = arr[6].replace("No rating available", "0");
                        }
                        Sorting_Ecommerce_products list = new Sorting_Ecommerce_products(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Double.parseDouble(s));
                        products[index_storing] = list;
                        index_storing++;
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void sortByPrice() {
            Sorting_Ecommerce_products[] temp = new Sorting_Ecommerce_products[length];
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/SortedByPrice.txt"))) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length - 1 - i; j++) {
                        if (products[j].getRetail_price() > products[j + 1].getRetail_price()) {
                            temp[i] = products[j];
                            products[j] = products[j + 1];
                            products[j + 1] = temp[i];
                        }
                    }
                }
                writer.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating");
                writer.newLine();
                for (int i = 0; i < length; i++) {
                    writer.write(products[i].getPid());
                    writer.write(",");
                    writer.write(products[i].getProduct_name());
                    writer.write(",");
                    writer.write(products[i].getBrand());
                    writer.write(",");
                    writer.write(products[i].getURL());
                    writer.write(",");
                    String s = String.valueOf(products[i].getRetail_price());
                    writer.write(s);
                    writer.write(",");
                    String s2 = String.valueOf(products[i].getDiscounted_price());
                    writer.write(s2);
                    writer.write(",");
                    String s3 = String.valueOf(products[i].getProduct_rating());
                    writer.write(s3);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Sorted by Price and Stored in the Price");
        }
        public void sortByRating() {
            Sorting_Ecommerce_products[] temp = new Sorting_Ecommerce_products[length];
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/SortedByRating.txt"))) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length - 1 - i; j++) {
                        if (products[j].getProduct_rating() < products[j + 1].getProduct_rating()) {
                            temp[i] = products[j];
                            products[j] = products[j + 1];
                            products[j + 1] = temp[i];
                        }
                    }
                }
                writer.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating");
                writer.newLine();
                for (int i = 0; i < length; i++) {
                    writer.write(products[i].getPid());
                    writer.write(",");
                    writer.write(products[i].getProduct_name());
                    writer.write(",");
                    writer.write(products[i].getBrand());
                    writer.write(",");
                    writer.write(products[i].getURL());
                    writer.write(",");
                    String s = String.valueOf(products[i].getRetail_price());
                    writer.write(s);
                    writer.write(",");
                    String s2 = String.valueOf(products[i].getDiscounted_price());
                    writer.write(s2);
                    writer.write(",");
                    String s3 = String.valueOf(products[i].getProduct_rating());
                    writer.write(s3);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Sorted by Rating and Stored in the file");
        }
        public void insertionSort() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/InsertionSortedByRating.txt"))) {
                Sorting_Ecommerce_products[] temp1 = new Sorting_Ecommerce_products[length];
                for (int i = 1; i < length; i++) {
                    int j = i - 1;
                    int temp = products[i].getDiscounted_price();
                    while (j >= 0 && products[j].getDiscounted_price() > temp) {
                        products[j + 1] = products[j];
                        j--;
                        products[j + 1].setDiscounted_price(temp);
                    }
                }
                writer.write("pid,product_name,brand,product_url,retail_price,discounted_price,product_rating");
                writer.newLine();
                for (int i = 0; i < length; i++) {
                    writer.write(products[i].getPid());
                    writer.write(",");
                    writer.write(products[i].getProduct_name());
                    writer.write(",");
                    writer.write(products[i].getBrand());
                    writer.write(",");
                    writer.write(products[i].getURL());
                    writer.write(",");
                    String s = String.valueOf(products[i].getRetail_price());
                    writer.write(s);
                    writer.write(",");
                    String s2 = String.valueOf(products[i].getDiscounted_price());
                    writer.write(s2);
                    writer.write(",");
                    String s3 = String.valueOf(products[i].getProduct_rating());
                    writer.write(s3);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Sorted by Rating and Stored in the file");
        }
    
    
}
