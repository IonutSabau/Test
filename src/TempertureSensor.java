public class TempertureSensor implements  Element{
    private String name;

    public TempertureSensor(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("TempertureSensor: "+this.name);
    }
}
