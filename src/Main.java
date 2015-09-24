import java.util.List;

/**
 * Created by fernandoflores on 9/23/15.
 */
public class Main {

    public static void main(String[] args) {


        ToDoList mondays = new ToDoList();

        ListItem testList = new ListItem("Finish Laundry", false);


        mondays.addListItem(testList);


        System.out.println(mondays.toString());












    }
}
