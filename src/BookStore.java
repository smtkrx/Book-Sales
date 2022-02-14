public class BookStore <D>{
	static Book bas;
	static Book son;
	static Customer head;
	static Customer tail;
	int sayac=0;
	
	public BookStore() {
		//The Constructor Method
	}
	public boolean doluMu() {
		if(bas!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void pushStackBook(String BookName,int quantity,int price) {
		Book yeniEleman = new Book(BookName,quantity,price); 
		if(doluMu()) {
			//list is full
			son.siradaki=yeniEleman;
			yeniEleman.onceki=son;
			son=yeniEleman;
		}
		else {
			//list is empty
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public void popStackBook() {
		if(bas==son) {
			bas=null;
			son=null;
		}else {
			Book isaretci =bas;
			while(isaretci.siradaki!=son) {
				isaretci=isaretci.siradaki;
			}
			isaretci.siradaki=null;
			son=isaretci;
			System.out.printf("The element removed from the Stack:"+ isaretci.getBookName()+" "+isaretci.getBookQuantity()+" "+isaretci.getBookPrice()+"\n");
		}
	}
	public void enQueueBook(String BookName,int quantity,int price) { //Add to queue function.

		Book yeniEleman = new Book(BookName,quantity,price); 
		if(doluMu()) {	
			bas.onceki=yeniEleman; 
			yeniEleman.siradaki=bas;
			bas=yeniEleman;
			
		}
		else {
			bas=yeniEleman;
			son=yeniEleman;
		}
	}
	public static int deQueueBook() 	
	{
		if (bas == null) {
			System.out.print("\nQueue Underflow");
			System.exit(1);
		}

		Book temp = bas;
		System.out.printf("The element removed from the queue:"+ temp.getBookName()+" "+temp.getBookQuantity()+" "+temp.getBookPrice()+"\n");
		bas = bas.siradaki;

		if (bas == null) {
			son = null;
		}

		int item = temp.sayi;
		return item;
	}
	public void pushStackCustomer(String CustomerName,String BookName,int piece) {
		Customer yeniEleman = new Customer(CustomerName,BookName,piece); 
		if(doluMu()) {
			//list is full
			tail.siradaki=yeniEleman;
			yeniEleman.onceki=tail;
			tail=yeniEleman;
		}
		else {
			//list is empty
			head=yeniEleman;
			tail=yeniEleman;
		}
	}
	public void popStackCustomer() {
		if(head==tail) {
			head=null;
			tail=null;
		}else {
			Customer isaretci =head;
			while(isaretci.siradaki!=tail) {
				isaretci=isaretci.siradaki;
			}
			isaretci.siradaki=null;
			tail=isaretci;
			System.out.printf("The element removed from the Stack:"+ isaretci.getCustomerName()+" "+isaretci.getBookName()+" "+isaretci.getWantToBookPieces()+"\n");
		}
	}
	public void enQueueCustomer(String CustomerName,String BookName,int piece) { //Add to queue function.

		Customer yeniEleman = new Customer(CustomerName,BookName,piece); 
		if(doluMu()) {	
			head.onceki=yeniEleman; 
			yeniEleman.siradaki=head;
			head=yeniEleman;
			
		}
		else {
			head=yeniEleman;
			tail=yeniEleman;
		}
	}
	public static int deQueueCustomer() 	
	{
		if (head == null) {
			System.out.print("\nQueue Underflow");
			System.exit(1);
		}

		Customer temp = head;
		System.out.printf("The element removed from the Stack:"+ temp.getCustomerName()+" "+temp.getBookName()+" "+temp.getWantToBookPieces()+"\n");
		head = head.siradaki;

		if (head == null) {
			tail = null;
		}

		int item = temp.sayi;
		return item;
	}
	public static int firstElement() {

		if (bas != null) {
			return bas.sayi;
		} else {
			System.exit(1);
		}
		return -1;
	}
	public void printQueue() {
		Book isaretci=bas;
		while(isaretci!=null) {
			System.out.println(isaretci.getBookName()+" "+isaretci.getBookQuantity()+" "+isaretci.getBookPrice());
			isaretci=isaretci.siradaki;	
			sayac++;
		}
	}
	public Book indeksiSil(int anahtar) // Function used to delete the selected item in the queue
	{ 
		Book aktif = bas; 
		while (aktif.sayi != anahtar) // Until we find a match
		{
			aktif = aktif.siradaki; // The loop is constantly transferred to the next
			if (aktif == null)
				return null; // no matches found
		}
		if (aktif == bas) 
			bas = aktif.siradaki; 
		else 
				
			aktif.onceki.siradaki = aktif.siradaki;

		if (aktif == son) 
			son = aktif.onceki; 
		else 
			
			aktif.siradaki.onceki = aktif.onceki;
		return aktif; // Returning found value
	}
	public void maxNode() { 
		Book current = bas;
        int max;
        if(bas == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            //Initializing max with head node data  
            max = bas.sayi;
            while(current != null){  
                 //If current node's data is greater than max  
                 //Then, replace value of max with current node's data  
                 if(max < current.sayi ) {  
                     max = current.sayi;
                 } 
                 current = current.siradaki; 
            }
            System.out.println("Maximum value node in the list And is WINNER: "+max);  
        }
}
	public void search(int x) 
    { 
		Book current = bas;    //Initialize current 
        while (current != null) 
        { 
            if (current.sayi == x)
            	System.out.println("Found it: "+x);  //data found 
            	current = current.siradaki; 
        } 
        System.out.println("Data not found");
        //data not found 
    } 
	 public void findStudents (int a, int b) {
		 Book isaretci=bas;
		 Book current = bas;
	        int tmp;  
	  
	        if(bas == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            //Initializing max with head node data  
	            tmp = bas.sayi;
	            while(current != null){  
	                 //If current node's data is greater than max  
	                 //Then, replace value of max with current node's data  
	                 if(a < current.sayi && current.sayi<b) {  
	                     tmp = current.sayi;	 
	                     System.out.println(" "+tmp);  
	                 } 
	                 current = current.siradaki; 
	            }
	        }
	}	  
	public void listeyiYazdir() {
		Book isaretci=bas;
		while(isaretci!=null) {
			System.out.println(isaretci.getBookName()+" "+isaretci.getBookQuantity()+" "+isaretci.getBookPrice());
			isaretci=isaretci.siradaki;	
			sayac++;
		}
	}
}
