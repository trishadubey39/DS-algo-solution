public class StringToIntATIO {
    public static void main(String[] args) {
        System.out.print(myAtoi("-+12"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        boolean isNegative = false;
        int num = 0;
        int i = 0;
        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            int digit = Character.getNumericValue(c);
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + digit;
        }

        return isNegative ? -num : num;
        
    //     int num = 0;
    //     Boolean containsMinus = false;
    //    for(int i =0;i<s.length();i++){
    //     if((s.charAt(i)=='+' && s.charAt(i+1) =='-') ||( s.charAt(i)=='-'&& s.charAt(i+1) =='+' ) )
    //         return 0;
    //     else if(s.charAt(i)==' '||s.charAt(i)=='+'){
            
    //     }else if(s.charAt(i)=='.'){
    //         break;
    //     }
    //    else if(s.charAt(i) =='-')
    //         containsMinus = true;
    //     else if(s.charAt(i) >= '0' && s.charAt(i)<='9' ){
    //         num = num *10 + (s.charAt(i)-'0');
    //         if(num > (Integer.MAX_VALUE - (s.charAt(i)-'0')) / 10)
    //             return containsMinus?Integer.MIN_VALUE: Integer.MAX_VALUE;

    //     }else if(num ==0){
    //         return 0;
    //     }
            
    //    }
    //     return containsMinus?(int)num*-1 :(int)num;
    }
}
