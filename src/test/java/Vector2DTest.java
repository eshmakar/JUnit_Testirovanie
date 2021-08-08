import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.length(), 1e-9);//0 - ожидаемое значение, v1.length() - метод который вызываем, 1e-9 - погрешность результата
    }

    @Test(expected = ArithmeticException.class)//здесь сообщаем, если метод выбрасывает эту ошибку, то тогда все ок, все работает правильно
    public void dividingZeroShouldThrowException(){
        Vector2D vector2D = new Vector2D();
        Assert.assertEquals(0, vector2D.result(0, 0));
    }

    @Test(timeout = 1000)//здесь сообщаем, если выполнение займет больше секунду, то тест провален
    public void timeShouldBeLittleByOneSecond() throws InterruptedException {
        Vector2D vector2D = new Vector2D();
        Assert.assertEquals(0, vector2D.timeToSleep());
    }
}
