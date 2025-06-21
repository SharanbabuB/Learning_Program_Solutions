import java.util.Scanner;

public class FinancialForecast {

    public static double[] movingAverage(double[] data, int windowSize) {
        int n = data.length;
        double[] forecast = new double[n - windowSize + 1];

        for (int i = 0; i < forecast.length; i++) { // for (int i = 0; i <= n - windowSize; i++) {
            double sum = 0;
            for (int j = i; j < i + windowSize; j++) {
                sum += data[j];
            }
            forecast[i] = sum / windowSize;
        }
        return forecast;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of months data: ");
        int n = sc.nextInt();
        double[] revenue = new double[n];

        System.out.println("Enter the monthly revenue(sales profit): ");
        for (int i = 0; i < n; i++) {
            revenue[i] = sc.nextDouble();
        }

        System.out.print("Enter the window size for moving average: ");
        int window = sc.nextInt();

        if (window > n) {
            System.out.println("Window size cannot be greater than number of months!");
            sc.close();
            return;
        }

        double[] forecast = movingAverage(revenue, window);

        System.out.println("\nForecasted Revenue:");
        for (int i = 0; i < forecast.length; i++) {
            System.out.printf("Month %d to %d forecast: %.2f\n", i + 1, i + window, forecast[i]);
        }

        sc.close();
    }
}
