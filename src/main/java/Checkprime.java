public class Checkprime {
    public static void main(String[] args) {
        int i = 0;
        int start = 7;
        String primeNumbers = "";

        for (i = 0; i < start; i++) {
            int counter = 0;
            int num = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime number(s) lower than start is (are) : " + primeNumbers);
    }
}