class ForecastingTool {
    // Recursive approach to estimate future investment
    static double forecastRecursively(double principal, double growthRate, int timePeriod) {
        if (timePeriod == 0) return principal;
        return (1 + growthRate) * forecastRecursively(principal, growthRate, timePeriod - 1);
    }

    // Iterative approach to estimate future investment
    static double forecastIteratively(double principal, double growthRate, int timePeriod) {
        double futureValue = principal;
        for (int year = 0; year < timePeriod; year++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
