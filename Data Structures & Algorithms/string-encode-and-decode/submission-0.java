class Solution {
    public String encode(List<String> strs) {
        String s = "";
        for (String st : strs) {
            s = s + st.length() + "#" + st;
        }

        return s;
    }

    public List<String> decode(String str) {
        List<String> st = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, hashIndex));

            int wordstart = hashIndex + 1;
            int wordEnd = wordstart + length;

            String word = str.substring(wordstart, wordEnd);

            st.add(word);
            i = wordEnd;
        }
        return st;
    }
}
