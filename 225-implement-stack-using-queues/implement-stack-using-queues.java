import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
        int size = q.size();
        // Rotate the queue: move all elements before x to the back
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        return q.poll(); // Now the last pushed element is at the front
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */