package code022;

import java.util.Scanner;

public class ScoreMaster {
    public static void main(String[] args) {

        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        int totalScoreCount = 6;

        String[] scoreNames = new String[totalScoreCount];
        scoreNames[YuWenIndex] = "语文";
        scoreNames[ShuXueIndex] = "数学";
        scoreNames[WaiYuIndex] = "外语";
        scoreNames[WuLiIndex] = "物理";
        scoreNames[HuaXueIndex] = "化学";
        scoreNames[ShengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];
        for (int i = 0; i < yearCount; i++) {

            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
                System.out.println("第" + (i + 1) + "年" + scoreNames[j] + "成绩为" + scores[i][j]);
            }
        }

        boolean cont = true;
        while (cont) {
            System.out.println("请输入要进行的操作编号");
            System.out.println("1：求某年最好的成绩\n" + "2：求某年的平均成绩\n" +
                    "3：求所有年份最好的成绩\n" + "4：求某门课历年最好的成绩\n");

            int operId = scanner.nextInt();

            int year = 0;

            switch (operId) {
                case 1:
                    System.out.println("请输入要求哪一年最好成绩");
                    year = scanner.nextInt() - 1;
                    if (year < 0 || year > +yearCount) {
                        System.out.println("非法的年份");
                        break;
                    }
                    int bestOfYearScoreId = 0;
                    for (int i = 0; i < scores[year].length; i++) {
                        if (scores[year][bestOfYearScoreId] < scores[year][i]) {
                            bestOfYearScoreId = i;
                        }
                    }
                    System.out.println("第" + (year + 1) + "年最好成绩为" + scoreNames[bestOfYearScoreId] + ":" + scores[year][bestOfYearScoreId]);
                    break;
                case 2:
                    System.out.println("请输入要求哪一年最好成绩");
                    year = scanner.nextInt() - 1;
                    if (year < 0 || year > +yearCount) {
                        System.out.println("非法的年份");
                        break;
                    }
                    double totalScore = 0;
                    for (int i = 0; i < scores[year].length; i++) {
                        totalScore += scores[year][i];
                    }
                    System.out.println("第" + (year + 1) + "年平均成绩为" + (totalScore / scoreNames.length));
                    break;
                case 3:
                    int bestOfYearsScoreId = 0;
                    year = 0;
                    for (int i = 0; i < scores.length; i++) {
                        for (int j = 0; j < scores[i].length; j++) {
                            if (scores[year][bestOfYearsScoreId] < scores[i][j]) {
                                year = i;
                                bestOfYearsScoreId = j;
                            }
                        }
                    }
                    System.out.println("历年最好成绩为第" + (year + 1) + "年的" + scoreNames[bestOfYearsScoreId] + ":" + scores[year][bestOfYearsScoreId]);
                    break;
                case 4:
                    System.out.println("请问要查询哪门课的历年最好成绩：");
                    int scoreId = scanner.nextInt() - 1;
                    year = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[year][scoreId] < scores[i][scoreId]) {
                            year = i;
                        }
                    }
                    System.out.println(scoreNames[scoreId] + "历年最好成绩为第" + (year + 1) + "年，成绩为：" + scores[year][scoreId]);
                    break;
                default:
                    cont = false;
            }
        }
    }
}
