

public class MyString {
    private String str;

    public MyString(String s) {
        str = s;
    }

    public int length() {
        return str.length();
    }

    public void Connect(String s) {
        str = str.concat(s);
    }

    public void MyString2(int start, int len) {
        String sub = str.substring(start, start + len);
        System.out.println("Substring: " + sub);
    }

    public boolean search(String word) {
        return str.contains(word);
    }


    public void reverse() {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {
        MyString myStr = new MyString("Hello, World!");

        System.out.println("Length: " + myStr.length());

        myStr.Connect(" Welcome!");
        System.out.println("Connect string: " + myStr.str);

        myStr.MyString2(7, 5);

        System.out.println("Word 'World' found: " + myStr.search("World"));

        myStr.reverse();
    }
}
