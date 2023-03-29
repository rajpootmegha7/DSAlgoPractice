/** Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Input: s = "()[]{}"
Output: true

**/

if (s.length() % 2 != 0) return false;
        // 1. Create a stack to keep record of characters.
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
                // 2. edge case where stack is empty and closig brackets are present.
            if ( stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'))
                    return false; 
                else {
                       if (!stack.isEmpty()) { //4. check is stack is not empty and closing brackets are present then pop
                            if ( stack.peek() == '(' && s.charAt(i) == ')'
                            ) stack.pop();
                            else if (stack.peek() == '{' && s.charAt(i) == '}' ) stack.pop(); 
                            else if (stack.peek() == '[' && s.charAt(i) == ']' ) stack.pop(); 
                            else stack.add(s.charAt(i)); // 5. stack is not empty and some thing else is there then add.
                        } else stack.add(s.charAt(i)); //3. First time it will add all the brackets to the stack.
            }
        }
        return stack.isEmpty(); // 6. Stack is empty after everything is removed returns true.
    }


//Solution 2 
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.length() % 2 != 0) return false;
        for(char ch : s.toCharArray()){
            switch(ch){
                case '(':
                case '{':
                case '[':
                    stk.push(ch);
                    break;
                case ']':
                    if(stk.isEmpty() || stk.pop()!='['){
                        return false;
                    }
                    break; 
                case '}':
                 if(stk.isEmpty() || stk.pop()!='{'){
                        return false;
                    }
                    break; 
                case ')':
                 if(stk.isEmpty() || stk.pop()!='('){
                        return false;
                    }
                    break; 

            }

        }
        
    
    return stk.isEmpty();
}
}
