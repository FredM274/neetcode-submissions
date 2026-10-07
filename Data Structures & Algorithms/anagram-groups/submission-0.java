class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList <String> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
