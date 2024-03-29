/**
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Using Hashmap and comparator solved it.
*/

class Solution {
    public int[] topKFrequent(int[] nums, int num) {
        int[] out = new int[num];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val: nums
             ) {
            if(!hm.containsKey(val)){
                hm.put(val,1);
            } else {
               int count = hm.get(val);
               hm.put(val, count+1);
            }
        }
        //Another way to print the hashmap using lambda.
        hm.forEach((key,v) -> System.out.println(key+" and "+ v));
        Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
       
        // Using collections and overload the comparator interface compare function.
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue()) return 0;
                else if(o1.getValue() < o2.getValue()) return 1;
                else return -1;
            }
        });
        // lambda to print hashmap.
        list.forEach(s -> System.out.println(s.getKey()+ "and "+ s.getValue())); 
        
        int i =num -1;
        // convert the list to array.
        while(num-->0){
            Map.Entry<Integer, Integer> en = list.get(i);
            out[i] = en.getKey();
            i--;
        }
        return out;
    }
    
    
    //Solution 2 using priority queue
    
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
            a.getValue() - b.getValue()
        );
        
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }
        
        return arr;
    }
}
}
