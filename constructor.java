//public class constructor {
//    //int x;
//    int x;
//
//    public constructor(int y){
//        //x = 5;
//        x=y;
//    }
//
//    public static void main(String[] args){
//        //constructor obj1 = new constructor();
//        //System.out.println(obj1.x);
//        constructor obj2 = new constructor(6);
//        System.out.println(obj2.x);
//
//    }
//}

public class constructor{
    int modelYear;
    String modelName;

    public constructor(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        constructor myCar = new constructor(1975, "Shelby");
        System.out.println(myCar.modelYear+ " " +myCar.modelName);
    }
}
