class Solution {
public:
    bool rotateString(string s, string goal) {
        // Check if the lengths are different
        if (s.length() != goal.length()) return false;

        // Create a new string by concatenating 's' with itself
        string doubledString = s + s;
        
        return doubledString.find(goal) < doubledString.length();
    }
};