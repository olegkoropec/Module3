package whoIsYou;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.Answer.ANSWERNO2;
import static reference.ToPage.APPROVE_PAGE4;
import static reference.ToPage.DISAPPROVE;

public class WhoIsYouService {
    public static final Logger LOGGER = LoggerFactory.getLogger(WhoIsYouService.class);

    public String trueYourself(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info(ANSWERYES3);
            referenceToPage = APPROVE_PAGE4;
        } else {
            LOGGER.warn(ANSWERNO3);
            referenceToPage = DISAPPROVE;
        }
        return referenceToPage;
    }

    public String answer(String result){
        String answer;
        if (result.equals("responseYes"))
            answer = ANSWERYES3;
        else answer = ANSWERNO3;
        return answer;
    }
}
