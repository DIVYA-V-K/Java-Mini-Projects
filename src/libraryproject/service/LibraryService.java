package libraryproject.service;

import libraryproject.model.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}