public class methods6 {
    public static void main(String[] args) {
        /*
        myMethod();
        myMethod();
        myMethod();
        nameMethod("Fatih");
        nameMethod("Atilla");
        nameAndAge("Mehmet",35);
        nameAndAge("Yıldırım",25);
        checkAge(19);
        System.out.println(returnNumber(3));
        System.out.println(sumTwoNumber(2,5));
        int z = sum(5,3);
        System.out.println(z);
         */
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.3,6.26);
        System.out.println("int: "+myNum1);
        System.out.println("double: "+myNum2);

    }

    static int plusMethod(int x, int y){
        return x+y;
    }

    static double plusMethod(double x, double y){
        return x+y;
    }

    /*
    static int sum(int x,int y){
        return x+y;
    }


    static int returnNumber(int x){
        return 5+x;
    }

    static int sumTwoNumber(int x, int y){
        return x+y;
    }

    static void myMethod(){
        System.out.println("I just executed");
    }

    static void nameMethod(String fname){
        System.out.println(fname+" Star");
    }

    static void nameAndAge(String name, int age){
        System.out.println(name+" is "+age);
    }

    static void checkAge(int age){
        if(age<18){
            System.out.println("Access denied - You are not old enough");
        }
        else{
            System.out.println("Access granted - You are old enough");
        }
    }

     */
}
