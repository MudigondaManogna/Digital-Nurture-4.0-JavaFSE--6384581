class VolumeController {
    private static VolumeController instance;
    private int volume = 50;

    // Private constructor to avoid creating the other objects
    private VolumeController() {
        System.out.println("Volume Controller initialized!");
    }

    // method to get Object
    public static VolumeController getInstance() {
        if (instance == null) {
            instance = new VolumeController();
        }
        return instance;
    }

    // volume setter method
    public void setVolume(int v) {
        this.volume = v;
        System.out.println("Volume set to " + volume);
    }

    // volume getter method
    public int getVolume() {
        return this.volume;
    }
}
