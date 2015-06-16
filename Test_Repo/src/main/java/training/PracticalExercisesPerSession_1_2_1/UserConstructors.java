package training.PracticalExercisesPerSession_1_2_1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Oleksii on 15.06.2015.
 */
public class UserConstructors {
    @Test
    public static void main(String[] args) {

//       using default constructor
        User defCon = new User();
        defCon.setUsername("TestUsername");
        Assert.assertEquals("TestUsername", defCon.getUsername());

//       using parametrized constructor
        User parCon = new User("TestUsername", "TestPassword");
        Assert.assertEquals("TestUsername", parCon.getUsername());
        Assert.assertEquals("TestPassword", parCon.getPassword());

//        using copy constructor
        User copyCon = new User(parCon);
        Assert.assertEquals(copyCon.getUsername(), parCon.getUsername());
        Assert.assertEquals(copyCon.getPassword(), parCon.getPassword());

    }
}
