package tut11.ex2;

public class Book {
	
	protected String author;
	protected String title;
	protected double price;
	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws IllegalArgumentException{
		for(int i = 0; i < author.length(); i++) {
			char a = author.charAt(i);
			if(a == ' ') {
				if(author.charAt(i+1) >= '0' && author.charAt(i+1) <= '9') {
					throw new IllegalArgumentException("Author is invalid!");
				}
				
			}
		}
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws IllegalArgumentException {
		if(title.length() < 3) {
			throw new IllegalArgumentException("Title is invalid!");
		}
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws IllegalArgumentException {
		if(price < 1) {
			throw new IllegalArgumentException("Price is invalid!");
		}
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		StringBuilder book = new StringBuilder();
		book.append(String.format("Name: %s, Age: %d, Price: %d", this.getAuthor(), this.getTitle(), this.getPrice()));
		return book.toString();	
		}

}
