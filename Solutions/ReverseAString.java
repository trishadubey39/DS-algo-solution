public class ReverseAString{
    public static void main(String[] args){
        char[] ca = {'b','a','c','d'};
        reverseString(ca);
    }

    public static void reverseString(char[] s) {
        int m =0 , n = s.length-1;

        while(m<n){
            char temp = s[m];
            s[m] = s[n];
            s[n]= temp;
            m+=1;
            n-=1;
        }

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

    }

}