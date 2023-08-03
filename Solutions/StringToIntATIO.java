public class StringToIntATIO {
    public static void main(String[] args) {
        System.out.print(myAtoi("-+12"));
    }

    public static int myAtoi(String s) {
        int num = 0;
        Boolean containsMinus = false;
       for(int i =0;i<s.length();i++){
        if((s.charAt(i)=='+' && s.charAt(i+1) =='-') ||( s.charAt(i)=='-'&& s.charAt(i+1) =='+' ) )
            return 0;
        else if(s.charAt(i)==' '||s.charAt(i)=='+'){
            
        }else if(s.charAt(i)=='.'){
            break;
        }
       else if(s.charAt(i) =='-')
            containsMinus = true;
        else if(s.charAt(i) >= '0' && s.charAt(i)<='9' ){
            num = num *10 + (s.charAt(i)-'0');
            if(num > (Integer.MAX_VALUE - (s.charAt(i)-'0')) / 10)
                return containsMinus?Integer.MIN_VALUE: Integer.MAX_VALUE;

        }else if(num ==0){
            return 0;
        }
            
       }
        return containsMinus?(int)num*-1 :(int)num;
    }
}
