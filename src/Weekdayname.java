/*The program returns the number of the week.*/
import java.util.Scanner;
public class Weekdayname {
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int i = 0;
        while (true){
        System.out.println("Enter the weekday number");
        i = s.nextInt();
            if (i == 1) {
                System.out.println("Sunday");
            } else if (i == 2) {
                System.out.println("Monday");
            } else if (i == 3) {
                System.out.println("Tuesday");
            } else if (i == 4) {
                System.out.println("Wednesday");
            } else if (i == 5) {
                System.out.println("Thursday");
            } else if (i == 6) {
                System.out.println("Friday");
            } else if (i == 7) {
                System.out.println("Saturday");
            } else {
                System.out.println("Please enter numbers  1-7");
            }
        }
    }
}
