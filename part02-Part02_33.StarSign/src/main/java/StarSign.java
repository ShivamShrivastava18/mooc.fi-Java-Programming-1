
public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = 0; i < size; i++) {
            printStars(size);
        }

    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = 0; i < height; i++) {
            printStars(width);
        }

    }

    public static void printTriangle(int size) {
        // fourth part of the exercise

        for (int i = 0; i <= size; i++) {
            printStars(i);
        }

    }
}