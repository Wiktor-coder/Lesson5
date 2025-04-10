import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book("Java: руководство для начинающих. 9-е издание", 2023, new Author("Шилд", "Герберт", 5), 752);
        System.out.println(book.isBig());

//        поиск слова в title,author
        System.out.println("Введите слово для поиска");
        String word = sc.nextLine();
        boolean result = book.matches(word);
        System.out.println(result + "Такое слово приссудствует");

        int prise = book.estimatePrice();
        System.out.println("Цена книги: " + prise);
    }
}
