import java.util.*;
public class details{ 
    static String stdname[]=new String[100];
            static String stdroll[]=new String[100];
            static float maths[]=new float[100], science[]=new float[100], english[]=new float[100], language[]=new float[100], socialstudies[]=new float[100], total[]=new float[100], totalmarks[]=new float[100],avg[]=new float[100];
            static float total1=0,total2=0,total3=0,total4=0,total5=0,ave1=0,ave2=0,ave3=0,ave4=0,ave5=0;
            static char grade[]=new char[100], grades[]=new char[100];
            static int i,n,j,k;
            static Scanner sc=new Scanner(System.in);
            public static int acceptsize(){
            System.out.println("Enter number of sudents:");
            n=sc.nextInt();
            return n;
            }
            public static String[] acceptnames(){
                System.out.println("Enter students names");
                for(i=0;i<n;i++){
                    stdname[i]=sc.next();
                }
                return stdname;
            }
            public static String[] rollno(){
                System.out.println("Enter students roll numbers");
                for(i=0;i<n;i++){
                    stdroll[i]=sc.next();
                }
                return stdroll;
            }
            public static float[] maths(){
                System.out.println("Enter students maths marks");
                for(i=0;i<n;i++){
                    maths[i]=sc.nextFloat();
                }
                return maths;
            }
            public static float[] science(){
                System.out.println("Enter students science marks");
                for(i=0;i<n;i++){
                    science[i]=sc.nextFloat();
                }
                return science;
            }
            public static float[] english(){
                System.out.println("Enter students english marks");
                for(i=0;i<n;i++){
                    english[i]=sc.nextFloat();
                }
                return english;
            }
            public static float[] language(){   
                System.out.println("Enter students language marks");
                for(i=0;i<n;i++){
                    language[i]=sc.nextFloat();
                }
                return language;
            }
            public static float[] socialstudies(){
                System.out.println("Enter students social studies");
                for(i=0;i<n;i++){
                    socialstudies[i]=sc.nextFloat();
                }
                return socialstudies;
            }
            public static float[] total(){
                for(i=0;i<n;i++){
                    total[i]=(maths[i]+science[i]+english[i]+language[i]+socialstudies[i]);
                    totalmarks[i]=total[i];
                }
                return total;
            }
            public static void subavg(){
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
            }
            public static float[] avg(){
                for(i=0;i<n;i++){
                    avg[i]=(total[i]/5);
                }
                return avg;           
            }
            public static void topscorer(){
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
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
            public static void passorfail(){
             int k=0;
            while(k<n){
                if(maths[k]>=35&&science[k]>=35&&english[k]>=35&&language[k]>=35&&socialstudies[k]>=35){
                    System.out.println("The student "+stdname[k]+" with rollno "+stdroll[k]+" has cleared the examination");
                }
                else{
                    System.out.println("The student "+stdname[k]+" with rollno "+stdroll[k]+" has to repeat the examination");
                }
                k++;
            }
            }
            public static char[] grade(){
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
            }
                for(i=0;i<n;i++){
                    grades[i]=grade[i];
                }
                return grade;
            }
            public static void displayresults(){
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
            public static void histogram(){
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
            for(k=1; k<n+3; k++){
                System.out.print("___");
            }
            System.out.println();
            for(k=0; k<=n; k++){
                if(k==0){
                    System.out.print("       ");
                }else{
                System.out.print(k+"  ");
                }
            }
            System.out.println();
        }
}
