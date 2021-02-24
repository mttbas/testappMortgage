package com.MORTGAGE;

public class Main {

    public static void main(String[] args) {

        int principle = (int) Console.readNumber("Principle ( € 1K - € 1M) : ", 1_000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("AnnualInterestRate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (year): ", 1, 30);

        Calculator calculator = new Calculator(principle, annualInterestRate, years);
        MortgageReport report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
