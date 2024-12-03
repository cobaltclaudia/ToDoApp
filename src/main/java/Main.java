import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));
        ArrayList list = new ArrayList();
        String task;

        try {
            System.out.println("Enter a task: ");
            task = bfn.readLine();
            list.add(task);
            System.out.println("List so far: ");
            for (Object o : list) {
                System.out.println("- " + o);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
