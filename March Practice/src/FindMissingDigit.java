public class FindMissingDigit {
    char [] operators = {'+', '-', '*', '/', '='};
    public static void main(String[] args) {
        String s = "3X + 12 = 46";

        String a [] = s.split(" ");
        String n1 = a[0];

        switch (a[1]){
            case "+":

                break;
            case "-":

                break;
            case "*":

                break;
            case "/":

                break;
        }

    }

    public static int[] getPossibles(String s){
        int pos[] = new int[10];

        for(int i=0; i<10; i++){

        }
        return pos;
    }

    public static int getNumber(String s){
        int number = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                int digit = c - 48;
                number = number * 10 + digit;
            }
        }

        return number;
    }
}
/*
*      "3X + 12 = 46"
*       3x = 46 - 12
*       3x = 36
*       36 = 36
* */