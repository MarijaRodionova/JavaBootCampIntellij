import java.util.Scanner;

public class NoNumbers {

    public static void main(String[] args) {
        System.out.println("Enter first name");
        String temp;
        Scanner nameNoNum = new Scanner(System.in);
        temp = nameNoNum.nextLine();
        System.out.println(temp);

        int n = 0;
        System.out.println ("Enter Last Name");
        String lastName = "Lee";

        while(n<9);
        System.out.println("Print last name");
        String tmp = nameNoNum.nextLine();
        char c = tmp.charAt(0);

        if (Character.isAlphabetic(c)) {
           tmp += c;
            n++;
        } else {
            System.out.println("Numbers found, not good");

        }

        System.out.println(tmp);
    }

}
