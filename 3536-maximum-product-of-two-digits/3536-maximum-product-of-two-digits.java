class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n%10;
            list.add(digit);
            n /= 10;
        }
        Collections.sort(list);
        int max = list.get(list.size()-1);
        int secMax = list.get(list.size()-2);
        return max*secMax;
    }
}