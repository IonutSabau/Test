public class ProximitySensor implements Element{
    private String name;

    public ProximitySensor(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("ProximitySensor: "+this.name);
    }
}
