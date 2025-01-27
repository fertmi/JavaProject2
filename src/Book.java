public class Book {
    private String title;
    private String author;
    private int price;
    private int  quantity;

    public Book(String title, String author, int price, int  quantity) {
        this.title = title;
        this. author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo(){
        System.out.printf("Название: %s | Автор: %s | Цена: %d | Количество: %d", title, author, price, quantity);
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
