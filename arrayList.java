import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections; // Import the Collections class

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<String> cars2 = new ArrayList<String>(); // Create an ArrayList object
//        cars2.add("Volvo");
//        cars2.add("BMW");
//        cars2.add("Ford");
//        cars2.add(0,"McLaren");//Insert element at the beginning of the list
//        System.out.println(cars2); // An ArrayList keeps elements in the same order you add them, so the first item you add will be at index 0, the next at index 1, and so on.
//
//        //Access an Element
//        cars2.get(0); // Get the first element
//
//        //Change an Element
//        cars2.set(1,"Marussia");
//
//        //Remove an Element
//        cars2.remove(2);
//        System.out.println(cars2);
//
//        //Remove all Element
//        cars2.clear();
//        System.out.println(cars2);
//
//        //Array List Size
//        System.out.println(cars2.size());

        //Loop through an arraylist
//        ArrayList<String> cars2 = new ArrayList<String>();
//        cars2.add("BMW");
//        cars2.add("Ford");
//        cars2.add("Toyota");
//        for(int i = 0; i < cars2.size(); i++){
//            System.out.println(cars2.get(i));
//        }
//
//        for(String i : cars2){
//            System.out.println(i);
//        }


        //Other Types of ArrayList
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for(int i : myNumbers){
//            System.out.println(i);
//        }

        //Sort an ArrayList
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Toyota");
//        cars.add("BMW");
//        cars.add("Ford");
//        Collections.sort(cars); // sort cars
//        for(String i : cars){
//            System.out.println(i);
//        }

        //Example of sorting an ArrayList of Integers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(65);
        myNumbers.add(45);
        myNumbers.add(33);
        myNumbers.add(23);
        myNumbers.add(8);
        Collections.sort(myNumbers); //Sort myNumbers
        for(int i : myNumbers){
            System.out.println(i);
        }

    }


}
