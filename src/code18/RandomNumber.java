package code18;

public class RandomNumber {
    public static void main(String[] args) {
        double randNum = 0;

        // 要生成一个大于0.5的随机数，只有随机数大于0.5，循环才会退出
        while (randNum < 0.5) {
            // 使用Java中的Math.random(),生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }

        System.out.println("生成的大于0.5的随机数是" + randNum);

        int rangeStart = 30;
        int rangeEnd = 50;

        // mod 开始与结束的范围
        int mod = rangeEnd - rangeStart;

        if (rangeStart < 0 || rangeEnd < 0) {
            System.out.println("开始和结束必须是正数");
        }

        if (mod < 1) {
            System.out.println("非法的数字范围：(" + rangeStart + ", " + rangeEnd + ")");
        }

        for (int i = 0; i < 50; i++) {

            // 计算最大的随机数
            int bigRandom = (int) (Math.random() * rangeEnd * 100);
            //
            int numberToGues = bigRandom % mod + rangeStart;

            if (numberToGues <= rangeStart) {
                numberToGues = rangeStart + 1;
            } else if (numberToGues > rangeEnd) {
                numberToGues = rangeEnd - 1;
            }

            System.out.println("mod=" + mod + ", numberToGues=" + numberToGues);
        }
    }
}
