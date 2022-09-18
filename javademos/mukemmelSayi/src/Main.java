public class Main {
    public static void main(String[] args) {
        int number = 7;
        for (int j = 3; j < 10000; j++) {
            number = j;
            boolean sayiMukemmel = false;
            int aggregator = 1;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    aggregator = aggregator + i;
                }
            }
            if (aggregator == number) {
                sayiMukemmel = true;
                System.out.println(number + " Mükemmel sayıdır.");
            }
              //else {  System.out.println(number + " Mükemmel sayı değildir.");}

        }
    }
}