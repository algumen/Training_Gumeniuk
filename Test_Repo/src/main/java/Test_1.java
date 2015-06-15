
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Oleksii on 31.05.2015.
 */
public class
        Test_1 {

    @Test
    public void canAddTwoPlusTwo(){

        int answer = 2+2;
         Assert.assertEquals(answer, 4, "2+2");

    }

}

