                                            //    Question No 08.
                                              


import java.util.*;

public class ComboLock {
    static int Lock1 = 10, Lock2 = 20, Lock3 = 30;
    static Scanner l1 = new Scanner(System.in);

    ComboLock(int Lock1, int Lock2, int Lock3) {
        this.Lock1 = Lock1;
        this.Lock2 = Lock2;
        this.Lock3 = Lock3;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number:");
        int attempt1 = l1.nextInt();
        System.out.println("Enter second number:");
        int attempt2 = l1.nextInt();
        System.out.println("Enter third number:");
        int attempt3 = l1.nextInt();
        checkUnlock(attempt1, attempt2, attempt3);
    }

    static void checkUnlock(int a, int b, int c) {
        if (a == Lock1 && b == Lock2 && c == Lock3) {
            System.out.println("Lock Opened!");
        } else {
            System.out.println("Rong Lock!");
        }
    }
}
