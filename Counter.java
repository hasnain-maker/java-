import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        @SuppressWarnings("code")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String check = sc.nextLine().toLowerCase();

        System.out.print("Enter a word: ");
        String s1 = sc.nextLine().toLowerCase();

        int num = 0;
        for (String temp : check.split(" ")) {
            if (temp.equals(s1))
                num++;
        }

        System.out.println(s1 + " appear " + num + " sec.");
    }
}
