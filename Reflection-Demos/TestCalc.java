import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCalc {
	
	@DataProvider(name="mydataprovider")
	public Object[][] collectData(){
		return new Object[][]{{10,20,30},{100,200,300},{1000,2000,3000}};
	}
	
	@BeforeMethod
	public void start(){
		
	}
	
	@Test(enabled=false)
	public void testDivide(){
		Calc obj = new Calc();
		int result = obj.divide(100, 20);
		int expectedResult = 5;
		Assert.assertEquals(result, expectedResult);
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testNegativeDivide(){
		Calc obj = new Calc();
		int result = obj.divide(100, 0);
		/*int expectedResult = 5;
		Assert.assertEquals(result, expectedResult);*/
	}
	@Test(timeOut=1000)
	public void testTimeBased(){
		Calc obj = new Calc();
		int result = obj.divide(100, 20);
		int expectedResult = 5;
		Assert.assertEquals(result, expectedResult);
	}
	@Test(dataProvider="mydataprovider")
	public void testDataDriven(int x, int y, int expected){
		Calc obj = new Calc();
		int result = obj.add(x, y);
		int expectedResult = expected;
		Assert.assertEquals(result, expectedResult);
	}
}
