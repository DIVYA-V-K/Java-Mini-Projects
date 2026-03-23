package libraryproject.app;

import libraryproject.model.Book;
import libraryproject.model.Magazine;
import libraryproject.model.DVD;
import libraryproject.service.LibraryService;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryService service = new LibraryService();

        Book book = new Book(1, "Java Programming", "James Gosling", 350);
        Magazine magazine = new Magazine(2, "Tech Today", "John", 12);
        DVD dvd = new DVD(3, "AI Documentary", "Smith", 120);

        service.addItem(book);
        service.addItem(magazine);
        service.addItem(dvd);

        service.displayAllItems();
    }
}