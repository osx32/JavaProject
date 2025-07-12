class Zoo{
    Zoo(){
        System.out.println("Animal is created");
    }
}

class Cat extends Zoo{
    Cat(){
        super();
        System.out.println("Dog is created");
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Cat myCat = new Cat();
    }
}



//class Zoo{
//    String type = "Animal";
//}
//
//class Cat extends Zoo{
//    String type = "Cat";
//    public void printType(){
//        System.out.println(super.type); // Access parent attribute
//    }
//}
//
//public class superKeyword {
//    public static void main(String[] args) {
//        Cat myDog = new Cat();
//        myDog.printType();
//    }
//}



//class Zoo {
//    public void animalSound(){
//        System.out.println("The animal make a sound");
//    }
//}
//
//class Cat extends Zoo{
//    public void animalSound(){
//        super.animalSound();
//        System.out.println("The dog says: hav hav");
//    }
//}
//
//public class superKeyword {
//    public static void main(String[] args){
//        Cat myDog = new Cat();
//        myDog.animalSound();
//    }
//}