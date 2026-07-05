class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top=null;
    public void push(int data){
        Node temp=new Node(data);
        if(top==null)
            top=temp;
        else{
            temp.next=top;
            top=temp;
        }
    }
    public void pop(){
      if( top==null){
        System.out.println("stack is empty");
      }
      else {
        System.out.println("popped element = "+top.data);
        top=top.next;
      }
    }
    public void peek(){
      if( top==null){
        System.out.println("stack is empty");
      }
      else {
        System.out.println("Top element = "+top.data);
       }
    }
    public void display(){
        Node temp=top;
        if( top==null){
        System.out.println("stack is empty");
      }
      while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
      }
    }
}
class StackallLL{
public static void main (String[]args){
    Stack s=new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    System.out.println("the stack is");
    s.display();
    s.peek();
    s.pop();
    s.pop();
    System.out.println("After the element is popped the stack is ");
    s.display();
    s.peek();
}
}