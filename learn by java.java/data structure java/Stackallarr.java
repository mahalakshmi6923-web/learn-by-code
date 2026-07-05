class Stackall{
    
int top = -1;
    int size = 5;
    int stack[] = new int[size];
    void push(int d) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = d;
            System.out.println(d + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
public class Stackallarr {
    public static void main(String[]args){
        Stackall s=new Stackall();
        s.push(8);
        s.push(4);
        s.push(6);
        s.push(8);
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
