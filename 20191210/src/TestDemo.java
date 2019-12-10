import java.util.Stack;
//括号匹配问题
public class TestDemo {
    public static  boolean isValid(String s) {
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    System.out.println("右括号较多");
                    return false;
                }
                char top = (char) stack.peek();
                if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                    stack.pop();
                } else {
                    System.out.println("右括号匹配错误！");
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("左括号比较多");
            return false;
        }
        return  true;
    }

    public static void main2(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        System.out.println(myStack.pop());//已经拿出
        System.out.println(myStack.getTop());//取的为新的top
        MyStack myStack2 = new MyStack();
        myStack2.push("java");
        myStack2.push("20");
        myStack2.push("bit");
        myStack2.push("ChongYa");
        System.out.println(myStack2.pop());
        System.out.println(myStack2.getTop());

    }
    public static void main1(String[] args) {
        MyListQueue myListQueue = new MyListQueue();
        myListQueue.offer(1);
        myListQueue.offer(2);
        myListQueue.offer(3);
        myListQueue.offer(4);
        System.out.println(myListQueue.poll());//1
        System.out.println(myListQueue.peek());//2


    }
 }

