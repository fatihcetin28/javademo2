public class Main {
    public static void main(String[] args) {
        int number = 284;
        //for (int j = 3; j < 1000; j++) {
            //number = j;
            boolean sayiMukemmel = false;
            int aggregator = 1;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    aggregator = aggregator + i;
                }
            }
        System.out.println(aggregator);
        //}
    }
}