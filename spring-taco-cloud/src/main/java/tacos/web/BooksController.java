package tacos.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tacos.Book;

@RestController 
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
			new Book(1l, "Master Spring", "Indian Guy"),
			new Book(2l, "Angular Beginner", "Usa Guy"),
			new Book(3l, "React Master", "UK Guy")
		);
	}
}
