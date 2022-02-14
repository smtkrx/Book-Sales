public class Queue {
     static Node head ;
     static Node tail;
     int size=0;
public Queue(){
    this.head=null;
    this.tail=null;
}
public boolean isEmpty()
{
    return head == tail;
}    
public int getSize(){
    return size;
   }    

public void insert(String data,String nameCustomer,int wantToBookPieces,int BookPrice){

     Node tmp = new Node(data,nameCustomer,wantToBookPieces,BookPrice,null,null);
     tmp.data=data;
     tmp.next=null;

     if(head==null){
         head=tail=tmp;
         head.prev=null;
     }
     else{
         tail.next=tmp;
         tmp.prev=tail;
         tail=tmp;
}   
     size++;
}
void dequeue() 
{ 
    // If queue is empty, return NULL. 
    if (this.head == null) 
        return; 

    // Store previous front and move front one node ahead 
    Node temp = this.head; 
    this.head = this.head.next; 

    // If front becomes NULL, then change rear also as NULL 
    if (this.head == null) 
        this.tail = null; 
}
public void list(){
	System.out.println("Customer Name  "+"  Want To Book Piece  " +"  Book's Price");
      if(size==0){
          System.out.println("Ýs Empty");
      }else {
     Node tmp=head;
     while(tmp !=tail.getNext()){
         System.out.println(tmp.getName()+"                  "+tmp.getPieces()+"                 "+tmp.getPrice());
       tmp= tmp.getNext();
     }
      System.out.println();
  }
}
}
