//interface Animal3{
//    public void animalSound();  //interface method (does not have a body)
//    public void sleep();  //interface method (does not have a body)
//}
//
////Lion "implements" the Animal3 interface
//class Lion implements Animal3{
//    public void animalSound(){
//        //The body of animalSound() is provided here
//        System.out.println("The Lion says: rooahh");
//    }
//
//    public void sleep(){
//        //The body of sleep() is provided here
//        System.out.println("Zzzz");
//    }
//}
//
//public class interfaces {
//    public static void main(String[] args){
//        Lion myLion = new Lion();  //Create a lion object
//        myLion.animalSound();
//        myLion.sleep();
//    }
//}


//Multiple Interfaces
interface FirstInterface{
    public void myMethod(); // interface method
}

interface SeconInterface{
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SeconInterface{
    public void myMethod(){
        System.out.println("Hello World 1");
    }

    public void myOtherMethod(){
        System.out.println("Hello World 2");
    }
}

class interfaces{
    public static void main(String[] args){
        DemoClass myObj1 = new DemoClass();
        myObj1.myMethod();
        myObj1.myOtherMethod();
    }
}