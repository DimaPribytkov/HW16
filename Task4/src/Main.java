import java.util.Scanner;

public class Main {
    private static final String NUM_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String NUM_FORMAT = "+7 ($2) $3 $4-$5";
    private static final String SHORT_FORMAT = "+7 ($1) $2 $3-$4";
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер телефона");
            String number = new Scanner(System.in).nextLine();
            number = number.replaceAll("\\D+", "");
            if (number.length() == 11){
                number = number.replaceAll("(\\d)+" + NUM_REGEX, NUM_FORMAT);
                System.out.println(number);
            } else if (number.length() == 10) {
                number = number.replaceAll(NUM_REGEX, SHORT_FORMAT);
                System.out.println(number);
            }else {
                System.out.println("Неверный формат номера");
            }
//            number = number.replaceAll("\\D+", "");
//            number = number.replaceAll("8", "7");
//            if ((number.indexOf(0) == 9) && (number.length() == 10)) {
//                number = number.replaceAll("9", "79");
//            }
//            if ((number.length() == 11) && (number.indexOf(0) != 7 && number.indexOf(0) != 9)) {
//                System.out.println(number);
//            } else {
//                System.out.println("Неверный номер");
//
//            }
        }
    }
}