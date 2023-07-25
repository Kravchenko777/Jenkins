import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassTest {

    @Test
    void testNotFail(){
        Assertions.assertTrue(true);
    }

    @Test
    void testFail(){
        Assertions.assertTrue(true);
        //Assertions.assertTrue(false);
    }

}
