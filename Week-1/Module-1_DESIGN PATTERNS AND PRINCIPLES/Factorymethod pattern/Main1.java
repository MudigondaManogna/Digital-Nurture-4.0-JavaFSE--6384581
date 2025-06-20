public class Main1 {
    public static void main(String[] args) {
        WeatherAlert alert = WeatherAlertFactory.getAlert("rain");
        alert.sendAlert();
    }
}