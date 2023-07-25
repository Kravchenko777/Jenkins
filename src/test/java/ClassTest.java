import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassTest {

    static int i = 0;

    @Test
    void testNotFail(){
        Assertions.assertTrue(true);
    }

    @Test
    void testFail(){

        Assertions.assertTrue(true);
        Assertions.assertTrue(false);
    }

    @Test
    void testError(){
        //nt b = 100/i;
    }

}
