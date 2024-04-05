package com.learning.core.day1session1;

public class D01P01 {

	//Method to create a book object
		public static Book createBook(String title,double price) {
			Book book = new Book();
			book.setBookTitle(title);
			book.setBookPrice(price);
			return book;
		}
		//Method to display book details
		public static void showBook(Book Book) {
			System.out.println("Book Title: " + Book.getBookTitle() + " and price: " + Book.getBookPrice());
		}
		public static void main(String[]args) {
			//Input
			String title = "Java Programming";
			double price = 350.00;
			//creating and displaying the book
			Book book = createBook(title, price);
			showBook(book);
		
		}
	}