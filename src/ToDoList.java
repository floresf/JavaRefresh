import java.util.ArrayList;
import java.util.List;

/**
 * Created by fernandoflores on 9/23/15.
 */
public class ToDoList {


    ArrayList<ListItem> list;

    public ToDoList() {

        this.list = new ArrayList<ListItem>();

    }


    public void addListItem(ListItem listItem) {

        this.list.add(listItem);

    }


    @Override
    public String toString() {

        String result = "";

        for (int i = 0; i < this.list.size(); i++) {

            result += this.list.get(i).toString() + "\n";

        }

        return result;

    }

}