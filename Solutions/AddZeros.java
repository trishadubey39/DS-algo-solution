class AddZeros{
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};

        duplicateZeros(nums);
    }


    public static void duplicateZeros(int[] arr) {
        int[] newArr = {1,0,2,3,0,4,5,0}; 
        int i =0 , j =0;
        
        while(i<arr.length-1){
            if(newArr[j]==0){
                arr[i+1] = 0;
                j++;
            }else{
                arr[i] = newArr[j];
                j++;
            }
            i++; 
        }
        

        for(int k : arr){
            System.out.print(k);
        }
    }
}