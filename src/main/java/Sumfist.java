public class Sumfist{
    int numbermax = 100;
    public static void main(String[] args) {

    int numbermax = 100, sum = 0;

    for(int i = 1; i <= numbermax; ++i)
    {
        sum += i;
    }

    System.out.println("Sum = " + sum);
}
}