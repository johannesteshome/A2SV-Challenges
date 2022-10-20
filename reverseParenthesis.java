class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = s.length(), pair[] = new int[n], index = 0, step = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        while (index < n) {
            if (s.charAt(index) == '(' || s.charAt(index) == ')') {
                index = pair[index];
                step = -step;
            } else sb.append(s.charAt(index));
            index += step;
        }
        return sb.toString();
    }
}
