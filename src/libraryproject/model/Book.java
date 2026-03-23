package libraryproject.model;

public class Book extends LibraryItem {

    int pages;

    public Book(int itemId, String title, String author, int pages) {
        super(itemId, title, author);
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
        System.out.println("----------------------");
    }
}