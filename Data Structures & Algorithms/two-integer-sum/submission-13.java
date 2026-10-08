class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
		int [] result = new int [2];
		
		for(int i = 0; i < nums.length; i++) {
			int needed = target - nums[i];
			
			if(map.containsKey(needed)) {
                if(i < map.get(needed)){
                    result[0] = i;
                    result[1] = map.get(needed);
                    return result;
                }
                result[0] = map.get(needed);
                result[1] = i;
			}
			
			map.put(nums[i],i);
		}
		return result;
    }
}
