public class accessMethodsWithAnObject {
    public void fullThrottle(){
        System.out.println("The car is going as fast it can");
    }

    //Create a speed() method and add a parameter
    public void speed(int speed){
        System.out.println("Max speed is: "+speed);
    }

    //Inside main call the methods on the mycar object
    public static void main(String[] args){
        accessMethodsWithAnObject myCar = new accessMethodsWithAnObject();
        myCar.fullThrottle();
        myCar.speed(300);
    }

}
