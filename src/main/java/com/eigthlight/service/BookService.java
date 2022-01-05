package com.eigthlight.service;

import com.eigthlight.model.Book;
import com.eigthlight.model.GoogleBook;
import com.eigthlight.model.Item;
import com.fasterxml.jackson.core.JsonParser;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {


        private static final String API_BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
        private final RestTemplate restTemplate = new RestTemplate();
        List<Book> readingList = new ArrayList<>();

        public List<Book> searchBookByReference(String filter){

           try{

              GoogleBook googleBook= restTemplate.getForObject(API_BASE_URL+filter,GoogleBook.class);
                List<Book> items = new ArrayList<>();
               assert googleBook != null;
               if(googleBook.getItems().length<5){
                    for (int i=0; i<googleBook.getItems().length; i++ ){
                        bookMap(googleBook, items, i);
                    }
                }
                for (int i=0; i<5; i++ ){
                    bookMap(googleBook, items, i);
                }

              return items;
           }catch (ResourceAccessException e){
               e.getStackTrace();
               throw  new RuntimeException(e);
           }catch (RestClientResponseException e){
               e.getMessage();
               throw  new RuntimeException(e);
           }
        }

    private void bookMap(GoogleBook googleBook, List<Book> items, int i) {
        Book book = new Book();
        book.setAuthor(googleBook.getItems()[i].getVolumeInfo().getAuthors());
        book.setTitle(googleBook.getItems()[i].getVolumeInfo().getTitle());
        book.setPublisher(googleBook.getItems()[i].getVolumeInfo().getPublisher());
        items.add(book);
    }

    public void displayReadingList(){
            if(readingList.size()==0){
                System.out.println("There is no book add to your reading list.");
            }
            for(Book book : readingList){
                System.out.println(book);
            }
        }

        public void addBookToReadingList(Book book){
            readingList.add(book);
        }
    }




