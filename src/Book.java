public class Book{
	private String bookName;
	private int bookQuantity,bookPrice;
	int sayi;
	Book onceki;
	Book siradaki;
	
	public Book(String name, int quantity, int price) {
		this.bookName=name;
		this.bookQuantity=quantity;
		this.bookPrice=price;
	}
	public String getBookName() {
		return this.bookName;
	}
	public int getBookQuantity() {
		return this.bookQuantity;
	}
	public int getBookPrice() {
		return this.bookPrice;
	}
	
}
