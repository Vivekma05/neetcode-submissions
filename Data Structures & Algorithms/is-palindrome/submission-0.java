class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String a=new StringBuilder(s).reverse().toString();
        if(s.equals(a)){
            return true;
        }
        return false;
    }
}
