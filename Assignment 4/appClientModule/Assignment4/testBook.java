package Assignment4;

public class testBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new engineeringBook();
		
	    b1.setCategory("Engineering");
		
	    System.out.println("Category is :" + b1.getCategory());
		System.out.println("Author is :" + b1.getAuthor());
		System.out.println("BookNo is :" + b1.getBookNo());
		System.out.println("Price is :" + b1.getPrice());
		System.out.println("Title is :" + b1.getTitle());
		
	}

}
