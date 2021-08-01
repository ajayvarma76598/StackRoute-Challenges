import java.util.*;
import java.lang.*;
public class Task14{
    public static void main(String[] args){
        String stdname[]=new String[100];
        String stdroll[]=new String[100];
        float maths[]=new float[100], science[]=new float[100], english[]=new float[100], language[]=new float[100], socialstudies[]=new float[100], total[]=new float[100], totalmarks[]=new float[100],avg[]=new float[100];
        char grade[]=new char[100], grades[]=new char[100],temp;
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sudents:");
        n=sc.nextInt();
        System.out.println("Enter students names");
        for(i=0;i<n;i++){
          stdname[i]=sc.next();}
          System.out.println("Enter students roll numbers");
          for(i=0;i<n;i++){
              stdroll[i]=sc.next();
          }
          System.out.println("Enter students maths marks");
          for(i=0;i<n;i++){
              maths[i]=sc.nextFloat();
          }
          System.out.println("Enter students science marks");
          for(i=0;i<n;i++){
              science[i]=sc.nextFloat();
          }
          System.out.println("Enter students english marks");
          for(i=0;i<n;i++){
              english[i]=sc.nextFloat();
          }
          System.out.println("Enter students language marks");
          for(i=0;i<n;i++){
              language[i]=sc.nextFloat();
          }
          System.out.println("Enter students social studies");
          for(i=0;i<n;i++){
              socialstudies[i]=sc.nextFloat();
          }
          for(i=0;i<n;i++){
              total[i]=(maths[i]+science[i]+english[i]+language[i]+socialstudies[i]);
              totalmarks[i]=total[i];
              avg[i]=(total[i]/5);
            }
            i = 100;
            while(i>=10){
                System.out.print(i + " | ");
                for( j=0; j<n; j++){
                    if(avg[j]>i){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
                i=i-10;
            }
            for(int k=1; k<n+3; k++){
                System.out.print("___");
            }
            System.out.println();
            for(int k=0; k<=n; k++){
                if(k==0){
                    System.out.print("       ");
                }else{
                System.out.print(k+"  ");
                }
            }
            System.out.println();
        }
    }
