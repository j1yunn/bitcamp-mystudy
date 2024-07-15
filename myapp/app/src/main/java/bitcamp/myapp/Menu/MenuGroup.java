package bitcamp.myapp.Menu;

import java.util.ArrayList;

public class MenuGroup implements Menu {

    private String title;
    private ArrayList<Menu> children = new ArrayList<>();

    public MenuGroup(String title) {
        this.title = title;
    }

    @Override
    public void execute() {

    }

    public void addMenu(Menu menu) {
        children.add(menu);
    }

    public void remonveMenu(Menu menu) {
        children.remove(menu);
    }

    public Menu getMenu(int index) {
        return children.get(index);
    }
    public int

}
