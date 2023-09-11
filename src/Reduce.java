public class Reduce {
    public static void main(String[] args) {
        reduce(100);
    }

    private static void reduce(int n) {
        int counter = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
                counter = counter + 1;
            }
            else {
                n = n - 1;
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}
