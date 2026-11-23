class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int pop=x%10;
            x/=10;
            int temp=rev*10+pop;
            if((temp-pop)/10!=rev){
                return 0;

            }
            rev=temp;
        }
        return rev;
    }
}