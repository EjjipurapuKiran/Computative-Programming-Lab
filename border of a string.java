import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String l_border = "";

        for (int i = 1; i < S.length(); i++) {
            String k = S.substring(0, i);
            String m = S.substring(S.length() - i);

            if (k.equals(m)) {
                if (k.length() > l_border.length())
                    l_border = k;
            }
        }

        System.out.println(l_border);
    }
}
