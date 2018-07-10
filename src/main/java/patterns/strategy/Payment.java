package patterns.strategy;

import java.math.BigDecimal;

public class Payment {

	private Tax tax;

	public Payment(int taxType) {
		switch (taxType) {
			case 1:
				tax = new VAT();
				break;
			case 2 :
				tax = new PIT();
				break;
		}
	}

	public Payment(Tax tax) {
		this.tax = tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public BigDecimal payTax(BigDecimal amount) {
		return tax.getTaxAmount(amount);
	}



}
