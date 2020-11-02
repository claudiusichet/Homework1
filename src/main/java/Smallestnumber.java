public class Smallestnumber {
    public static void main(String[] args) {
        int[] sir = new int[]{1234, 98, 245, 235253325, 64364346, 265242465,13451415,235, 1};
        int min = sir[0];
        for (int i = 0; i < sir.length; i++) {
            if (sir[i] < min)
                min = sir[i];
        }
        System.out.println(min);
    }
}

