public class publicAndStaticMehods {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public publicAndStaticMehods(){
        myPublicMethod();
    }

    //Main method
    public static void main(String[] args){
        myStaticMethod(); // call the static method
        //myPublicMethod(); this would compile an error

        publicAndStaticMehods myObj = new publicAndStaticMehods(); // create an object of publicAndStaticMethods
        myObj.myPublicMethod();

    }
}
