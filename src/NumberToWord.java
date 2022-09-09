import java.util.Scanner;
public class NumberToWord {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter number= ");
            int n = sc.nextInt();
            int b = n % 10;
            int a = n / 10;
            String[] one_digit = new String[]{"zero", "one", "Two", "Three", "four", "Five", "Six", "seven", "Eight",
                    "Nine"};
            if ( a==1  ||  b==0 ) {
                System.out.println("Two digit");
            } else
                System.out.print(one_digit[b]);
        }
}
