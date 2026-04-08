// Last updated: 4/8/2026, 7:16:37 PM
1import java.util.*;
2
3class MyQueue {
4
5    Stack<Integer> in;
6    Stack<Integer> out;
7
8    public MyQueue() {
9        in = new Stack<>();
10        out = new Stack<>();
11    }
12    
13    public void push(int x) {
14        in.push(x); // always push to input stack
15    }
16    
17    public int pop() {
18        shift();
19        return out.pop();
20    }
21    
22    public int peek() {
23        shift();
24        return out.peek();
25    }
26    
27    public boolean empty() {
28        return in.isEmpty() && out.isEmpty();
29    }
30
31    // helper function
32    private void shift() {
33        if (out.isEmpty()) {
34            while (!in.isEmpty()) {
35                out.push(in.pop());
36            }
37        }
38    }
39}