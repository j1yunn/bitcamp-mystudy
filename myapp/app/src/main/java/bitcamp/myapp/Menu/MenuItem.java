package bitcamp.myapp.Menu;

public class MenuItem implements Menu {

    private String title;

    public MenuItem(String title) {
        this.title = title;
    }

    @Override
    public void exetcute() {
        System.out.println();
    }
}
