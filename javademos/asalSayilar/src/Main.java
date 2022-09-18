public class Main {
    public static void main(String[] args) {

        int number = 2;
        int counter = 0;
        for(int i=2;i<number; i++){
            int remainder= number % i;
            if(remainder==0){
                counter = counter+1;
            }
        }
        if(counter==0){
            System.out.println(number +" Bir asal sayı.");
        }else{
            System.out.println(number +" Bir asal sayı değil.");
        }
    }
}