import java.util.List;

/**
 * Created by fernandoflores on 9/23/15.
 */
public class Main {

    public static void main(String[] args) {


        ToDoList mondays = new ToDoList();

        ListItem item1 = new ListItem("Finish Laundry", false);

        ListItem item2 = new ListItem("Wash Feet", false);

        ListItem item3 = new ListItem("Watch new ep. of Mad Men", false);



        mondays.addListItem(item1);

        mondays.addListItem(item2);

        mondays.addListItem(item3);


        System.out.println(mondays.toString());

        System.out.println();

        mondays.makePriority(2);

        System.out.println(mondays.toString());

        item2.setComplete(true);

        System.out.println(mondays.toString());






    }
}
