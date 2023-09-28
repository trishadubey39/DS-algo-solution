public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }
    public static String convert(String s, int numRows) {
        String chars = "";
        for(int i=0;i<numRows;i++){
            int inc = 2*(numRows-1);
            for(int j =i;j<s.length();j++){
                chars = chars+chars +s.charAt(i);
                if((i>0) && (i<numRows-1) && ((j+inc-2*i)<s.length())){
                    chars +=s.charAt(j+inc -2*i);
                }
            }
        }

        return chars;
    }
}
