import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("Juan", 10));
        workerList.add(new Worker("María", 15));
        workerList.add(new Worker("Julian", 2));

        workerList.sort(null);

        System.out.println(workerList);


    }
}