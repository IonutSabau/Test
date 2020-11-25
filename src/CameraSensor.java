public class CameraSensor implements Element{
    private String name;

    public CameraSensor(String name){
        this.name=name;
    }
    public void setDetectionType(Detection detection){
        this.name = detection.detect(this).name;
    }

    public void set(String name) {
        this.name = name;
    }
    public String get() {
        return this.name;
    }
    public void print(){
        System.out.println("CameraSensor: "+this.name);
    }
}
