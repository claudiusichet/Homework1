public class Digit {
    public static void main(String[] args) {
        int n = 6831;
        int max = 0;

        if (n > 0) {
            while (n > 0) {
                int digit = n % 10;

                max = Math.max(max, digit);

                n /= 10;
            }

        }

        System.out.println(max);
    }
}

