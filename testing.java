import java.util.*;

public class testing {
    private List<String> items; 
    public testing() {
        items = new ArrayList<>();
    } 
    public void addItem(String item) {
        items.add(item);
    }
    public List<String> getItems() {
        return items;
    }
}
