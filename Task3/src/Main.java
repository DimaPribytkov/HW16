import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите Фамилию Имя Отчество");
            String fIO = new Scanner(System.in).nextLine();
            if (fIO.matches(VALID_REGEX)) {
                System.out.println(true);
            } else {
                System.out.println("no Valid");
                break;
            }
        }
    }
}