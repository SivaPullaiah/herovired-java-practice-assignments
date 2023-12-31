class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        sum(0, candidates, target, new ArrayList<>());
        return ans;
    }

    void sum(int i, int[] candidates, int target, List<Integer> cur){
        if(i == candidates.length){
            if(target ==0){
                ans.add(new ArrayList<>(cur));
            }
            return;
        }

        if(candidates[i] <= target){
            cur.add(candidates[i]);
            sum(i+1, candidates, target - candidates[i], cur);
            cur.remove(cur.size() -1);
        }
        while( i < candidates.length-1 && candidates[i] == candidates[i+1]){
            i++;
        }
        sum(i+1, candidates, target, cur);
    }
}