class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<n ;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i])
            {
               int index=  st.pop();
               arr[index]= i -index;
                
            }
            st.push(i);

        }
        return arr;

        
    }
}