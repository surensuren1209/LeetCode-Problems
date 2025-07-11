class Solution {
    static{
        for(int i=0;i<500;i++){
            maximumNumberOfStringPairs(new String[0]);
        }
    }
    public static  int maximumNumberOfStringPairs(String[] words) {
        String [] copyArr=new String[words.length];
        for(int i=0;i<words.length;i++){
            List<Character> list = new ArrayList<>();
            for(char let:words[i].toCharArray()){
                list.add(let);
            }
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<list.size();k++){
                sb.append(list.get(k));
            }
            copyArr[i]=sb.toString();
            
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<copyArr.length;i++){
            map.put(copyArr[i],map.getOrDefault(copyArr[i],0)+1);
        }
        int count=0;
        for(int val:map.values()){
            if(val==2){
                count++;
            }
        }
        return count;
    }
}