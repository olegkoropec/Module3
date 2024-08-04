package service;

import exception.InvalidParamException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import user.User;
import java.util.regex.Pattern;

public class UserService {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public void create(User user) {
        LOGGER.info("User received: " + user);
        validation(user);
    }

    public void validation(User user) {
        if (user.getName().isEmpty()) {
            LOGGER.warn("User firstName is empty");
            throw new InvalidParamException("User firstName is empty");
        }
        if (user.getSurname().isEmpty()) {
            LOGGER.warn("User surname is empty");
            throw new InvalidParamException("User surname is empty");
        }
        if (user.getAge().isEmpty()) {
            LOGGER.warn("User age is is empty");
            throw new InvalidParamException("User age is empty");
        }
        if (user.getCountry().isEmpty()) {
            LOGGER.warn("User country is empty");
            throw new InvalidParamException("User country is empty");
        }
        if (user.getEmail().isEmpty()) {
            LOGGER.warn("User email is empty");
            throw new InvalidParamException("User email is empty");
        }
        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail()).matches()) {
            LOGGER.warn("User email is invalid");
            throw new InvalidParamException("User email is invalid");
        }
    }
}
