class Main {
    public static void main(String[] args) {
        double principalAmount = 1500;
        double growthRate = 0.5;
        int timePeriod = 3;
        double forecastByRecursion = ForecastingTool.forecastRecursively(principalAmount, growthRate, timePeriod);
        System.out.printf("Recursive Forecast: Future value after %d years: %.2f\n", timePeriod, forecastByRecursion);
        double forecastByIteration = ForecastingTool.forecastIteratively(principalAmount, growthRate, timePeriod);
        System.out.printf("Iterative Forecast: Future value after %d years: %.2f\n", timePeriod, forecastByIteration);
    }
}
