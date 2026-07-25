class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            int digit = n%10;
            list.add(digit);
            n /= 10;
        }
        int lar = list.get(0);
        int small = 0;
        for(int i = 1; i< list.size(); i++){
            if(list.get(i) >= lar){
                small = lar;
                lar = list.get(i);
            }else if(list.get(i) < lar && list.get(i) > small){
                small = list.get(i);
            }
        }
        return small*lar;
        // Collections.sort(list);
        // int max = list.get(list.size()-1);
        // int secMax = list.get(list.size()-2);
        // return max*secMax;
    }
}