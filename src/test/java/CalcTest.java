import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void checkNumOneDefault(){
        Task5CalcOpp task5CalcOpp1 = new Task5CalcOpp();
        Assert.assertEquals("Значение по умолчанию первого числа должно ровняться нулю", 0, task5CalcOpp1.getNumOne(), 0);
    }
    @Test
    public void checkNumTwoDefault(){
        Task5CalcOpp task5CalcOpp1 = new Task5CalcOpp();
        Assert.assertEquals("Значение по умолчанию второго числа должно ровняться нулю", 0, task5CalcOpp1.getNumTwo(), 0);
    }
    @Test
    public void checkNumResultDefault(){
        Task5CalcOpp task5CalcOpp1 = new Task5CalcOpp();
        Assert.assertEquals("Значение по умолчанию результата должно ровняться нулю", 0, task5CalcOpp1.getNumResult(), 0);
    }
    @Test
    public void checkNumChoiceOperationDefault(){
        Task5CalcOpp task5CalcOpp1 = new Task5CalcOpp();
        Assert.assertEquals("Значение по умолчанию выбора операции должно ровняться нулю", 0, task5CalcOpp1.getNumChoiceOperation(), 0);
    }
   }
