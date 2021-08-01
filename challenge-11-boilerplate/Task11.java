import java.util.*;
import java.lang.*;
public class Task11{
    public static void main(String[] args){
        String stdname[]=new String[100];
        String stdroll[]=new String[100];
        float maths[]=new float[100], science[]=new float[100], english[]=new float[100], language[]=new float[100], socialstudies[]=new float[100], total[]=new float[100], totalmarks[]=new float[100];
        float total1=0,total2=0,total3=0,total4=0,total5=0,ave1=0,ave2=0,ave3=0,ave4=0,ave5=0;
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sudents:");
        n=sc.nextInt();
        System.out.println("Enter students names");
        for(i=0;i<n;i++){
          stdname[i]=sc.next();
        }
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
        }
        for(i=0;i<n;i++){
            total1+=maths[i];
            total2+=science[i];
            total3+=english[i];
            total4+=language[i];
            total5+=socialstudies[i];
            ave1=(total1/5);
            ave2=(total2/5);
            ave3=(total3/5);
            ave4=(total4/5);
            ave5=(total5/5);
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(total[i]>total[j]){
                    float temp=total[j];
                    total[j]=total[i];
                    total[i]=temp;
                }
            }
        }
         float max=total[n-1];
         for(i=0;i<n;i++){
             if(totalmarks[i]==max){
                 break;
             }
         }
         System.out.println("The top scorer of the class is "+stdname[i]+"  "+"with rollno"+stdroll[i]);
    }

}