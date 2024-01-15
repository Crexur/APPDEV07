package loginmodule;

public class PayrollCalculator {
    private double regularPay;
    private double overtimePay;
    
    public double getTotalSalary(double hourlyRate, double hours, double overtime) {
        double overtimeRate = hourlyRate * 1.5;
        double totalSalary = (hourlyRate * hours) + (overtimeRate * overtime);
        return totalSalary;
    }
    
    public double getRegularPay(){
        return regularPay;
    }
    
    public double getOverTimePay(){
        return overtimePay;
    }
}
