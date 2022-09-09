import java.util.Scanner;
public class AreaOfCircle {
        public static void main(String[] args)
        {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter a radius: ");
            int r = scanner.nextInt();
            double pi = 3.14, area;
            area = pi * r * r;
            System.out.println("Area of circle:"+area);
        }
    }
