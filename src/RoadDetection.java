public class RoadDetection implements Detection{
    public CameraSensor detect(CameraSensor camera){
        camera.set(camera.get()+" -->> RoadDetection");
        return camera;
    }
}


