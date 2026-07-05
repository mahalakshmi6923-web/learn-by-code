import java.util.Scanner;
class infixtopostarr{
    static int precedence(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String infix = sc.nextLine();
        char stack[] = new char[100];
        int top = -1;
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack[++top] = ch;
            }
            else if (ch == ')') {
                while (top != -1 && stack[top] != '(') {
                    postfix += stack[top--];
                }
                top--;
            }
            else {
                while (top != -1 && precedence(ch) <= precedence(stack[top])) {
                    postfix += stack[top--];
                }
                stack[++top] = ch;
            }
        }
        while (top != -1) {
            postfix += stack[top--];
        }
        System.out.println("Postfix Expression: " + postfix);
    }
}