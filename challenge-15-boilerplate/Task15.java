import java.util.*;
import java.lang.*;
public class Task15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of robberers");
        int noofrobberers=sc.nextInt();
        System.out.println("Enter the robberer with whom sam will start shooting");
        int start=sc.nextInt();
        System.out.println("Enter the gap between the robberers");
        int gap=sc.nextInt();
        int robberer= start;
        boolean[] robberers=new boolean[noofrobberers];
        int deathcount= 0;
        while(deathcount<noofrobberers && start<noofrobberers){
            System.out.println("Target: "+robberer+", "+(deathcount+1)+" shot completed");
            int robbererpos = robberer-1;
            robberers[robbererpos] = true;
            deathcount++;
            int gapcount = 0;
            while(gapcount<=gap){
                if(robberer>=noofrobberers){
                    robberer=0;
                }
                if(robberers[robberer]==false){
                    gapcount++;
                }
                robberer++;
            }
        }
    }
    
}
