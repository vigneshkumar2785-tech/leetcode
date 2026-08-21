class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer> pascal = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    row.add(pascal.get(j-1) +pascal.get(j));
                }
            }
                pascal =row;
        }
        return pascal;
    }
}