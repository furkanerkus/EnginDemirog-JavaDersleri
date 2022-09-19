public class Main {

    public static void main(String[] args) {
        char letter = 'p';
        letter = Character.toUpperCase(letter);
        char[] backLetters = {'A', 'I', 'O', 'U'};
        char[] frontLetters = {'E', 'İ', 'Ü', 'Ö'};

        for (char backLetter : backLetters) {
            if(backLetter == letter) {
                System.out.println(letter + " is a back letter.");
                return;
            }
        }
        for (char frontLetter : frontLetters) {
            if(frontLetter == letter) {
                System.out.println(letter + " is a front letter.");
                return;
            }
        }
        System.out.println(letter + " is not a vowel.");



    }
}
