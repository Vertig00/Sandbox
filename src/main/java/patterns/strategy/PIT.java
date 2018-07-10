package patterns.strategy;

import java.math.BigDecimal;

public class PIT implements Tax{

	private static final BigDecimal TAX_AMOUNT = new BigDecimal(0.18);

	public BigDecimal getTaxAmount(BigDecimal salary) {
		return salary.multiply(TAX_AMOUNT);
	}

}
