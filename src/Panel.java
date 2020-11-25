import java.util.ArrayList;

public class Panel implements Element {
    private String name;
    private ArrayList<Element> content = new ArrayList<Element>();

    public Panel(String name) {
        this.name = name;
    }

    public int addElement(Element element) {
        content.add(element);
        return content.indexOf(element);
    }

    public void remove(Element element) {
        content.remove(element);
    }

    public Element getElement(int index) {
        return content.get(index);
    }

    @Override
    public void print() {
        System.out.println(name);

        for (Element el : content) {
            el.print();
        }
    }
}
