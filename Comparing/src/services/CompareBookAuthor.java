package services;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Model.Author;
import Model.Book;
import authorcomparator.AuthorIdSort;
import authorcomparator.AuthorSortByName;
import bookcomparator.BookIdSort;
import bookcomparator.BookSortByBookName;

public class CompareBookAuthor {

	public static void main(String[] args) {
		List<Author> authors = new ArrayList<>();
		List<Book> books = new ArrayList<>();

		Book b1 = new Book(103, "Black Book OF Java", authors);
		Book b2 = new Book(20, "50 Shades of gray", authors);
		Book b3 = new Book(53, "Let's Kidnap The President", authors);

		Author a1 = new Author(987, "LAlit bhatt", books);
		Author a2 = new Author(204, "Steven Holzner", books);
		Author a3 = new Author(933, "E. L. James", books);

		books.add(b1);
		books.add(b2);
		books.add(b3);

		authors.add(a1);
		authors.add(a2);
		authors.add(a3);

		books.get(0).setAuthors(authors);
		books.get(1).setAuthors(authors);
		books.get(2).setAuthors(authors);

		// books.sort();
		// authors.sort(); this will not work we need to write customized
		// comparator to compare the objects of book and author

		System.out.println("\nUnsorted Books" + books);
		// Sort books by book ID
		books.sort(new BookIdSort());
		System.out.println("\n\nBooks sorted By Id" + books);
		// sort books By book name
		books.sort(new BookSortByBookName());
		System.out.println("\n\nBook sorted by book Name" + books);
		
		
		

		System.out.println("\n\n\nUnsorted Authors" + authors);
		// sort author by id
		authors.sort(new AuthorIdSort());
		System.out.println("\n\nAuthors Sorted By Id" + authors);
		// sort author by author name
		authors.sort(new AuthorSortByName());
		System.out.println("\n\nAuthor sorted by author Name" + authors);		
	}
}





// -----------------------------Author Comparators----------------------------



