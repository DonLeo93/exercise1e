package wdsr.exercise1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilModuloTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test
	public void testModuloByZero() {
		// given
		doReturn(0).when(calculator).modulo(anyInt(), anyInt());

		// when
		String result = calcUtil.getModuloText(3, 0);

		// then
		assertEquals("3 % 0 = 0", result);
		verify(calculator).modulo(anyInt(), anyInt());
	}	
}
