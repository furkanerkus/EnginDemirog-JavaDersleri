public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
        int numberToFind = 3;
        boolean isAvailable = false;

        for(int number: numbers) {
            if(number == numberToFind) {
                isAvailable = true;
                break;
            }
        }

        if(isAvailable) {
            System.out.println(numberToFind + " is available in the numbers list.");
        }else {
            System.out.println(numberToFind + " is not available in the numbers list.");
        }
    }
}
