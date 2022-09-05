import org.junit.Assert;
import org.junit.Test;

public class tempTest {

    CelciusToFahrenheit celciusToFahrenheit = new CelciusToFahrenheit();

    @Test
    public void tempCtoFTest(){
        Assert.assertEquals(celciusToFahrenheit.convertTempCtoF(20),68);

    }
}
