public class Customer {
	private String nameCustomer, bookName;
	private int wantToBookPieces;
	int sayi;
	Customer onceki;
	Customer siradaki;
	public Customer(String nameCust, String nameBook, int pieces) {
		this.nameCustomer=nameCust;
		this.bookName=nameBook;
		this.wantToBookPieces=pieces;
	}
	public String getCustomerName() {
		return this.nameCustomer;
	}
	public String getBookName() {
		return this.bookName;
	}
	public int getWantToBookPieces() {
		return this.wantToBookPieces;
	}
	
	
}
