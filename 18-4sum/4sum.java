class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> s = new HashSet<>();
                for(int k=j+1;k<n;k++){ 
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    sum = target - sum;

                    if(s.contains(sum)){
                        List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k],(int)sum);
                        ls.sort(null);
                        set.add(ls);
                    }
                    s.add((long)nums[k]);
                }
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}