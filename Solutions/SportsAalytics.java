public class SportsAalytics {
    
    public int[] resultMatrix(int input1, int[][]input2){
    int[] result = new int[input1];
    int sum =0;
    int prevSum =0;

    for(int i =0;i<input2.length; i++){
        result[i]=0;
        prevSum = sum;
        sum =0;
        for(int j =0;j<input2[i].length; j++){
            if(input2[i][j]!=2 ){
                sum = input2[i][j];
                if(sum > prevSum){
                    result[i] = 1; 
                }
            }
        }
    }

    return result;
    // throw new UnsupportedOperationException("resultMatrix(int input1,int[][] input2)");

}
}

