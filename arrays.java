public class arrays5 {
    public static void main(String[] args) {

        /*
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "Fatih";

        int[] nums = {1,5,63,89,45};
        int x = nums[4];
        System.out.println(x);

        double[] nums2 = {2.0, 3.0};



        String[] cars = {"Volvo","Marussia","Mclaren"};
        System.out.println(cars.length);

        String[] groceries = {"tomato","cheese","honey"};
        for(int i=0;i<groceries.length;i++){
            System.out.println(groceries[i]);
        }


        String[] tech = {"tv","phone","laptop"};
        for(String i: tech){
            System.out.println(i);
        }

        // Create a program that calculates the average of different ages
        int ages[] = {20,22,18,36,52,78,95,46};
        float avg, sum=0;
        int length = ages.length;
        for(int age: ages){
            sum+=age;
        }
        avg = sum/length;
        System.out.println("The average age is: "+avg);

        // Create a program that finds the lowest age among different ages
        int ages2[] = {20,22,18,36,52,78,95,46};
        int length2 = ages2.length;
        int lowestAge = ages2[0];
        for(int age: ages2){
            if(lowestAge>age){
                lowestAge=age;
            }
        }
        System.out.println("The lowest age is: "+lowestAge);

         */
        /*
        //Multidimensional Arrays
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        // To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array.
        // This example accesses the third element (2) in the second array (1) of myNumbers
        int[][] myNumbers2 = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers2[1][2]);

        int[][] myNumbers3 = {{1,2,3,4},{5,6,7}};
        myNumbers3[1][2]=9;
        System.out.println(myNumbers3[1][2]);



        // Loop Through a Multi-Dimensional Array
        int[][] myNumbers4 = {{1,2,3,4},{5,6,7}};
        for(int i=0;i<myNumbers4.length;i++){
            for(int j=0;j<myNumbers4[i].length;j++){
                System.out.print(myNumbers4[i][j]+" ");
            }
        }

         */

        int[][] myNumbers5 = {{1,2,3,4},{5,6,7}};
        for(int[] row:myNumbers5){
            for(int i:row){
                System.out.println(i);
            }
        }

        for(int i = 1; i <= 3; i++){
            for(int j = 1;j <= 3; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

    }

}
