class WeatherAlertFactory {
    public static WeatherAlert getAlert(String weatherType) {
        if (weatherType == null)
            return null;

        switch (weatherType.toLowerCase()) {
            case "rain":
                return new RainAlert();
            case "sun":
                return new SunAlert();
            case "storm":
                return new StormAlert();
            default:
                return new DefaultAlert();
        }
    }
}
