import java.util.*;
import java.lang.*;
public class Task16{
    public static void main(String[] args){
        String words[]=new String[100], words1[]=new String[100], words2[]=new String[100];
        String temp=null,search=null,pal=null,rev=null;
        int n,choice,length,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of words");
        n =sc.nextInt();
        System.out.println("Enter the words");
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        System.out.println("choose the action you want to perform");
        System.out.println("1. Shortest word\n2. Search\n3. Sort\n4. Find Palindrome words");
        choice=sc.nextInt();
        switch(choice){
                        case 1:
                                for(int i=0;i<n;i++){
                                words1[i]=words[i];
                                }
                                for(int i=0;i<n;i++){
                                    for(int j=i+1;j<n;j++){
                                        if(words[i].length()>words[j].length()){
                                            temp=words[i];
                                            words[i]=words[j];
                                            words[j]=temp;
                                        }
                                    }
                                }
                                System.out.println("The shortest word is "+words[0]);
                                break;
                        case 2:
                                System.out.println("Enter the word to be searched :");
                                search=sc.next();
                                for(int i=0;i<n;i++){
                                    if(search.equals(words[i])){
                                        System.out.println("The word is present in the list");
                                    }
                                }
                                System.out.println("The word is not present in the list");
                                break;
                        case 3:
                                for(int i=0;i<n;i++){
                                    for(int j=i+1;j<n;j++){
                                        if(words[i].compareTo(words[j])>0){
                                            temp=words[i];
                                            words[i]=words[j];
                                            words[j]=temp;
                                        }
                                    }
                                }
                                System.out.println("The sorted list is");
                                for(int i=0;i<n;i++){
                                    System.out.println(+(i+1)+" "+words[i]);
                                }
                                break;
                        case 4: 
                                String[] palindrome = new String[100];
                                for(int i=0; i<n; i++){
                                    String str="";
                                    for(int j=words[i].length()-1; j>=0; j--){ 
                                        str = str + words[i].charAt(j); 
                                    }
                                    if(words[i].equals(str)){
                                    count++;
                                    palindrome[i]=str;   
                                }
                        }
                        System.out.println();
                        System.out.println("The number of palindromes in the list: "+count);
                        System.out.println("The palindrome words in the list are: ");
                        if(count>0){
                            for(String i:palindrome){
                                  if(i!=null){   
                                     System.out.println(i);
                                    }
                             }
                        }else{
                        System.out.println("There is no palindrome words in the list.");
                        }
                 
                                break;
                        default:
                                System.out.println("Invalid Choice");
                                break;
                }                        
    }
}
         
