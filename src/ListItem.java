/**
 * Created by fernandoflores on 9/23/15.
 */
public class ListItem {


    String content;

    Boolean complete;





    public ListItem(String content, boolean complete) {

        this.content = content;
        this.complete = complete;


    }


    public void setComplete(boolean complete) {

        this.complete = complete;

    }


    public boolean getComplete() {

        return this.complete;

    }


}
