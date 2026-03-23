class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer> rom = new HashMap<>();
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);
        int total = 0;
        for(int i =0 ; i<s.length()-1 ;i++)
        {
            int current = rom.get(s.charAt(i));
            int next = rom.get(s.charAt(i+1));
            if(current <next)
            {
                       total -= current;
            } else {
                total += current;
            }
        }
        
        total += rom.get(s.charAt(s.length() - 1));

        return total;


        }
    }
