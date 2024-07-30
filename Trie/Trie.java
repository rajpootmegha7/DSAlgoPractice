package org.example.Trie;

/**
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.
 * There are various applications of this data structure, such as autocomplete and spellchecker.
 *
 * Implement the Trie class:
 *
 * Trie() Initializes the trie object.
 * void insert(String word) Inserts the string word into the trie.
 * boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
 * boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
 *
 *
 * Example 1:
 *
 * Input
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * Output
 * [null, null, true, false, true, null, true]
 *
 * Explanation:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // return True
 * trie.search("app");     // return False
 * trie.startsWith("app"); // return True
 * trie.insert("app");
 * trie.search("app");     // return True
 *
 * Time complexity for this solution = O(M), space for insert O(M), search and starts with O(1)
 */

class Trie {
    private Node root;

    public Trie(){
        root = new Node('\0');
    }
    //insert a word in trie
    public void insert(String word){
        Node curr = root;
        for(int i= 0; i< word.length(); i++){
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null) curr.children[c - 'a'] = new Node(c);
            curr = curr.children[c - 'a'];
        }
        curr.is_Word = true;
    }
    //this helper function will return the last node in the word we are looking for.
    private Node getLastNode(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.children[c - 'a'] == null ) return null;
            curr = curr.children[c - 'a'];
        }
        return curr;
    }

    public boolean search(String word){
        Node node = getLastNode(word);
        return node !=null && node.is_Word;
    }

    public boolean startsWith(String prefix){
        return getLastNode(prefix) !=null;
    }
    public class Node {
        public char data;
        public boolean is_Word = false;
        public Node[] children;

        public Node(char c){
            this.data = c;
            is_Word = false;
            children = new Node[26];// 26 cos we are considering lower case letters.

        }
    }
}

/**Solution 2 :**/

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
