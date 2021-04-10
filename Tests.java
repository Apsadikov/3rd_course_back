import org.junit.Assert;
import org.junit.Test;

public class IlalovTest {

    /*
     * Проверяем Singleton
     */
    @Test
    public void testSingleton() {
        Assert.assertEquals(MailSender.getInstance(), MailSender.getInstance());
    }

    /*
     * Проверяем бизнес логику USPS
     */
    @Test
    public void testSingleton() {
        Assert.assertEquals(100, new USPSCalculatorStategy().calculate());
    }

    /*
     * Проверяем фабрику
     */
    @Test
    public void testStrategyFactory() {
        Assert.assertEquals(USPSCalculatorStategy.class, new CalculatorFactory().create(USPSCalculatorStategy.class).getClass());
    }
}