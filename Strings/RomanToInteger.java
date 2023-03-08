class Solution {
    public int romanToInt(String s) {
    
        //Base condition ? we can try to validate if the s contains valid characters.
        for(int i = 0; i< s.length(); i++){
            int check = getVal(s.charAt(i));
            if(check == 0) return 0; // Assume if output is 0 then string is invalid.
        }
        
        //we can try to validate the length of the string 1 - 15
        if(s.length() >15 || s.length() < 1) return 0;
        //Right now in this case if we can assume that s is a valid roman numeral with in the same range.
        //Continue with Main logic
        int num = 0; //Integer.MIN_VALUE(); 
        // Min value of integer as -2^31 this way we can be certain that any value will be greater than this val(-ve).
        // But in our case if we are sure that values are not negative then we can use the 0 instead.
        int curr = getVal(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            int next = getVal(s.charAt(i));
            if(curr < next){
                num -= curr;
            } else {
                num += curr;
            }
            curr = next;      
        }
        num += curr; // This one is imp because the last val of curr(next) has to be added in the num.
        return num; // don't forget the return statement.
    }
    public int getVal(char ch){ // remember c is small in character.
    // switch statement complexity is O(n)
    switch(ch){
        case'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
    }
}
