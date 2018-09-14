package SpringCourse.ContextDemo.POJO.ListDefinition;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyJavaList {
    @Autowired
    private List<ListClasses> myList;

    public void printList() {
        for (ListClasses listClasses : myList) {
            listClasses.getName();
        }
    }
}
