class StackPusharr {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    public static void main(String[] args) {
        StackPusharr s = new StackPusharr();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
    }
}