public class methodScope {
    public static void main(String[] args) {
        /*
        //Code here cannot use x
        { // this is a block
            //Code here cannot use x
            int x = 100;
            //code here can use x
            System.out.println(x);
        }//the block ends here
        //code here cannot use x
        */

        /*
        //Recursion
        int result = sum(10);
        System.out.println(result);
        */
        int result = sum(5,10);
        System.out.println(result);
    }
    /*
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }
    }
    */
    public static int sum(int start, int end){
        if(end>start){
            return end+sum(start,end-1);
        }
        else{
            return end;
        }
    }
}
