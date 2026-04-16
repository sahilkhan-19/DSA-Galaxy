// Last updated: 4/16/2026, 10:00:21 PM
1class MinStack {
2    private Stack<int[]> stack;
3    public MinStack() {
4        stack = new Stack<>();
5    }
6    
7    public void push(int val) {
8        if(stack.isEmpty()){
9            stack.push(new int[]{val,val});
10        }
11        else{
12            int currMin = stack.peek()[1];
13            stack.push(new int[]{val, Math.min(val, currMin)});
14        }
15    }
16    
17    public void pop() {
18        stack.pop();
19    }
20    
21    public int top() {
22        return stack.peek()[0];
23    }
24    
25    public int getMin() {
26        return stack.peek()[1];
27    }
28}
29
30/**
31 * Your MinStack object will be instantiated and called as such:
32 * MinStack obj = new MinStack();
33 * obj.push(val);
34 * obj.pop();
35 * int param_3 = obj.top();
36 * int param_4 = obj.getMin();
37 */