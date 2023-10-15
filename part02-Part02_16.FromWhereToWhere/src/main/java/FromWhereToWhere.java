
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.next());
        if (start>end){
            System.out.println(""); 
        }else {
            for (int i=start; i<end+1; i++){
                System.out.println(i);
            }
        }
    }
}
