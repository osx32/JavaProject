public class inheritance {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tutt, Tuuuuut");
    }
}

class Car extends inheritance{
    private String modelName = "Mustang";
    public static void main(String[] args){
        //Create a myCar object
        Car myCar = new Car();

        //Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        //Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand+ "" + myCar.modelName);
    }
}