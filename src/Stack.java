public class Stack {

Node head = null;
Node tail = null;
int size=0;
public int getSize() {
      return size;
}

public boolean isEmpty(){
    return head == null;
}    
public void Push(String data,String BooksName,int BookPrice,int BooksCopied) {
    tail = head;
    head = new Node(data,BooksName,BookPrice,BooksCopied,null,null);
    head.data=data;
    head.next= tail;
    head.prev = null;

    if(tail != null) {
        tail.prev=head;
    }
    size++;
  }
public void Pop() {
    if (!isEmpty()) {
        head = head.next;   
        size--;
    } else {
        System.out.println("Ýs Empty");
    }
}
   public void Top() {
    Node tmp = head;
    while (tmp != null) {
        System.out.println("Book's Names: "+tmp.getName()+",  Book's Pieces: "+tmp.getPieces());
        tmp = tmp.getNext();
    }
}
public void Compare(String isim, int want) {
		Node nm=head;
		while(nm !=null){
	        if(isim==nm.getName()){
	        	nm.setPieces(want);
	        	System.out.println("Book's Name:"+nm.getName()+", Book's Price:"+nm.getPieces());
	        }else {	        	
	        }
	      nm= nm.getNext();
	    }
	}
}

