public class SignDetection implements Detection{
    public CameraSensor detect(CameraSensor camera){
        camera.set(camera.get()+" -->> SignDetection");
        return camera;
    }
}