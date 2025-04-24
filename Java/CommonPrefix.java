public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs == null || strs.length == 0) {
            return prefix;
        }

        char[] letters;
        letters = strs[0].toCharArray();
        
        for (int i = 0; i<letters.length; i++) {
            char letter = letters[i];
            for (int j = 1; j<strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != letter) {
                    return prefix;
                }
            }
            prefix += letter;
        }
        return prefix;
    }

    public static void main(String[] args) {
        CommonPrefix cp = new CommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(cp.longestCommonPrefix(strs)); // Output: "fl"
    }
    
}
