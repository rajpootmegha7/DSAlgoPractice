class Solution {
    public int romanToInt(String s) { //III
        int num = 0;
        int cur = getNum(s.charAt(0)); //1
    for (int i = 1; i < s.length(); i++ ) {// length 3 
        int next = getNum(s.charAt(i)); //1
        if(cur < next){ 
            num -= cur;
        }else num +=cur; //2 +1 = 3
        
        cur = next; //1 
  
    }
    num += cur; //num = 2+1 = 3
   
    return num; 
    }

    public int getNum(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}