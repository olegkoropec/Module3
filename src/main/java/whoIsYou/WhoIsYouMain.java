package whoIsYou;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answers.APPROVE_PAGE4;
import static reference.Answers.DISAPPROVE;

public class WhoIsYouMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(WhoIsYouMain.class);

    public String trueYourself(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("Ви захотіли розповісти про себе.");
            referenceToPage = APPROVE_PAGE4;
        } else {
            LOGGER.warn("Ви відмовилися розповісти про себе.");
            referenceToPage = DISAPPROVE;
        }
        return referenceToPage;
    }
}
