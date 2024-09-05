package Placement_training;
import java.util.Scanner;

public class cricket {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int balls = 300;
        int target = 375;
        int runs = 78;
        int balls_over = 45;
        
        double total_over = balls / 6;
        
        double over = balls_over/6;    
        double over_rem= (balls_over%6);
        over_rem = over_rem/10;
        over = Math.floor(over) + over_rem; 
        
        double run_rate = runs / over;
        double tot_run_rate = target / total_over; 
        
        System.out.println(total_over);
        System.out.println(over);
        System.out.println(run_rate);
        System.out.println(tot_run_rate);
        
        if(tot_run_rate > run_rate) System.out.println("Not Eligible to Win");
            else System.out.println("Eligible to Win");
        
        in.close();

}}
