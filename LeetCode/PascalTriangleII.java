import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangleII {
        public static List<Integer> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>(numRows+1);

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                row.set(j,val);
            }
            result.add(row);
        }
        return result.get(numRows - 1);
    }

    public static void main(String[] args) {
        int numRows = 2;
        List<Integer> row = generate(numRows);
        System.out.println(row);
    }
}
