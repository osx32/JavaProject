import java.util.Scanner;
public class ifElseIf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("tim")){
            System.out.println("tim");
        }
        else if(s.equals("hello")){
            System.out.println("hello");
        }
        else if(s.equals("hi")){
            System.out.println("hi");
        }
        else{
            System.out.println("Print");
        }
    }
}
