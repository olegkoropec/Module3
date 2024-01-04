import exception.InvalidParamException;
import org.junit.jupiter.api.Test;
import passenger.Passenger;
import service.PassengerService;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerServiceTest {
    Passenger passengerNameEmpty = new Passenger("gender","","surname","age","country","email@gmail.com");
    Passenger passengerSurnameEmpty = new Passenger("gender","name","","age","country","email@gmail.com");
    Passenger passengerAgeEmpty = new Passenger("gender","name","surname","","country","email@gmail.com");
    Passenger passengerCountryEmpty = new Passenger("gender","name","surname","age","","email@gmail.com");
    Passenger passengerEmailEmpty = new Passenger("gender","name","surname","age","country","");
    Passenger passengerEmailNotCorrect = new Passenger("gender","name","surname","age","country","emailgmailcom");

    @Test
    void createPassengerIsNull() {
        assertThrows(InvalidParamException.class, () -> new PassengerService().create(null));
    }

    @Test
    void validationPassengerIsNull(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(null));
    }

    @Test
    void validationPassengerIsNullMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(null));
        assertEquals("Passenger is null", exception.getMessage());
    }

    @Test
    void validationNameIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerNameEmpty));
    }

    @Test
    void validationNameIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerNameEmpty));
        assertEquals("Passenger firstName is empty", exception.getMessage());

    }

    @Test
    void validationSurnameIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerSurnameEmpty));
    }

    @Test
    void validationSurnameIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerSurnameEmpty));
        assertEquals("Passenger surname is empty", exception.getMessage());
    }

    @Test
    void validationAgeIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerAgeEmpty));
    }

    @Test
    void validationAgeIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerAgeEmpty));
        assertEquals("Passenger age is empty", exception.getMessage());
    }

    @Test
    void validationCountryIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerCountryEmpty));
    }

    @Test
    void validationCountryIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerCountryEmpty));
        assertEquals("Passenger country is empty", exception.getMessage());
    }

    @Test
    void validationEmailIsEmpty(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerEmailEmpty));
    }

    @Test
    void validationEmailIsEmptyMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerEmailEmpty));
        assertEquals("Passenger email is empty", exception.getMessage());
    }

    @Test
    void validationEmailNotCorrect(){
        assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerEmailNotCorrect));
    }

    @Test
    void validationEmailNotCorrectMessage(){
        InvalidParamException exception = assertThrows(InvalidParamException.class, () -> new PassengerService().validation(passengerEmailNotCorrect));
        assertEquals("Passenger email is invalid", exception.getMessage());
    }
}
