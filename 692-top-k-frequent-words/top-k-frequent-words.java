/*class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length();

        HashMap<String , Integer> hm = new HashMap<>();
        for(String word : words){
            hm.put(hm.getOrDefault(word,0)+1);
        }




        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.length()-b.length()<0){
                return a.length();
            }
            return a.toCompare(b);
        });    
    }
    for(int i = 0 ; i< k ;i++){
        pq.add(words[i]);


    }
    for(int i = k ; i< n ;i++){
        if(pq.peek()>words[i]){
            continue;
        }
        else{
            pq.poll();
            pq.add(words[i]);
        }


    }
    String s = new String[words.length()];
    for(int i = 0 ; i< k;i++){
       s[i] =  pq.poll();
    }
    return s;
}






}
*/
class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Count frequency
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        // Min heap
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (!hm.get(a).equals(hm.get(b))) {
                return hm.get(a) - hm.get(b);
            }

            return b.compareTo(a);
        });

        // Keep only k best words
        for (String word : hm.keySet()) {
            pq.add(word);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Result
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}