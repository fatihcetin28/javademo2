public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 3;
        int counter=0;

        for (int sayi:sayilar
             ) {
                if(sayi==aranacak){
                    System.out.println("Sayı dizide var");
                    counter=counter+1;
                    break;
                }
        }
        if(counter==0){
            System.out.println("Sayı dizide yok.");
        }
    }
}