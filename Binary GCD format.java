import java.util.Scanner;

public class Main {
    static int binaryGCD(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        if ((a & 1) == 0 && (b & 1) == 0) {
            return binaryGCD(a >> 1, b >> 1) << 1;
        }

        if ((a & 1) == 0) {
            return binaryGCD(a >> 1, b);
        }

        if ((b & 1) == 0) {
            return binaryGCD(a, b >> 1);
        }

        if (a > b) {
            return binaryGCD((a - b) >> 1, b);
        } else {
            return binaryGCD(a, (b - a) >> 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(binaryGCD(A, B));
        sc.close();
    }
}
