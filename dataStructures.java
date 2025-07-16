//Import the ArrayList class
import java.util.ArrayList;

//Import the HashSet class
import java.util.HashSet;

//Import the HashMap class
import java.util.HashMap;

//Iterator
import java.util.ArrayList;
import java.util.Iterator;

public class dataStructures {
    //An ArrayList is a resiable array that can grow as needed.
//    public static void main(String[] args){
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Toyota");
//        cars.add("Audi");
//        System.out.println(cars);
//    }

    //A HashSet is a collection where every element is unique - no duplicates are allowed
//    public static void main(String[] args){
//        HashSet<String> cars = new HashSet<String>();
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Toyota");
//        cars.add("Audi");
//        cars.add("BMW");
//        System.out.println(cars);
//    }

//    public static void main(String[] args){
//        //Create a HashMap pbject called capitalCities
//        HashMap<String,String> capitalCities = new HashMap<String, String>();
//
//        //Add keys and values (Country, City)
//        capitalCities.put("Turkiye", "Ankara");
//        capitalCities.put("Japan", "Tokyo");
//        capitalCities.put("Greek", "Athene");
//        System.out.println(capitalCities);
//
//    }


    public static void main(String[] args) {
        //Create an ArrayList of Strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        //Get an iterator for the ArrayList
        Iterator<String> it = cars.iterator();

        //Iterate through the list using the iterator
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


