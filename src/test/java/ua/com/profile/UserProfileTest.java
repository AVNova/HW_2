package ua.com.profile;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class UserProfileTest {

    private UserProfile userProfile;

    @BeforeClass
    public static void setUpClass() throws Exception{

        System.out.println("Starting tests...");

    }

    @Before
    public void setUp (){

        userProfile = new UserProfile();
        userProfile.currentYear = 2052;
        userProfile.birth = 1955;

    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldReturnPositiveBirth() {

        boolean result = userProfile.isPositive(userProfile.birth);

        assertTrue("Birth date is negative!", result);

    }

    @Test
    public void shouldReturnStringWithNAme() {

        String result = userProfile.rememberTheName("Bart Simpson");

        assertFalse("Something wrong with name", result.isEmpty());

        assertThat(result, instanceOf(String.class));

    }

    @Test
    public void shouldReturnPositivePersonAge() {

        int result = userProfile.personAge(userProfile.currentYear, userProfile.birth);

        assertFalse("Wrong age", result < 0);
    }

    @AfterClass
    public static void goodBye(){
        System.out.println("Test finished!");
    }

    @Test
    public void throwsNullPointerException() {
        exception.expect(NullPointerException.class);
        throw new NullPointerException();
    }
}
