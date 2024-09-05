package Placement_training;
import java.util.Scanner;
public class leap_year {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        
        int year = in.nextInt();
        int month = in.nextInt();
        
        if(year>=1900 && year<=9999 && month>=1 && month<=12){
        
        int leap = 0;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = 1;
                else
                    leap = 0;
            }
            else
                leap = 1;
        }
        else
            leap = 0;
        
        if(leap==1){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                System.out.println("31 Days");
            else if(month==4||month==6||month==9||month==11)
                System.out.println("30 Days");
            else
                System.out.println("29 Days");
        }
        else{
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                System.out.println("31 Days");
            else if(month==4||month==6||month==9||month==11)
                System.out.println("30 Days");
            else
                System.out.println("28 Days");
        }
        }
        else{
            System.out.println("0");
        }
      in.close();  
    }
}
	


