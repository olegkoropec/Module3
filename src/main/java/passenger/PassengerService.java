package passenger;

import exceptions.InvalidParamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.regex.Pattern;

public class PassengerService {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Logger LOGGER = LoggerFactory.getLogger(PassengerService.class);


    public void create(Passenger passenger) {
        LOGGER.info("User received: " + passenger);
        validation(passenger);
    }

    public void validation(Passenger passenger) {
        if (Objects.isNull(passenger)) {
            LOGGER.warn("Passenger is null");
            throw new InvalidParamException("Passenger is null");
        }
        if (passenger.getName().isEmpty()) {
            LOGGER.warn("Passenger firstName is empty");
            throw new InvalidParamException("Passenger firstName is empty");
        }
        if (passenger.getSurname().isEmpty()) {
            LOGGER.warn("Passenger surname is empty");
            throw new InvalidParamException("Passenger surname is empty");
        }
        if (passenger.getAge().isEmpty()) {
            LOGGER.warn("Passenger age is is empty");
            throw new InvalidParamException("Passenger age is empty");
        }
        if (passenger.getCountry().isEmpty()) {
            LOGGER.warn("Passenger country is empty");
            throw new InvalidParamException("Passenger country is empty");
        }
        if (passenger.getEmail().isEmpty()) {
            LOGGER.warn("Passenger email is empty");
            throw new InvalidParamException("Passenger email is empty");
        }
        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(passenger.getEmail()).matches()) {
            LOGGER.warn("Passenger email is invalid");
            throw new InvalidParamException("Passenger email is invalid");
        }
    }
}
