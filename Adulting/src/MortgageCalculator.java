import java.text.NumberFormat;
import java.util.Scanner;

public class  MortgageCalculator extends Calculator {
	
	final byte MONTHS_IN_YEARS = 12;
	final byte PERCENT = 100;
	
	Scanner stdin = new Scanner ( System.in );
	
	private int loanAmount;
	private float annualInterestRate;
	private float monthlyInterest;
	private byte years;
	private int numberOfPayments;
	private String monthlyPayments;
	
	
	public MortgageCalculator() {
		
		
		
		System.out.print("Loan Amount:");
		this.loanAmount = stdin.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		this.annualInterestRate = stdin.nextFloat();
		this.monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEARS;
		
		System.out.print("Period (Years): ");
		this.years = stdin.nextByte();
		this.numberOfPayments = years * MONTHS_IN_YEARS;
		
		stdin.close();
	}
	
	public int getLoanAmount() {
		return loanAmount;
	}



	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}



	public float getAnnualInterestRate() {
		return annualInterestRate;
	}



	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}



	public float getMonthlyInterest() {
		return monthlyInterest;
	}



	public void setMonthlyInterest(float monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}



	public byte getYears() {
		return years;
	}



	public void setYears(byte years) {
		this.years = years;
	}



	public int getNumberOfPayments() {
		return numberOfPayments;
	}



	public void setNumberOfPayments(int numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}



	public String getMonthlyPayments() {
		return monthlyPayments;
	}



	public void setMonthlyPayments(String monthlyPayments) {
		this.monthlyPayments = monthlyPayments;
	}



	public byte getMONTHS_IN_YEARS() {
		return MONTHS_IN_YEARS;
	}



	public byte getPERCENT() {
		return PERCENT;
	}



	public void calculateMonthlyPayment() {
		
		double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double mPayments= loanAmount * (monthlyInterest * mathPower / (mathPower - 1));
        String mPaymentsFormatted = NumberFormat.getCurrencyInstance().format(mPayments);
        setMonthlyPayments(mPaymentsFormatted);

	}
	
	

}
