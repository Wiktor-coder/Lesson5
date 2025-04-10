public class Book {
    public String title;  // название книги
    public int releaseYear;  // год выпуска
    public Author author;  // автор (теперь объект класса Author)
    public int pages;  // количество страниц

    //конструктор
    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages < 500) {
            System.out.println("Это небольшая книга");
            return false;
        } else {
            System.out.println("Это большая книга");
            return true;
        }
    }

    //проверка введеного слова в названии книги и имени автора
    public boolean matches(String word) {
        if (title.contains(word))
            return true;
        else if (author.name.contains(word) || author.surname.contains(word))
            return true;
        else
            return false;
    }

    //расчет цены кники
    public int estimatePrice() {
        int price = (int) Math.floor(pages * 3 * Math.sqrt(author.rating));
        return Math.max(price, 250);
    }
}