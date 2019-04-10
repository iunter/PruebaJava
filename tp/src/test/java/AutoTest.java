import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class AutoTest {
	
	@Test
	public void testEncendidoOk() throws Exception{
		
		Auto auto = new Auto(100,100);
		auto.encender();
		Assert.assertEquals(70, auto.getTemperatura());
		Assert.assertEquals(99.9, auto.getCombustible(), 0.0001);
		Assert.assertTrue(auto.isEncendido());
	}
		
	@Test(expected = CombustibleException.class)
	public void testSinCombustible() {
		
		Auto auto = new Auto(0,100);
		auto.encender();
	}
}
