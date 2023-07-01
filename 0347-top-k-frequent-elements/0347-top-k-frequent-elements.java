class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        hm = sortHashMapByValue(hm);
        int[] result = new int[k];
        Object[] keySet = hm.keySet().toArray();
        for (int i = 0; i < k; i++) {
            result[i] = (int)keySet[i];
        }
        return result;
    }
    public static LinkedHashMap<Integer, Integer> sortHashMapByValue(HashMap<Integer, Integer> hashMap) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}