// Last updated: 4/8/2026, 7:08:15 PM
1import java.util.*;
2
3class MyStack {
4
5    Queue<Integer> q;
6
7    public MyStack() {
8        q = new LinkedList<>();
9    }
10    
11    public void push(int x) {
12        int s = q.size();
13        q.add(x);
14
15        for (int i = 0; i < s; i++) {
16            q.add(q.poll());
17        }
18    }
19    
20    public int pop() {
21        return q.poll();
22    }
23    
24    public int top() {
25        return q.peek(); 
26    }
27    
28    public boolean empty() {
29        return q.isEmpty();
30    }
31}