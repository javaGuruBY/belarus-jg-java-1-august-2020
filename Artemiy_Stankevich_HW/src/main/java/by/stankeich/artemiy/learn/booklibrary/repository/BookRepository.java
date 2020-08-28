package by.stankeich.artemiy.learn.booklibrary.repository;

import by.stankeich.artemiy.learn.booklibrary.exceptions.ItemNotFoundException;
import by.stankeich.artemiy.learn.booklibrary.pojo.Book;
import java.util.List;


public interface BookRepository {

    List<Book> findAll();
    Book findById(String id) throws ItemNotFoundException;
    void save(Book item);
    void delete(String id) throws ItemNotFoundException;
}
