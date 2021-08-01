import java.util.Scanner;
public class exercise21 {
    public static void ascending(int[] arr) {

        int temp = 0, i, j;

        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        
    }  

 public static void main(String[] args)
   { 
     int n,i;
     int arr[];
     Scanner sc = new Scanner(System.in);
     System.out.print("enter no of elements");
     n = sc.nextInt();
     arr = new int[n];
     System.out.println("enter the elements");
      for(i = 0; i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
        ascending(arr);   
        
        System.out.println("elements in ascending order");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);      
    }
}  
