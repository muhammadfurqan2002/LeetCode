import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>(numRows);

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                row.set(j,val);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);
        
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }        
    }
}
