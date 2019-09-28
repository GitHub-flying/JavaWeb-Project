package service;

import entily.Book;
import java.util.List;
import java.util.Arrays;

/**
 * @param
 * @return Author
 * Description
 * @Date
 **/
public class BookService {
    private static List<Book> bookList;

    private List<Book> init() {
        Book[] books = {
                new Book(1, "Java", "book1.jpg", "巴斯帝安"),
                new Book(2, "庸人自扰","book2.jpg", "美味佳"),
                new Book(3, "庐山","book3.jpg", "耶茨"),
                new Book(4, "敌人与令居","book.jpg", "布利阿克"),
                new Book(4, "尚元吉", "book5.jpg","罗多尔费"),
        };
        bookList = Arrays.asList(books);
        return bookList;
    }
}
