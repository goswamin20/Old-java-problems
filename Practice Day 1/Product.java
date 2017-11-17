package collection;

import java.util.Hashtable;

public class Product {
private String productId;
private String productName;
static Hashtable<String , String> p= new Hashtable<String, String>();
public Product(String productId, String productName) {
	
	this.productId = productId;
	this.productName = productName;
	p.put(productId,productName );
}
public String search(String productId) {
return p.get(productId);

}
public void remove(String productId) {
	p.remove(productId);

}
public void display() {
System.out.println(p);
}
public static void main(String[] args) {
	Product p1= new Product("p001", "maruti800");
	Product p2= new Product("p002", "marutiZen");
	Product p3= new Product("p003", "marutiEste");
	System.out.println(p1.search("p002"));
	p2.remove("p003");
	p3.display();
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName
			+ "]";
}
}
