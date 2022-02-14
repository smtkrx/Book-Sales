import java.util.Scanner;
public class TestStore {

    public static void main(String[] args){
    
    Stack st = new Stack();
    Queue qu = new Queue();

    st.Push(null, "Sefiller", 1000,15);
    st.Push(null, "Sherlock", 50, 25);
    st.Push(null, "Harry Potter", 400, 10);
    st.Push(null, "The Lord of The Rings", 340, 18);
    st.Push(null, "Who am I ?", 200, 20);

    st.Top(); 
    
    System.out.println("\nSabah Musterileri: \n");
    qu.insert(null, "Ahmet", 20, 10);
    qu.insert(null, "Samet", 30, 20);
    qu.insert(null, "Cemal", 40, 30);
    qu.insert(null, "Hasan", 10, 40);
    qu.insert(null, "Fatih", 10, 40);
    qu.list();
    
    System.out.println("Aksam Musterileri: \n");
    qu.insert(null, "Recep", 10, 40);
    qu.insert(null, "Polat", 10, 40);
    qu.insert(null, "Cagri", 10, 40);
    qu.insert(null, "Guler", 10, 40);
    qu.insert(null, "Miray", 10, 40);
    
    qu.list();
    
    System.out.println("Delivery...");
    st.Compare("Sherlock",20);
    
    

  }
}