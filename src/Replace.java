import java.util.Scanner;
public class Replace {
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        String str = Integer.toString(number);
        int len = str.length();
        String str1 = "";
        //use the logic to replace all 0's with 1 in a given integer
        for(int i = 0 ; i < len ; i++)
        {
            if(str.charAt(i) == '0')
                str1 = str1 + '1';
            else
                str1 = str1 + str.charAt(i);
        }
        System.out.println("Converted number is: "+str1);
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}
