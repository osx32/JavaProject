/*
public class classAttributes {
    //final int x = 10;
    int x = 10;


    public static void main(String[] args){
        classAttributes myObj1 = new classAttributes();
        classAttributes myObj2 = new classAttributes();
        myObj1.x = 40;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
*/
public class classAttributes {
    String fname = "Fatih";
    String lname = "Yıldız";
    int age = 24;

    public static void main(String[] args){
        classAttributes obj1 = new classAttributes();
        System.out.println("Name: "+obj1.fname+" "+obj1.lname);
        System.out.println("Age: "+obj1.age);
    }

}
