class Solution {
    public String interpret(String str) {
        return str.replace("()","o").replace("(","").replace(")",""); 
    }
}