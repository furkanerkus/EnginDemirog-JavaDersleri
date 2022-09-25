public class Main {

    public static void main(String[] args) {
        String message = "Today, the weather is very nice.";
        String newMessage = getCity();
        System.out.println(newMessage);
        int summation = sum(5, 7);
        System.out.println(summation);
    }

    public static void addCustomer() {
        System.out.println("Added");
    }

    public static void deleteCustomer() {
        System.out.println("Deleted");
    }

    public static void updateCustomer() {
        System.out.println("Updated");
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static String getCity() {
        return "Ankara";
    }
}
