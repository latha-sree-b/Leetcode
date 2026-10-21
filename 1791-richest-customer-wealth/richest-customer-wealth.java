class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int currentCustomerSum=0;
            for(int j=0;j<accounts[i].length;j++){
                currentCustomerSum +=accounts[i][j];

            }
            maxWealth=Math.max(maxWealth,currentCustomerSum);
        }
        return maxWealth;
        
    }
}