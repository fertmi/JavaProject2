import java.util.Scanner;

public class BookStore {
    private Book[] books;
    public int currentIndex;

    public BookStore(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i]==null){
                this.books[i] = book;
                break;
            }
        }
    }

    public void removeBook(int index){
        if (index<0 || index>this.books.length){
            System.out.println("Неверный индекс");
        }else{
            this.books[index]= null;
        }
    }

    public void displayAllBooks(){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i]!=null) this.books[i].displayInfo();}
    }

    public void editBook(int index){
        if (index<0 || index>this.books.length){
            System.out.println("Неверный индекс");
        }else{
            this.books[index].displayInfo();
            Scanner scanner = new Scanner(System.in);
            int input = 0;
            do{
                System.out.println("Выберите интересующий Вас пункт меню:");
                System.out.println("1 Изменить название");
                System.out.println("2 Изменить автора");
                System.out.println("3 Изменить цену");
                System.out.println("4 Изменить количество");
                System.out.println("5 Выход");
                System.out.print("Введите цифру:");
                input = scanner.nextInt();
            } while(input<1 || input > 5);
            switch (input){
                case 1:
                    System.out.print("Введите название:");
                    String textTitle = scanner.next();
                    this.books[index].setTitle(textTitle);
                    break;
                case 2:
                    System.out.print("Введите автора:");
                    String textAuthor = scanner.next();
                    this.books[index].setAuthor(textAuthor);
                    break;
                case 3:
                    System.out.print("Введите цену:");
                    int book_price = scanner.nextInt();
                    this.books[index].setPrice(book_price);
                    break;
                case 4:
                    System.out.print("Введите количество:");
                    int book_quant = scanner.nextInt();
                    this.books[index].setQuantity(book_quant);
                    break;
                case 5:
                    break;
            }
        }
    }
    public void searchBookByTitle(String title){

    }

    public void sortBooksByPrice(){
        for (int i=0; i< this.books.length; i++){
            for (int j=0; j<this.books.length-1; j++){
                if (this.books[j]!=null && this.books[j+1]!=null && this.books[j].getPrice() > this.books[j+1].getPrice()){
                    Book temp = this.books[j];
                    this.books[j] = this.books[j+1];
                    this.books[j+1] = temp;
                }
            }
        }
    }

    public void displayMenu(){
            System.out.println("Добро пожаловать в книжный магазин!");
            System.out.println();
            System.out.println("Выберите интересующий Вас пункт меню:");
            System.out.println("1 Добавить книгу");
            System.out.println("2 Удалить книгу");
            System.out.println("3 Редактировать книгу");
            System.out.println("4 Поиск книги по названию");
            System.out.println("5 Сортировка книг по цене");
            System.out.println("6 Показать все книги");
            System.out.println("7 Выход");
            System.out.print("Введите цифру:");
    }

}
