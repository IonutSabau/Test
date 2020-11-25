import java.util.ArrayList;

public class DigitalCar {
    private  String name;
    private ArrayList<Element> content = new ArrayList<Element>();

    public DigitalCar(String name){
        this.name = name;
    }

    public int addElement(Element element){
        this.content.add(element);
        return this.content.indexOf(element);
    }

    public void  print(){
        System.out.println("DigitalCar name: "+this.name);
        for(Element el : this.content){
            el.print();
        }
    }

}
