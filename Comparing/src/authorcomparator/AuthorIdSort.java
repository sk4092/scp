package authorcomparator;

import java.util.Comparator;

import Model.Author;

public class AuthorIdSort implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {
		return o1.getAuthorId() - o2.getAuthorId();
	}

}