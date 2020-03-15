package code013;

public class Example {
    public static void main(String[] args) {
        int a = 99;
        int b = 99;
        int c = 99;

        if (a == b && b == c) {
            System.out.println("a,b,c等大,大小为" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a是最大的值，为" + a);
                } else {
                    if (a == c) {
                        System.out.println("a和c是最大的值，为" + a);
                    } else {
                        System.out.println("c是最大的值，为" + c);
                    }
                }
            } else {
                if (b > c) {
                    if (a == b) {
                        System.out.println("a和b是最大的值，为" + a);
                    } else {
                        System.out.println("b是最大的值，为" + b);
                    }
                } else {
                    if (c == b) {
                        System.out.println("b和c是最大的值，为" + c);
                    } else {
                        System.out.println("c是最大的值,为" + c);
                    }
                }
            }
        }

    }
}
