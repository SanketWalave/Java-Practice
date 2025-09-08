import java.util.*;
 public class Alphabet
 {
public static void main (String x[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Alphabet letter");

char z;

z =sc.next().charAt(0);

 String result=z=='a' || z=='e' || z=='i'|| z=='o'|| z=='u'?"z is vowel":"z is consonant";
 System.out.println(result);
}
}
