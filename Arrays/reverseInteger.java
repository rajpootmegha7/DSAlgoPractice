class Solution {
    public int reverse(int x) { //123
        //Exit condition
        if(x < Math.pow(-2,31))return 0;
        if(x > (Math.pow(2,31))-1) return 0;
        
        //Main logic by mod first break the number and then form the number
        int finalnum = Integer.MIN_VALUE;
        while(x !=0){  
            int rem = x%10; //3 //rem =2 //1
            finalnum += rem;  //3 //32 /321
            finalnum = finalnum *10;  //finalnum = 30 //320 //3210
            x = x/10;         //12 //1 //0
        }
        finalnum = finalnum/10; //321
        if(x<0){
            return (-1*finalnum);
        }
        return finalnum;

    }
    
}
