package code013;

public class FindDiv {
    public static void main(String[] args) {
        int a = 35;
        int b = 9;
        for (int i = 0; i < 100; i++) {
            if (a % b == 0) {
                System.out.println(a + "可以整除" + b + ",商是" + (a / b));
            }
            a++;
        }
    }
}
