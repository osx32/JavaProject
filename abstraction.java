abstract class Animal2 {
    //Abstract method (does not have a body)
    public abstract void animalSound();
        //Regular method
    public void sleep(){
        System.out.println("Zzzz");
    }
}

//Subclass (inherit from abstraction)
class Sheep2 extends Animal2{
    public void animalSound(){
        //The body of animalSound() is provided here
        System.out.println("Sheep says: Meeee");
    }
}

class abstraction{
    public static void main(String[] args){
        Sheep2 mySheep = new Sheep2(); // Create a Sheep object
        mySheep.animalSound();
        mySheep.sleep();
    }
}