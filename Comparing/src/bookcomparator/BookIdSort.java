package bookcomparator;

import java.util.Comparator;

import Model.Book;

public class BookIdSort implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookId() - o2.getBookId();
	}

}
