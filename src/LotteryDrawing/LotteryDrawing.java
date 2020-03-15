package LotteryDrawing;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How man numbers do you need to draw?|您需要画多少个数字？");
        int k = in.nextInt();

        System.out.print("what is the highest number you can draw?|您可以画出的最高数字是多少？");
        int n = in.nextInt();

        // fill an array with numbers 1 2 3 ... n
        // 用数字 1 2 3 ... n 填充数组
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // draw k numbers and put them into a second array
        // 画出k个数字并将其放入第二个数组
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // make a random index between 0 and n - 1
            // 在 0 到 n - 1 之间建立随机索引
            int r = (int) (Math.random() * n);

            // pick the element at the random location
            // 在随机的位置选择元素
            result[i] = numbers[r];

            // move the last element into the random location
            // 将最后一个元素移动到随机位置
            numbers[r] = numbers[n - 1];
            n--;
        }

        // print the sorted array
        // 打印已排序的数组
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make your rich!|赌下列组合。这会让你发财的!");
        for (int r : result) {
            System.out.println(r);
        }

    }

}
