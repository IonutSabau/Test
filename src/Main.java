public class Main {

    public static void main(String[] args) {
        DigitalCar DgtCar = new DigitalCar("SuperCar");

        TempertureSensor tmpS1 = new TempertureSensor("Temperture 1");
        DgtCar.addElement(tmpS1);

        Panel pnl1 = new Panel("Panel 1");
        DgtCar.addElement(pnl1);
        CameraSensor cmrS1 = new CameraSensor("Camera 1");
        CameraSensor cmrS2 = new CameraSensor("Camera 2");
        CameraSensor cmrS3 = new CameraSensor("Camera 3");

        cmrS1.setDetectionType(new RoadDetection());
        cmrS2.setDetectionType(new SignDetection());
        cmrS3.setDetectionType(new PeopleDetection());

        ProximitySensor prxS = new ProximitySensor("Proximity 1");
        LidarSensor ldrS = new LidarSensor("Lidar 1");
        TempertureSensor tmpS2 = new TempertureSensor("Temperture 2");

        pnl1.addElement(cmrS1);
        pnl1.addElement(cmrS2);
        pnl1.addElement(cmrS3);
        pnl1.addElement(prxS);
        pnl1.addElement(ldrS);
        pnl1.addElement(tmpS2);

        Panel pnl2 = new Panel("Panel 2");
        DgtCar.addElement(pnl2);


        DgtCar.print();
    }
}

