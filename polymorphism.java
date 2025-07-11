public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal mySheep = new Sheep();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        mySheep.animalSound();
        myDog.animalSound();
    }
}

class Animal {
    public void animalSound(){
        System.out.println("The animal make a sound");
    }
}

class Sheep extends Animal{
    public void animalSound(){
        System.out.println("The sheep says: meeee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: hav hav");
    }
}

