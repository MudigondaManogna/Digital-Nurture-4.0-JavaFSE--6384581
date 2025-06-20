public class Main {
    public static void main(String[] args) {
        VolumeController vc1 = VolumeController.getInstance();// create first instance
        vc1.setVolume(30); // Volume set to 30

        VolumeController vc2 = VolumeController.getInstance();// create another instance
        System.out.println("App 2 sees volume: " + vc2.getVolume());
        System.out.println(vc1 == vc2);// check if they are same objects
    }
}