class Solution {

    Map<Integer, List<Integer>> map;
    Random rand;

    public Solution(int[] nums) {

        map = new HashMap<>();
        rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
    }

    public int pick(int target) {

        List<Integer> list = map.get(target);

        int randomIndex = rand.nextInt(list.size());

        return list.get(randomIndex);
    }
}