public class Main {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        if(sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("En büyük sayı : " + sayi1);
        } else if(sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println("En büyük sayı : " + sayi2);
        } else {
            System.out.println("En büyük sayı : " + sayi3);
        }

        // Video çözümü
        int enBuyuk = sayi1;

        if(enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }

        if(enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı : " + enBuyuk);

    }
}
