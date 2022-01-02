package sleepIn;

public class Test {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();

        System.out.println(test1.sleepIn(false, false));
        System.out.println(test2.sleepIn(true, false));
        System.out.println(test3.sleepIn(false, true));
    }
}
