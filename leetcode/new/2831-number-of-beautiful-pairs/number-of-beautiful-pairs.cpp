class Solution {
public:
    int countBeautifulPairs(vector<int>& nums) {
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int firstDigit = nums[i];

            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            for (int j = i + 1; j < n; j++) {
                int lastDigit = nums[j] % 10;

                if (__gcd(firstDigit, lastDigit) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
};