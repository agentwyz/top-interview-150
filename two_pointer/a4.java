class Solution {
    public int maxArea(int[] num) {
        int len = num.length;
        
        int i = 0; int j = len - 1;
        int area = 0;
        while (i < j) {
            int max = 0;
            if (num[i] >= num[j]) {
                max = num[j] * (j - i);
                j--;
            } else {
                max = num[i] * (j - i);
                i++;
            }
            area = Math.max(area,max);
        }

        return area;
    }
}