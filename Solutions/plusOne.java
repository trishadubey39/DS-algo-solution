public class plusOne {
    public static void main(String[] args) {

        int[] arr = {9};
        int[] newp = plusOne(arr);
        System.out.println(newp[0]);
        
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1] != 9){
            digits[digits.length-1] = digits[digits.length-1] +1 ;
            return digits;
        }else{
            int[] arr = new int[digits.length];
            boolean borrow = false;
            for(int i =arr.length-1;i>0;i--){
                if(i==arr.length){
                    arr[i] = 0;
                }else{
                        if(digits[i]==9){
                            borrow = true;
                            arr[i]=0;
                        }else{
                          borrow = false;
                          arr[i]=digits[i]+1;  
                        }
                    // }else{
                    //     borrow = false;
                    //     arr[i] = digits[i];
                    // }
                }
                
            }
            return arr;
        }
    }
}
