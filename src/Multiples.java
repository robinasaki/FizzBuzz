public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0){
                counter = counter + 1;
            }
            else if (i % 5 == 0) {
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}