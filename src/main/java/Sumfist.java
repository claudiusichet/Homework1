public class Sumfist {
    public static void main(String[] args) {

        int numbermax = 100;
        int sum = 0;

        for (int i = 1; i <= numbermax; ++i) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}