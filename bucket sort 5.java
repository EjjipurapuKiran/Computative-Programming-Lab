import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            float x = sc.nextFloat();

            int idx = (int)(x * n);

            if (idx >= n)
                idx = n - 1;

            buckets[idx].add(x);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (float x : buckets[i]) {

                if (x == (int)x)
                    sb.append((int)x).append(" ");
                else
                    sb.append(String.format("%.2f", x)).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
    }
}
