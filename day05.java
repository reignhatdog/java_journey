//grading system//

import java.util.Scanner;
public class day5{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Grade on filipino: ");
        double f = sc.nextDouble();

        System.out.print("Grade on math: ");
        double m = sc.nextDouble();

        System.out.print("Grade on english: ");
        double e = sc.nextDouble();

        double Average = (f+m+e) /3;

        System.out.println("\n----result----");
        System.out.println("Student: "+ name);
        System.out.println("Average: "+ Average);

        if ( Average >=90){
            System.out.println("Remarks: god level");
            System.out.println("Status:  passed");
        } else if (Average >=80) {
            System.out.println("Remarks: mythic");
            System.out.println("Status: Passed");
        } else if (Average >=75) {
            System.out.println("Remarks: legend");
            System.out.println("Status: Passed");
        } else {
            System.out.println("Remarks: epic");
            System.out.println("Remarks: failed");
        }


sc.close();
    }
}
