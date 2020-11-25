public class LidarSensor  implements  Element{
    private String name;

    public LidarSensor(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("LidarSensor: "+this.name);
    }
}
