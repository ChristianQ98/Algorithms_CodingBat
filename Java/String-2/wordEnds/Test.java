public class Test {
    public static void main(String[] args) {
        Solution test1 = new Solution();
        Solution test2 = new Solution();
        Solution test3 = new Solution();
        Solution test4 = new Solution();

        System.out.println(test1.wordEnds("abcXY123XYijk", "XY"));
        System.out.println(test2.wordEnds("XY123XY", "XY"));
        System.out.println(test3.wordEnds("XY1XY", "XY"));
        System.out.println(test4.wordEnds("abc1xyz1i1j", "1"));
    }
}