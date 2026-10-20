class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            }
            countMap.put(num, countMap.get(num) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());

        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
