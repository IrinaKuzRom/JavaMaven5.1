import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.javamavn.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
   // @CsvSource({})
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    //@Test
    public void shouldCalcExact(int expected, int bottom_border,int top_border){
        SQRService service=new SQRService();
        //int expected=3;
        int actual=service.calcSqrt(bottom_border,top_border);
        Assertions.assertEquals(expected,actual);
    }
    //@Test
    //public void shouldCalcUnExact(){
        //SQRService service=new SQRService();
        //int expected=0;
        //int actual=service.calcSqrt(0,90);
       // Assertions.assertEquals(expected,actual);
    //}
    //@Test
    //public void shouldCalcOverExact(){
        //SQRService service=new SQRService();
        //int expected=0;
        //int actual= service.calcSqrt(10000,11000);
        //Assertions.assertEquals(expected,actual);
    //}
    //@Test
    //public void shouldCalcExaction(){
        //SQRService service=new SQRService();
        //int expected=1;
        //int actual=service.calcSqrt(100,100);
        //Assertions.assertEquals(expected,actual);
    //}
}
