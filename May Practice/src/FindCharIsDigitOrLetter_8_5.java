public class FindCharIsDigitOrLetter_8_5 {
    public static void main(String[] args) {
        char ch='#';
        if(Character.isDigit(ch)) System.out.println("is digit");
        else if (Character.isLetter(ch)) System.out.println("is leter");
        else System.out.println("is not letter not number");
    }
}
