// class StockSpanner {
//     class pair{
//         int index; 
//         int price;
//         pair(Integer index , Integer price)
//         {
//             this.price = price;
//             this.index = index;
//         }
//     }
//     Stack<pair> st = new Stack<>();
//     int index = -1;

//     public StockSpanner() {
        
//     }
    
//     public int next(int price) {
//         index ++;
//         pair pq = new pair(price , index);
//         while(!st.isEmpty() && price >= st.peek().price)
//         {
//             st.pop();
//         }
//         if(st.isEmpty())
//         {
//             st.push(pq);
//             return index+1;
//         }
//         else
//         {
//             int prev = st.peek().index;
//             st.push(pq);
//             return index - prev;
//         }
    
        
//     }
// }


class StockSpanner
{
    Stack<int[]> st;
    public StockSpanner()
    {
        st = new Stack<>();
    }
    public int next(int price)
    {
        int span = 1;
        while(!st.isEmpty() && st.peek()[0]<=price)
        {
            span += st.pop()[1];
        }
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */