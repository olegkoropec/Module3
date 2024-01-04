package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.ToPage.*;

public class CapitanBridgeService {
    public static final Logger LOGGER = LoggerFactory.getLogger(CapitanBridgeService.class);

    public String whoAreYou(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("The answer is accepted to the question \"Climb the captain's bridge?\" ");
            referenceToPage = APPROVE_PAGE3;
        } else if (result.equals("responseNo")){
            LOGGER.warn("The answer is rejected to the question \"Climb the captain's bridge?\" ");
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
            answer = ANSWERYES2;
        else if(result.equals("responseNo"))
            answer = ANSWERNO2;
        else answer = ANSWERINCORRECT;
        return answer;
    }
}
