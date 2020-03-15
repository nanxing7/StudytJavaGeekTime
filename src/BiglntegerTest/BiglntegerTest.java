package BiglntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

public class BiglntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How man numbers do you need to draw?|您需要画多少个数字？");
        int k = in.nextInt();

        System.out.print("what is the highest number you can draw?|您可以画出的最高数字是多少？");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - 1 + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("You odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
