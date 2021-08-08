import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private static final double POGRESHNOST = 1e-9;
    private Vector2D v1;




    @Before//перед запуском любого тестирующего метода будет сперва создаваться объект класса Vector2D, для дальнейшего его использования
    //либо можно просто использовать @BeforeClass для создания только одного экземпляра класса для каждого метода
    public void createExemplarForVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Assert.assertEquals(0, v1.length(), POGRESHNOST);//0 - ожидаемое значение, v1.length() - метод который вызываем, 1e-9 - погрешность результата
    }

    @Test(expected = ArithmeticException.class)//здесь сообщаем, если метод выбрасывает эту ошибку, то тогда все ок, все работает правильно
    public void dividingZeroShouldThrowException() {
        Assert.assertEquals(0, v1.result(0, 0));
    }

    @Test(timeout = 1000)//здесь сообщаем, если выполнение займет больше секунду, то тест провален
    public void timeShouldBeLittleByOneSecond() throws InterruptedException {
        Assert.assertEquals(0, v1.timeToSleep());
    }
}
