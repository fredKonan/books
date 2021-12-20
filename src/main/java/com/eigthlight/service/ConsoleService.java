package com.eigthlight.service;

import com.eigthlight.model.Book;

import java.util.List;
import java.util.Scanner;

public class ConsoleService {
    private final Scanner scanner = new Scanner(System.in);

    public int promptForMenuSelection() {
        int menuSelection;
        System.out.print("Please choose an option: ");
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public void printMainMenu() {
        System.out.println();
        System.out.println("----Online Book Store Menu----");
        System.out.println("1: Search a book");
        System.out.println("2: add a book to a read list");
        System.out.println("3: view list of books on the read list");
        System.out.println("0: Exit");
        System.out.println();
    }

    public String promptForBookByUserInput() {
        System.out.println("--------------------------------------------");
        System.out.print("Enter what you are looking for on the book store: ");
        return scanner.nextLine();
    }
    public int promptForBookToAdd(){
        System.out.println("--------------------------------------------");
        System.out.print("Enter a book id (1-5) to add to your reading list: ");
        return scanner.nextInt();
    }

    public void printBookList(List<Book> books){
        System.out.println("--------------------------------------------");
        System.out.println("Books");
        System.out.println("--------------------------------------------");
        for(int i =0; i<books.size();i++){
            System.out.println((i+1)+"-"+ books.get(i));
            System.out.println("");
        }
    }
}
