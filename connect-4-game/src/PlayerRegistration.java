// Let's add the eighth test scenario for invalid password with special characters to the PlayerRegistrationTest class and then run the JUnit test to validate the registerPlayer method.

// Updated JUnit Test Scenarios

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerRegistrationTest {

    @Test
    public void testInvalidInputs_Scenario1_1() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "short";
        String password = "tenchars00";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Username."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testValidInputs_Scenario1_2() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DammyLare1";
        String password = "BestPlayer02e";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertTrue(response.isSuccess());
        assertTrue(response.getErrorMessages().isEmpty());
        assertEquals(1, response.getPlayerId());
        assertEquals(username, response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_3() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DammyLare1";
        String password = "LetsPlay5829";

        // First registration
        registration.registerPlayer(username, "BestPlayer02e");

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Nonunique Username, Player already exists."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_4() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DammyLare1";
        String password = "Dammy";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Password."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_5() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "OluwaDammyLareAkinbode1";
        String password = "LetsPlay5949";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Username."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_6() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DammyLare1";
        String password = "OluwaDammyLareAkinbode1";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Password."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_7() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DammyLare$#";
        String password = "LetsPlay6009";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Username."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }

    @Test
    public void testInvalidInputs_Scenario1_8() {
        PlayerRegistration registration = new PlayerRegistration();

        // Test data
        String username = "DamyLare1";
        String password = "LetsPlay6009_&";

        // Execute
        PlayerRegistration.RegistrationResponse response = registration.registerPlayer(username, password);

        // Verify
        assertFalse(response.isSuccess());
        assertEquals(1, response.getErrorMessages().size());
        assertTrue(response.getErrorMessages().contains("Invalid Password."));
        assertEquals(0, response.getPlayerId());
        assertNull(response.getUsername());
    }
}


// Now, with these eight test scenarios added to the PlayerRegistrationTest class, you can run the JUnit tests to validate the registerPlayer method against the provided test scenarios.

// All eight tests should pass if the implementation of the PlayerRegistration class is correct.
