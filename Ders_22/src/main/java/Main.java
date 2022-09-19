public class Main {

    public static void main(String[] args) {
        int[][] list = new int[2][2];
        int number1 = 222;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        list[0][0] = number1;
        list[0][1] = total1;
        list[1][0] = number2;
        list[1][1] = total2;

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < list[i][0]; j++) {
                if(list[i][0] % j == 0) {
                    list[i][1] += j;
                }
            }
        }

        if(list[0][1] == list[1][0] && list[1][1] == list[0][0]) {
            System.out.println(number1 + " and " + number2 + " are friend numbers!");
        }else {
            System.out.println(number1 + " and " + number2 + " are not friend numbers!");

        }

    }
}
