//class Outer_Demo{
//    int num;
//
//    //inner class
//    private class Inner_Demo{
//        public void print(){
//            System.out.println("This is an inner class");
//        }
//    }
//
//    //Accessing the inner class from the method within
//    void display_Inner(){
//        Inner_Demo inner = new Inner_Demo();
//        inner.print();
//    }
//}
//
//public class innerClass{
//    public static void main(String[] args){
//        //Instantiating the outer class
//        Outer_Demo outer = new Outer_Demo();
//        outer.display_Inner();
//    }
//}


// Accessing the private members using inner class
//class Outer_Demo{
//    //private variable of the outer class
//    private int num = 175;
//
//    //inner class
//    public class Inner_Demo{
//        public int getNum() {
//            System.out.println("This is the getnum method of the inner class");
//
//            return num;
//        }
//    }
//}
//
//public class innerClass{
//    public static void main(String[] args){
//        //Instantiating the outer class
//        Outer_Demo outer = new Outer_Demo();
//
//        //Instantiating the inner class
//        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
//        System.out.println(inner.getNum());
//    }
//}



// Method-local Inner Class
public class innerClass {
    //instance method of the outer class
    void my_Method(){
        int num = 23;

        //method-local inner class
        class MethodInner_Demo{
            public void print(){
                System.out.println("This is method inner class "+num);
            }
        }// end of inner class


        //Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }
    public static void main(String[] args){
        innerClass outer = new innerClass();
        outer.my_Method();
    }
}