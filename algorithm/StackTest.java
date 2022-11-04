import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(5);
        st.push(4);
        st.pop();
        st.push(6);
        st.pop();
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
