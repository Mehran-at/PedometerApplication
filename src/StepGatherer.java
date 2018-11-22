import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {
    private Integer person = 3;

    public List<Integer> stepGatherer() {
        List<Integer> numberOfSteps = new ArrayList<>();
        for (Integer times = 0; times < person; times++) {
            System.out.println("How many steps you walk?");
            Scanner scanner = new Scanner(System.in);
            Integer steps = scanner.nextInt();
            numberOfSteps.add(steps);
        }
        return numberOfSteps;
    }
}
