import java.util.Scanner;
public class exercise22 {

    public static void main(String[] args) {
        int no_of_row,c=1,i,j,b;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_of_row = in.nextInt();
        for(i=0;i<no_of_row;i++)
        {
            for(b=1;b<=no_of_row-i;b++)
            System.out.print(" ");
            for(j=0;j<=i;j++)
            {
              if (j==0||i==0)
                c=1;
              else
              c=c*(i-j+1)/j;
              System.out.print(" "+c);
            }
         System.out.print("\n");
        }
    }
}
