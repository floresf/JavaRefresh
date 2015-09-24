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


    public void makePriority(int listPosition) {

        listPosition -= 1;

        ListItem tempItem = this.list.get(listPosition);

        for (int i = listPosition; i > 0; i--) {

            //tempItem = this.list.get(i);

            this.list.set(i, this.list.get(i - 1));

        }

        this.list.set(0, tempItem);


    }


    public void clearList() {

        this.list.clear();
    }




    @Override
    public String toString() {

        String result = "";

        for (int i = 0; i < this.list.size(); i++) {

            result += (i + 1) + ". "  + this.list.get(i).toString() + "\n";

        }

        return result;

    }

}
