package patterns.strategy;

import java.math.BigDecimal;

public class VAT implements Tax{

	private static final BigDecimal TAX_AMOUNT = new BigDecimal(0.23);

	public BigDecimal getTaxAmount(BigDecimal salary) {
		return salary.multiply(TAX_AMOUNT);
	}

}
