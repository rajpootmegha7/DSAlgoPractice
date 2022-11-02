//Question 
    //input ["abc", "megha","son"]
    //encode - 3#abc5#megha3#son
    
    //Encode and decode strings
    public String encode(List<String> strs){
        StringBuilder encodedStr = new StringBuilder();
        for (String str: strs
             ) {
            encodedStr.append(str.length()).append('#').append(str);
        }
        return encodedStr.toString();
    }
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i; // trying to find # in our case it will stop at 1
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j)); // saving the number because that is the length of string.
            i = j + 1 + length; // Move i till the end of the string. 
            list.add(str.substring(j + 1, i)); //then from J+1 because j is at # till the end of new assigned i.
        }
        return list;
    }
}
