public class PeopleDetection implements Detection{
    public CameraSensor detect(CameraSensor camera){
        camera.set(camera.get()+" -->> PeopleDetection");
        return camera;
    }
}