
import java.util.HashMap;

public class MaxPointsOnALine {
    public static void main(String[] args) {
        int[][] arr = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(arr));
    }

    public static int maxPoints(int[][] points) {
        int res = 2;
        int n = points.length;
        if (n == 1)
            return 1;
            
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int extra = 2;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;
                    int p1 = points[i][0] * (points[j][1] - points[k][1]);// x1(y2 – y3)
                    int p2 = points[j][0] * (points[k][1] - points[i][1]);// x2(y3 – y1)
                    int p3 = points[k][0] * (points[i][1] - points[j][1]);// x3(y1 – y2)
                    if (p1 + p2 + p3 == 0)
                        extra++;
                }

                res = Math.max(res, extra);
            }
        }
        return res;
  }
}

// int ans=1;
// for(int i=0;i<p.size();i++){
// unordered_map<double,int>m;
// for(int j=0;j<p.size();j++){
// if(i==j){
// continue;
// }

// double num=(double)(p[i][0]-p[j][0])/(p[i][1]-p[j][1]);
// double val=atan(num);

// m[val]++;
// ans=max(ans,m[val]+1);

// }
// cout<<endl;
// }
// return ans;
// }
