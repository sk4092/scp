package authorcomparator;

import java.util.Comparator;

import Model.Author;

public class AuthorSortByName implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}
}