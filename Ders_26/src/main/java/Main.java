public class Main {

    public static void main(String[] args) {
        int summation = sum(5, 7);
        System.out.println(summation);
        int summation2 = sum2(1,2,3,4,5,6,7,8,9);
        System.out.println(summation2);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum2(int... numbers) {
        int summation = 0;
        for(int number:numbers) {
            summation += number;
        }
        return summation;
    }



}
