import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Book[] books = new Book[50];
        books[0] = new Book("Сказка", "Пушкин", 100, 30);
        books[1] = new Book("Стихи", "Тутчев", 50, 90);
        books[2] = new Book("Детям", "Чуйковский", 30, 130);
        books[3] = new Book("Повесть", "Лермонтов", 110, 20);
        books[4] = new Book("Басни", "Крылов", 70, 70);
        BookStore book_store = new BookStore(books);
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            book_store.displayMenu();
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Добавить книгу");
                    System.out.print("Введите название: ");
                    String scanTitle = scanner.next();
                    System.out.print("\nВведите автора: ");
                    String scanAuthor = scanner.next();
                    System.out.print("\nВведите цену: ");
                    int scanPrice = scanner.nextInt();
                    System.out.print("\nВведите количество: ");
                    int scanQuant = scanner.nextInt();
                    Book book_add = new Book(scanTitle, scanAuthor, scanPrice, scanQuant);
                    book_store.addBook(book_add);
                    break;
                case 2:
                    System.out.print("Введите индекс: ");
                    int index_book = 0;
                    index_book = scanner.nextInt();
                    book_store.removeBook(index_book);
                    break;
                case 3:
                    System.out.print("Введите индекс: ");
                    int index_book2 = 0;
                    index_book2 = scanner.nextInt();
                    book_store.editBook(index_book2);
                    break;
                case 4:
                    System.out.print("Поиск книги по названию. Введите название: ");
                    String textTitle = scanner.next();
                    book_store.searchBookByTitle(textTitle);
                    break;
                case 5:
                    System.out.println("Сортировка книг по цене");
                    book_store.sortBooksByPrice();
                    break;
                case 6:
                    System.out.println("Показать все книги");
                    book_store.displayAllBooks();
                    break;
                case 7:
                    break;
            }
        }while(input < 1 || input < 7);
    }
}
