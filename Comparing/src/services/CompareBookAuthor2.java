package services;

import java.util.ArrayList;
import java.util.List;

import Model.Author;
import Model.Book;
import bookcomparator.BookIdSort;
import bookcomparator.BookSortByBookName;

public class CompareBookAuthor2 {
	
	
	public static void main(String[] args) {
		String compareBy="id";
		
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
		
		sortBookBy("id",books);
		sortBookBy("name",books);
		sortBookBy("xyz",books);
	}
	
	private static void sortBookBy(String property,List<Book> books){
		
		Object comparatorObj=getBookComaparator(property);
		
		if(null==comparatorObj){
			System.out.println("\n Invalid property for sorting");
			return;
		}
		
		try{
			BookIdSort c=(BookIdSort)comparatorObj;
			books.sort(c);
			System.out.println("\n\nBooks sorted By Id" + books);
		}
		catch(Exception e){
			try{
				BookSortByBookName c=(BookSortByBookName)comparatorObj;
				books.sort(c);
				System.out.println("\n\nBook sorted by book Name" + books);
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private static Object getBookComaparator(String compareBy){
		
		if(compareBy.equals("id"))
			return new BookIdSort();
		else if(compareBy.equals("name"))
			return new BookSortByBookName();
		else
			return null;
		
	}
	
	
	
	
	
	
	
	
	

}
