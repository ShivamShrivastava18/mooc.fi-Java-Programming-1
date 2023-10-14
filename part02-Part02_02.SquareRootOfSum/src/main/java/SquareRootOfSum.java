
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1= Integer.valueOf(scanner.nextLine());
        int value2= Integer.valueOf(scanner.nextLine());
        int value = value1+value2;
        double root = Math.sqrt(value);
        System.out.println(root);

    }
}
