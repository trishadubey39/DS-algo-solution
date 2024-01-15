public class ReverseWordsinaString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
    
        String[] splits = s.trim().split("\\s+");
        String temp = "";
        String result = "";
        int start = 0, end = splits.length - 1;

        while (start < end) {
            temp = splits[start];
            splits[start] = splits[end];
            splits[end] = temp;
            start++;
            end--;
        }

        for (String g : splits) {
            result += g + " ";
        }

        return result.trim();
    }
}
