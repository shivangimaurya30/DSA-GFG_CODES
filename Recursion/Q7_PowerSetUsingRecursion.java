
class LexSort

    {
        // add your code here
         static ArrayList<String> powerSet(String s)
    {
        // add your code here
         ArrayList<String> result = new ArrayList<>();
        generatePowSet(s, 0, "", result);
        return result;
    }
    private static void generatePowSet(String s, int index, String current, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }
        generatePowSet(s, index + 1, current + s.charAt(index), result); 
        generatePowSet(s, index + 1, current, result);
    }
}