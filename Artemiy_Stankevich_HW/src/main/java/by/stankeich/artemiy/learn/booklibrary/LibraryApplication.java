package by.stankeich.artemiy.learn.booklibrary;

import by.stankeich.artemiy.learn.booklibrary.exceptions.ItemNotFoundException;
import by.stankeich.artemiy.learn.booklibrary.pojo.Book;
import by.stankeich.artemiy.learn.booklibrary.repository.BookRepository;
import by.stankeich.artemiy.learn.booklibrary.repository.BookRepositoryImpl;
import by.stankeich.artemiy.learn.booklibrary.service.BookService;

import java.util.List;

public class LibraryApplication {
    public static void main(String[] args) throws ItemNotFoundException {

        Book book1 = Book.builder()
                .id("Rule_of_wizard_part_1")
                .author("Terry_Gudkaind")
                .name("First rule of the wizard")
                .pagesCount(799)
                .build();

        Book book2 = Book.builder()
                .id("Rule_of_wizard_part_2")
                .author("Terry_Gudkaind")
                .name("The Second rule of the wizard")
                .pagesCount(578)
                .build();

        Book book3 = Book.builder()
                .id("Rule_of_wizard_part_3")
                .author("Terry_Gudkaind")
                .name("The third rule of the wizard")
                .pagesCount(777)
                .build();
        Book book4 = new Book("1", "Jon", "Hello", 123);
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookService(bookRepository);

        bookService.save(book1);
        bookService.save(book2);
        bookService.save(book3);
        bookService.save(book4);

        Book resultFindById = bookService.findById("1");
        System.out.println(resultFindById.toString());

        List<Book> foundBooks = bookService.findAll();
        System.out.println(foundBooks.toString());

        bookService.delete("1");
        System.out.println(bookService.findAll());

    }
}
