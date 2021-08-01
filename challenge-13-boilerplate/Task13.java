import java.util.*;
import java.lang.*;
public class Task13{
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
            avg[i]=(total[i]/5);
            System.out.println("The student with name "+stdname[i]+" has scored a total of "+total[i]+" and average of "+avg[i]);
        }
        for(j=0;j<n;j++){
        if(avg[j]>=90){
            grade[j]='A';
        }
        else if(avg[j]>=80 && avg[j]<90){
            grade[j]='B';
        }
        else if(avg[j]>=70 && avg[j]<80){
            grade[j]='c';
        }
        else if(avg[j]>=60 && avg[j]<70){
            grade[j]='D';
        }
        else if(avg[j]>=50 && avg[j]<60){
            grade[j]='E';
        }
        else if(avg[j]<50){
            grade[j]='F';
        }
        for(i=0;i<n;i++){
            grades[i]=grade[i];
        }
        Arrays.sort(grades);
    }
        for(i=0;i<n;i++){
            System.out.println("  Score Card  ");
            System.out.println("Name "+stdname[i]);
            System.out.println("Roll no "+stdroll[i]);
            System.out.println("Maths score "+maths[i]);
            System.out.println("Science score "+science[i]);
            System.out.println("Language score "+language[i]);
            System.out.println("Social Studies score "+socialstudies[i]);
            System.out.println("Total marks obtained "+total[i]);
            System.out.println("Grades Achieved "+grade[i]);
        }
    }
}
