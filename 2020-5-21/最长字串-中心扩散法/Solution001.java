class Solution001 {
    public String longestPalindrome(String s) {
        //中心扩散法
        if(s.length()<2){
            return s;
        }
        char[] charArray = s.toCharArray();//编程字符数组
        int start = 0, end =0;
        for(int i=0;i<s.length();i++){
            int flag1 = expand(charArray,i,i);
            int flag2 = expand(charArray,i,i+1);
            int max = Math.max(flag1,flag2);//最大的值
            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start,end+1);
    }

    //start 向前扩展   end 向后扩展
    public int expand(char[] charArray,int start,int end){
        while(start>=0&&end<charArray.length&&start<=end&&charArray[start]==charArray[end]){
            start--;
            end++;
        }
        return end-start-1;
    }
}