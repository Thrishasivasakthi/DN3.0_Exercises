package FinancialForecastingExample;

public class FinancialForecasting {
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
        }
        
        double nextValue = currentValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000.0; 
        double growthRate = 0.005; 
        int years = 50; 

        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.println("Predicted Future Value after " + years + " years: " + futureValue);
    }

}
