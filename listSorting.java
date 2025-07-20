import java.util.ArrayList;
import java.util.Collections;

public class listSorting {
    public static void main(String[] args) {
        //String sorting
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("BMW");
//        cars.add("Chevrolete");
//        cars.add("BMW");
//        cars.add("Mazda");
//        Collections.sort(cars); //Sort cars
//        for(String i : cars){
//            System.out.println(i);
//        }

        //Integer sorting
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(23);
//        myNumbers.add(8);
//        myNumbers.add(55);
//        myNumbers.add(3);
//        Collections.sort(myNumbers);
//        System.out.println(myNumbers);

        //Reverse the Order String
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("BMW");
//        cars.add("Chevrolete");
//        cars.add("Mazda");
//        cars.add("Bugatti");
//        Collections.sort(cars,Collections.reverseOrder()); //Sort cars
//        for(String i: cars){
//            System.out.println(i);
//        }

        //Reverse the Order Integer
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(8);
        myNumbers.add(65);
        Collections.sort(myNumbers,Collections.reverseOrder());
        for(int i : myNumbers){
            System.out.println(i);
        }


    }
}
