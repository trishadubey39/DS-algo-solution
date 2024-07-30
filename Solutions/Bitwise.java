public class Bitwise {
    public static void main(String[] args) {
        
    }

    public static int intToBinarry(int num){
        StringBuilder binary = new StringBuilder();
        if(num ==0 ) return 0000;
        while(num>0){
            int bit = num% 2;
            binary.insert(0, bit);
            num/=2;
        }

        String b =binary.toString();
        return Integer.parseInt(binary);
    }
}
