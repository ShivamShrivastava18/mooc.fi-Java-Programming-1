
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float count = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number==0){
                break;
            }else{
                sum = sum+number;
                count = count+1;
            }
             
        }
        float average = sum/count;
        System.out.println("Average of the numbers: " + average);

    }
}
