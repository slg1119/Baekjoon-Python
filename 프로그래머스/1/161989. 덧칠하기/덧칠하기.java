class Solution {
    public int solution(int n, int m, int[] section) {
        int ans = 0;
        int max = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue;
            }
            ans++;
            max = section[i] + m;
        }

        return ans;
    }
}