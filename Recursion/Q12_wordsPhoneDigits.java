class Solution
{
    private static final String[] KEYPAD = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> result = new ArrayList<>();
        generateWords(a, 0, N, new StringBuilder(), result);
        return result;
    }
    
    private static void generateWords(int[] a, int index, int N, StringBuilder current, ArrayList<String> result) {
        if (index == N) {
            result.add(current.toString());
            return;
        }
        
        String letters = KEYPAD[a[index]];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generateWords(a, index + 1, N, current, result);
            current.setLength(current.length() - 1);
        }
    }
}