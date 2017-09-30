package ie.nuigalway.brendan.StudentRegistration;

import static org.junit.Assert.*;
import org.junit.Test;

public class UsernameTest {

	@Test
    public void testConcatenate() {
        Student student = new Student("alan", "1/1/1990", 27, 12345);

        String result = student.getUsername();

        assertEquals("alan27", result);

    }

}

