
//----------------------------------------------Parameterize-------------Exmaple------------------------------------>
import java.util.*;

class Book {
    String Name;
    String Title;
    String Author;

    Book(String N, String t, String A) {
        this.Name = N;
        this.Title = t;
        this.Author = A;

    }

    public void dispalyBook() {
        System.out.println("Id" + Name);
        System.out.println("Title" + Title);
        System.out.println("Author" + Author);
    }
}

public class ELibrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Book Name");
        String N = sc.nextLine();
        System.out.println("Title");
        String T = sc.nextLine();
        System.out.println("Enter your Book Name");
        String A = sc.nextLine();

        Book newBook = new Book(N, T, A);

        newBook.dispalyBook();
    }

}