import java.util.Scanner;

public class RectangleProgrsm {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scan.nextFloat();

        System.out.println("Enter height: ");
        height = scan.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
