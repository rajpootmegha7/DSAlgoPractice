class TrieNode{
    //Create a map to store the trie node values.
    Map<Character, TrieNode> children = new HashMap<>();
    // this flag will identify if the last value of the node matches the word or not.
    public boolean isword = false;
}
class Trie {
    private TrieNode root;
    /**Initialize the data structure here */
    public Trie() {
        root = new TrieNode();
    }
    /**Insert a word into the trie */
    public void insert(String word) {
        TrieNode curNode = root;
        char[] arr = word.toCharArray();
        for(char curChar : arr){
            if(curNode.children.containsKey(curChar) == false){
                curNode.children.put(curChar, new TrieNode());
            }
            curNode = curNode.children.get(curChar);
        }
        curNode.isword = true;
    }
    /** return if the word is in the trie */
    public boolean search(String word) {
     TrieNode curNode = root;
     char[] arr = word.toCharArray();
     for(char curChar: arr){
         if(curNode.children.containsKey(curChar)==false){
             return false;
         }
         curNode = curNode.children.get(curChar);
     }   
     return curNode.isword;
    }
    /**Returns if tgere is any word in the trie that starts with the given prefix */
    public boolean startsWith(String prefix) {
        TrieNode curNode = root;
        char[] arr = prefix.toCharArray();
        for(char curChar: arr){
            if(curNode.children.containsKey(curChar)== false){
                return false;
            }
            curNode = curNode.children.get(curChar);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
