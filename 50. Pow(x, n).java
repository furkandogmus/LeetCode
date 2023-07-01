class Solution {
    public double myPow(double x, int n) {
        if(x==0 && n!=0){
            return 0;
        }
        else if(x!=0 && n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        else if(n<0){
            double temp = myPow(x,-(n/2));
            if(n%2==0){
                return 1 / (temp*temp);
            }
            else{
                return 1 / (temp*temp*x);
            }
        }
        else{
            double temp = myPow(x,n/2);
            if(n%2==0){
                return temp*temp;
            }
            else{
                return temp*temp*x;
            }
        }
    }
}
