package code19;

public class Example {
    public static void main(String[] args) {
        // 每门成绩对应的索引
        int YuWen = 0;
        int ShuXue = 1;
        int WaiYu = 2;
        int WuLi = 3;
        int HuaXue = 4;
        int ShengWu = 5;

        int totalScoreCount = 6;
        double[] scores = new double[totalScoreCount];

        String[] scoreNames = new String[totalScoreCount];
        scoreNames[YuWen] = "语文";
        scoreNames[ShuXue] = "数学";
        scoreNames[WaiYu] = "外语";
        scoreNames[WuLi] = "物理";
        scoreNames[HuaXue] = "化学";
        scoreNames[ShengWu] = "生物";

        for (int i = 0; i < totalScoreCount; i++) {
            scores[i] = 80 + Math.random() * 20; //赋予数组，一个随机生成一个80-100之间的数值
            System.out.println(scoreNames[i] + "的成绩是：" + scores[i]);
        }

        double maxScore = 0;
        int maxScoreIndex = -1;

        for (int i = 0; i < totalScoreCount; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        System.out.println("最好成绩科目为" + scoreNames[maxScoreIndex] + ":" + maxScore);

    }
}
