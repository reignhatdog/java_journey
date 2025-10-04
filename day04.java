//taking user input and using conditional statements//

import java.util.Scanner;
public class day4 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.next();
   
    System.out.println("So your name is " + name);

    System.out.print("What's your favorite food?: ");
    String food = sc.next();

    System.out.println("Me too i love " + food);
    
    
    System.out.print("How old are u?: ");
    int age = sc.nextInt();

    System.out.println("So you are " + age);
     if (age < 13){
        System.out.println("you are still a kid");
    } else if (age <20) {
        System.out.println("you are teenager");
    } else if (age <60) {
        System.out.println("you are an adult");
    } else {
        System.out.println("you are a senior citizen");
    }


    System.out.print("Which movie genre do u like? (horror/romance/action/comedy): ");
    String genre = sc.next();

    System.out.println("So u like: " + genre);

    if(genre.equalsIgnoreCase("horror")){
        System.out.println("ahh, so you're into horror movies huh");
    } else if (genre.equalsIgnoreCase("romance")){
        System.out.println("ahh, so you're into romance huh");
    } else if (genre.equalsIgnoreCase("action")){
        System.out.println("ahh, so you're into action huh");
    }  else if (genre.equalsIgnoreCase("comedy")){
        System.out.println("ahh, so you're into comedy huh");
    } else {
        System.out.println("oh that's interesting choice!");
    }

    

}
   
}
