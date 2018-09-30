package project.POJO.ListDefinition;

import org.springframework.beans.factory.annotation.Required;
import java.util.List;

public class MyXmlList {
    private List<ListClasses> myList;

    @Required
    public void setMyList(List<ListClasses> myList) {
        this.myList = myList;
    }


    public void printList() {
        for (ListClasses listClasses : myList) {
            listClasses.getName();
        }
    }
}
