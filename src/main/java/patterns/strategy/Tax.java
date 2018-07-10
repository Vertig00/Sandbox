package patterns.strategy;

import java.math.BigDecimal;

public interface Tax {

	public BigDecimal getTaxAmount(BigDecimal salary);

}
