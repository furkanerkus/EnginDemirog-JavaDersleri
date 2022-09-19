public class Main {

    public static void main(String[] args) {
        int number = 1;
        boolean isPrimeNumber = true;

        if(number < 1) {
            System.out.println(number + " is not valid!");
        } else if (number == 1) {
            System.out.println(number + " is not a prime number!");

        }else {
            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            System.out.println(number + (isPrimeNumber ? " is not a prime number!" : " is a prime number!"));
        }

    }
}
