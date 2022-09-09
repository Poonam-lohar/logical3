import java.util.Scanner;
public class Roots {
        public static void main(String[] args) {
            double a=2.3,b=4,c=6;
            double root1,root2,x;
            double delta = b*b-4*a*c;
            if (delta> 0) {
                root1=(-b+Math.sqrt(delta))/(2*a);
                root2=(-b-Math.sqrt(delta))/(2*a);
                System.out.printf("root1=%.2f and root2=%.2f",root1,root2);
            } else if (delta==0) {
                root1=root2=-b/(2*a);
                System.out.printf("root1=root2=%.2f",root1);
            }
            else {
                double real=-b/(2*a);
                double imaginary=Math.sqrt(-delta)/(2*a);
                System.out.printf("root1=%.2f+%.2fi",real,imaginary);
                System.out.printf("\nroot2=%.2f+%.2fi",real,imaginary);
            }
        }
    }
