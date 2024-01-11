import exception.InvalidParamException;
import org.junit.jupiter.api.Test;
import user.User;
import service.UserService;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    User userNameEmpty = new User("gender","","surname","age","country","email@gmail.com");
    User userSurnameEmpty = new User("gender","name","","age","country","email@gmail.com");
    User userAgeEmpty = new User("gender","name","surname","","country","email@gmail.com");
    User userCountryEmpty = new User("gender","name","surname","age","","email@gmail.com");
    User userEmailEmpty = new User("gender","name","surname","age","country","");
    User userEmailNotCorrect = new User("gender","name","surname","age","country","emailgmailcom");

    @Test
    void createUserIsNull() {
        assertThrows(InvalidParamException.class, () -> new UserService().create(null));
    }

    @Test
    void validationUserIsNull(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(null));
    }

    @Test
    void validationUserIsNullMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(null));
        assertEquals("User is null", exception.getMessage());
    }

    @Test
    void validationNameIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userNameEmpty));
    }

    @Test
    void validationNameIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userNameEmpty));
        assertEquals("User firstName is empty", exception.getMessage());

    }

    @Test
    void validationSurnameIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userSurnameEmpty));
    }

    @Test
    void validationSurnameIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userSurnameEmpty));
        assertEquals("User surname is empty", exception.getMessage());
    }

    @Test
    void validationAgeIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userAgeEmpty));
    }

    @Test
    void validationAgeIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userAgeEmpty));
        assertEquals("User age is empty", exception.getMessage());
    }

    @Test
    void validationCountryIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userCountryEmpty));
    }

    @Test
    void validationCountryIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userCountryEmpty));
        assertEquals("User country is empty", exception.getMessage());
    }

    @Test
    void validationEmailIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userEmailEmpty));
    }

    @Test
    void validationEmailIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userEmailEmpty));
        assertEquals("User email is empty", exception.getMessage());
    }

    @Test
    void validationEmailNotCorrect(){
        assertThrows(InvalidParamException.class, () -> new UserService().validation(userEmailNotCorrect));
    }

    @Test
    void validationEmailNotCorrectMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new UserService().validation(userEmailNotCorrect));
        assertEquals("User email is invalid", exception.getMessage());
    }
}
