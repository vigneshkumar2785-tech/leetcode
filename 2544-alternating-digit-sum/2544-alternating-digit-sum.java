class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
      while(n >0)
      {
        int digit = n % 10;
        sum = sum + digit * sign;
        sign = -sign;
        n = n/10;
      }  
      return sum * -sign;
    }
}