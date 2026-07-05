class Stackdisplayarr {
    int size = 5;
    int stack[] = new int[size];
    int top = -1;
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
    public static void main(String[] args) {
        Stackdisplayarr s = new Stackdisplayarr();
        s.stack[0] = 10;
        s.stack[1] = 20;
        s.stack[2] = 30;
        s.top = 2;
        s.display();
    }
}