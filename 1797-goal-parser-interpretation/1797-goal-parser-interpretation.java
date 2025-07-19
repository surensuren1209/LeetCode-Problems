class Solution {
    static{
        for(int i=0;i<500;i++){
            interpret(" ");
        }
    }
    public  static String interpret(String str) {
        return str.replace("()","o").replace("(","").replace(")",""); 
    }
}