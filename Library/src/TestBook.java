

public class TestBook {

	/**
	 * @param args
	 * @return 
	 */
	public Book[] createBooks(){
		Book[] b= new Book[5];
		return b;
	}
	public void showBooks(Book[] b){
		for(Book i:b){
		System.out.println(i);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBook t= new TestBook();
		 Book b[]=t.createBooks();
		for(int i=0;i<5;i++){
			System.out.println("enter book name and price");
			
			b[i]=new Book("java", 350);
		}	
		t.showBooks(b);
	}

}
