public class conditionsAndBooleans2 {
    public static void main(String[] args) {
        int x = 6;
        int y = 23;
        int z = 10;

        boolean compare = !(false);
        System.out.println(compare);

        boolean compare2 = (x < y && y > z) || (z + 2 <5 || x + 7 > y);
        System.out.println(compare2);
    }
}
