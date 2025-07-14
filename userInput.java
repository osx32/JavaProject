import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner myObj1 = new Scanner(System.in);

        System.out.println("Enter name, age and salary: ");

        //String input
        String name = myObj1.nextLine();

        //Numerical input
        int age = myObj1.nextInt();
        double salary = myObj1.nextDouble();

        //Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
