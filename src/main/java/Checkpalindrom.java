public class Checkpalindrom {
    public static void main(String[] args) {

        int num = 12221;
        int reversedInteger = 0;
        int rest;
        int originalInteger;

        originalInteger = num;

        while (num != 0) {
            rest = num % 10;
            reversedInteger = reversedInteger * 10 + rest;
            num /= 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " palindrom!");
        else
            System.out.println(originalInteger + " not palindrom!");
    }
}