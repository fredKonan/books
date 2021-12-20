package com.eigthlight;

import com.eigthlight.model.Book;
import com.eigthlight.model.GoogleBook;
import com.eigthlight.model.Item;
import com.eigthlight.service.BookService;
import com.eigthlight.service.ConsoleService;

import java.util.Arrays;
import java.util.List;

public class App {
  private final ConsoleService consoleService = new ConsoleService();
  private final BookService bookService= new BookService();
    public static void  main(String... arg){
    App app = new App();
    app.run();
    }

    private void run() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                List<Book> books = handlelBookSearch();
                consoleService.printBookList(books);
            } else if (menuSelection == 2) {
                List<Book> books = handlelBookSearch();
                consoleService.printBookList(books);
            int input = consoleService.promptForBookToAdd();
            bookService.addBookToReadingList(books.get(input-1));
            } else if (menuSelection == 3) {
            handleReadingListDisplay();
            } else if (menuSelection != 0) {
                System.out.println("Invalid Selection");
            }
        }
    }

    private List<Book> handlelBookSearch(){
        String filter = consoleService.promptForBookByUserInput();
        List<Book> books =bookService.searchBookByReference(filter);
        return  books;
    }

    private void handleReadingListDisplay(){
        bookService.displayReadingList();
    }
}
