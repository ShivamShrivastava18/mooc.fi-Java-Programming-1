
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int inp1= Integer.valueOf(scanner.nextLine());
        int inp2 = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(inp1,inp2);
        

    }
    public static void divisibleByThreeInRange(int first, int last){
        while (first<=last){
            if (first%3==0){
                System.out.println(first);
            }
            first++;
        }   
    }

}
