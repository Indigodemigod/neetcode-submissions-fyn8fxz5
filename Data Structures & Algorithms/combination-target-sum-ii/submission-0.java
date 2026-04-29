class Solution {
    List<List<Integer>> ans;
    private void combinationSum(int[] candidates, int target, int idx, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == candidates.length || target < 0){
            return;
        }
        for(int num = idx ; num < candidates.length; num++){
            if(num > idx && candidates[num] == candidates[num-1]){
                continue;
            }
            list.add(candidates[num]);
            combinationSum(candidates, target - candidates[num], num + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, new ArrayList<>());
        return ans;
    }
}