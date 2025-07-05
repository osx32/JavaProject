//public class thisKeyword {
//    int x;
//
//    public thisKeyword(int x){
//        this.x = x;
//    }
//
//    public static void main(String[] args){
//        thisKeyword obj1 = new thisKeyword(5);
//        thisKeyword obj2 = new thisKeyword(6);
//        System.out.println("Value of x = "+obj1.x);
//        System.out.println("Value of x = "+obj2.x);
//    }
//}

public class thisKeyword {
    int modelYear;
    String modelName;

    public thisKeyword(String modelName){
        this(2020,modelName);
    }

    public thisKeyword(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear + " "+ modelName);
    }

    public static void main(String[] args){
        thisKeyword car1 = new thisKeyword("Corvette C5");
        thisKeyword car2 = new thisKeyword(2023, "Marrusia B2");

        car1.printInfo();
        car2.printInfo();
    }

}
