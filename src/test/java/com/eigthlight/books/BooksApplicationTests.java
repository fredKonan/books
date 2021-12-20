package com.eigthlight.books;

import com.eigthlight.model.Book;
import com.eigthlight.service.BookService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*

1-Book{author=[James D.G. Dunn], title='Jesus, Paul, and the Gospels', publisher='Wm. B. Eerdmans Publishing'}

2-Book{author=[Sonja M. Stewart], title='Following Jesus', publisher='Westminster John Knox Press'}

3-Book{author=[Pinchas Lapide], title='The Resurrection of Jesus', publisher='Wipf and Stock Publishers'}

4-Book{author=[Judah Smith], title='Jesus is', publisher='Thomas Nelson Inc'}

5-Book{author=[James E. Talmage], title='Jesus the Christ', publisher='BoD – Books on Demand'}

 */

@RunWith(MockitoJUnitRunner.class)
class BooksApplicationTests {

	private  List<Book> books = new ArrayList<>();
	BookService bookService = new BookService();

	@Test
	void contextLoads() {
	}

	@Test
	public void searchBookByInput(){
		Book book1 = new Book();
		book1.setPublisher("Wm. B. Eerdmans Publishing");
		book1.setTitle("Jesus, Paul, and the Gospels");
		book1.setAuthor(new ArrayList<String>(Collections.singleton("James D.G. Dunn")));
		Assert.assertEquals(book1.toString(),bookService.searchBookByReference("jesus").get(0).toString() );
	}
}
