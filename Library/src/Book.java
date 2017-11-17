
public class Book {
private String Book_title;
private double Book_price;

public Book(String book_title, double book_price) {

	Book_title = book_title;
	Book_price = book_price;
}
public String getBook_title() {
	return Book_title;
}
public void setBook_title(String book_title) {
	Book_title = book_title;
}
public double getBook_price() {
	return Book_price;
}
public void setBook_price(double book_price) {
	Book_price = book_price;
}
@Override
public String toString() {
	return "Book [Book_title=" + Book_title + ", Book_price=" + Book_price
			+ "]";
}

}
