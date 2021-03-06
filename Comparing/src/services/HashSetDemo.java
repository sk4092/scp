package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetDemo {

	
	/**
	 * Duplicates are not allowed
	 * Seq order not preserved
	 * Null  -- Single is allowed
	 * 
	 */
	public static void main(String[] args) {
		Product p1 = new Product(10,1000,"Productone");//2
		Product p2 = new Product(10,1000,"productone");//4
		Product p3= new Product(11,2000,"1Productone");//1
		Product p4 = new Product(13,4000,"Producttone2");//3
		Product p5=p1;
		
		HashSet<Product> setOfProducts = new HashSet<>();
		setOfProducts.add(p1);
		setOfProducts.add(p2);
		setOfProducts.add(p3);
		setOfProducts.add(p4);
		setOfProducts.add(p5);
		//System.out.println(setOfProducts.size()); //4
		//Collections.sort(setOfProducts);
		
		
		ArrayList<Product> listOfProducts = new ArrayList<>();
		listOfProducts.addAll(setOfProducts);
		//System.out.println(listOfProducts.size());
		//System.out.println(listOfProducts);
		
		System.out.println("UnSorted -- "+listOfProducts);
		
		Collections.sort(listOfProducts,new ProductSortByName());
	
		System.out.println("SortedByNAME -- "+listOfProducts);
		
		Collections.sort(listOfProducts,new PriceSort());
		
		System.out.println("SortedpRICE -- "+listOfProducts);
		
		HashSet<Integer> setOfNum = new HashSet<>();
		setOfNum.add(10);
		setOfNum.add(30);
		setOfNum.add(02);
		setOfNum.add(120);
		ArrayList<Integer> listOfnum = new ArrayList<>();
		listOfnum.addAll(setOfNum);
		Collections.sort(listOfnum);
		
		//System.out.println(setOfNum.size()); //4
		//Collections.sort(setOfNum);
	}
	
	
}

class Product {// implements Comparable<Product>{
	private int productId;
	private int productPrice;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "\n Product [productId=" + productId + ", productPrice=" + productPrice + ", productName=" + productName
				+ "]";
	}
	public Product(int productId, int productPrice, String productName) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}*/
	
	/**
	 * 48 -- 0 -- 
	 * 57 -- 9 
	 * 
	 * A  -- 65
	 * 91 -- Z
	 * 
	 * a -- 97
	 * z- 122
	 * 
	 * 
	 */
	
	public Integer getINt(){
		return 10;
	}
	
/*	@Override
	public int compareTo(Product o) {
		return this.getProductName().compareTo(o.getProductName());
	}*/
	
	
}


class PriceSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductPrice() - o2.getProductPrice();
	}
	
}

class ProductSortByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName());
	}
	
}




















