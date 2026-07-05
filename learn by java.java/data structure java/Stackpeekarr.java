class StackPeekarr {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }
    public static void main(String[] args) {
        StackPeekarr s = new StackPeekarr();
        s.push(400);
        s.push(100);
        s.peek();
    }
}