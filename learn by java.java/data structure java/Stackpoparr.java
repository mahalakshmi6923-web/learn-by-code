class StackPop {
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
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }
    public static void main(String[] args) {
        StackPop s = new StackPop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
    }
}