import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {

    public Double calculateAverage(List<Integer> inputNums) {
        Integer total = 0;
        for (Integer num : inputNums) {
            total+= num;
        }
        int size1 = inputNums.size();
        Double size = new Double(size1);
        Double avarage = total / size;
        return avarage;
  }
}