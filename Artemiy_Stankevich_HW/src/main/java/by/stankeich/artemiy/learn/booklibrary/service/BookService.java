package by.stankeich.artemiy.learn.booklibrary.service;

import by.stankeich.artemiy.learn.booklibrary.exceptions.ItemNotFoundException;
import by.stankeich.artemiy.learn.booklibrary.pojo.Book;
import by.stankeich.artemiy.learn.booklibrary.repository.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(String id) throws ItemNotFoundException {
        return bookRepository.findById(id);
    }

    public void save(Book item) {
        bookRepository.save(item);
    }

    public void delete(String id) throws ItemNotFoundException {
        bookRepository.delete(id);
    }
}
