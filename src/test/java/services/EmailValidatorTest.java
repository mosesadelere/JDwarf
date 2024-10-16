package services;

import static org.junit.jupiter.api.Assertions.*;

import email.EmailValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class EmailValidatorTest {

    @Test
    void ensureThatEmailValidatorReturnsTrueForValidEmail(){
        assertTrue(EmailValidator.isValidEmail("moses.adelere@gmail.com"));
    }

    @Test
    @DisplayName("Ensure that the usage of a subdomain is still valid, " +
            "see wikipedia (Subdomain for more details")
    void emailValidator_CorrectEmailSubDomain_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("dayomoses@gmail.com"));
    }

    @Test
    void emailValidator_InvalidEmailNotId_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail("moses.adelere@gmail"));
    }

    @Test
    void emailValidator_InvalidEmailDoubleDot_ReturnsFalse(){
        assertTrue(EmailValidator.isValidEmail("moses..adelere@gmail.com"));
        assertFalse(EmailValidator.isValidEmail("dayo..moses@gmail..com"));
    }

    @Test
    void emailValidator_InvalidEmailNoUsername_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("@gmail.com"));
    }

    @Test
    void emailValidator_EmptyString_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    void emailValidator_NullEmail_ReturnFalse(){
        assertFalse(EmailValidator.isValidEmail(null));
    }
}
