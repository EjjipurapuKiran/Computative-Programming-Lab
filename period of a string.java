import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int p = S.length();

        for (int i = 1; i <= S.length(); i++) {
            boolean flag = true;

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) != S.charAt(j % i)) {
                    flag = false;
                }
            }

            if (flag) {
                p = i;
                break;
            }
        }

        System.out.println(p);
    }
}
