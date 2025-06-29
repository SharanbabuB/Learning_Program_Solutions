public class ForecastingTest {

    public static void main(String[] args) {
        double presentValue = 10000; // 10,000 rs.
        double growthRate = 0.10; // 10% annual growth rate
        int years = 5;

        System.out.println("------ Financial Forecasting ------");
        System.out.printf("Present Value : %.2f rs.\n", presentValue);
        System.out.printf("Growth Rate   : %.2f%%\n", growthRate * 100);
        System.out.printf("No. of Years  : %d\n", years);

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Future Value after %d years: %.2f rs.\n", years, futureValue);
    }
}

/*
 * Time Complexity:-
 * Each recursive call reduces years by 1 → So total n recursive calls
 * 
 * Therefore, Time Complexity: O(n)
 */
