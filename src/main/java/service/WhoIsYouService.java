package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.ToPage.*;

public class WhoIsYouService {
    public static final Logger LOGGER = LoggerFactory.getLogger(WhoIsYouService.class);

    public String trueYourself(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("You agreed to tell us about yourself!");
            referenceToPage = APPROVE_PAGE4;
        } else if (result.equals("responseNo")){
            LOGGER.warn("You refused to tell about yourself!");
            referenceToPage = DISAPPROVE;
        }
        else {
            LOGGER.warn("The answer is incorrect");
            referenceToPage = INCORRECT;
        }
        return referenceToPage;
    }

    public String answer(String result){
        String answer;
        if (result.equals("responseYes"))
            answer = ANSWERYES3;
        else if(result.equals("responseNo"))
            answer = ANSWERNO3;
        else answer = ANSWERINCORRECT;
        return answer;
    }
}
