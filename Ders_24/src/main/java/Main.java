public class Main {

    public static void main(String[] args) {
        findingNumber();
    }

    public static void findingNumber() {
        int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
        int numberToFind = 5;
        boolean isAvailable = false;

        for(int number: numbers) {
            if(number == numberToFind) {
                isAvailable = true;
                break;
            }
        }

        String message = "";
        if(isAvailable) {
            message = " is available in the list.";
            sendMessage(numberToFind, message);
        }else {
            message = " is not available in the list.";
            sendMessage(numberToFind, message);
        }
    }

    public static void sendMessage(int numberToFind, String message) {
        System.out.println(numberToFind + message);
    }
}
