class Solution {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for (String x : strs) s.append(x.length()).append("#").append(x);
        return s.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length();) {
            int j = s.indexOf('#', i);
            int n = Integer.parseInt(s.substring(i, j));
            res.add(s.substring(j + 1, j + 1 + n));
            i = j + 1 + n;
        }
        return res;
    }
}