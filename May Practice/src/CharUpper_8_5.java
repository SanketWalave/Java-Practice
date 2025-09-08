public class CharUpper_8_5 {
    public static void main(String[] args) {
        Character ch='a';
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)) System.out.println("its upper case");
            else System.out.println("its smaller");
        }
        else System.out.println("not alphabate");
    }
}
