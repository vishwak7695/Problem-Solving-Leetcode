class Solution {
    public String reverseVowels(String s) {
        Stack<Character> sk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // Push all vowels into the stack
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                sk.push(ch);
            }
        }

        // Replace vowels with vowels popped from stack
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                sb.append(sk.pop());
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}