package by.stankeich.artemiy.learn.booklibrary.repository;

import by.stankeich.artemiy.learn.booklibrary.exceptions.ItemNotFoundException;
import by.stankeich.artemiy.learn.booklibrary.pojo.Book;
import java.util.*;

public class BookRepositoryImpl implements BookRepository {

    private static final Map<String, Book> library = new HashMap<String, Book>();

    public static Map<String,Book> getLibrary() {
        return library;
    }

    public List<Book> findAll() {
        List<Book> allBooks = new ArrayList<Book>();
        for(Map.Entry<String,Book> book: getLibrary().entrySet()) {
            allBooks.add(book.getValue());
        }
        return allBooks;
    }

    public Book findById(String id) throws ItemNotFoundException {
        if (getLibrary().containsKey(id)) {
            return getLibrary().get(id);
        }
        else {
            throw new ItemNotFoundException("Book id dont find");
        }
    }

    public void save(Book item) {
        getLibrary().put(item.getId(), item);
    }

    public void delete(String id) throws ItemNotFoundException {
        if (getLibrary().containsKey(id)) {
            getLibrary().remove(id);
        }
        else {
            throw new ItemNotFoundException("Book id dont find + " + id +"" +
                    ". Cant delete book. Please enter new id.");
        }
    }
}
