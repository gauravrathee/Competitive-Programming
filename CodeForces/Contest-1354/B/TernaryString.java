import java.io.*;

public class CF_1354_B {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s = br.readLine();
            int one = -1, two = -1, three = -1;
            int n = s.length();
            boolean possible = false;
            int minLength = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    one = i;
                } else if (s.charAt(i) == '2') {
                    two = i;
                } else {
                    three = i;
                }

                if (one >= 0 && two >= 0 && three >= 0) {
                    possible = true;
                    minLength = Math.min(minLength, getLengthSubstring(one, two, three));
                }
            }
            if (possible) {
                System.out.println(minLength);
            } else {
                System.out.println(0);
            }
        }
    }

    static int getLengthSubstring(int a, int b, int c) {
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return max - min + 1;
    }
}
