package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.ToPage.*;

public class StartConversationService {
    public static final Logger LOGGER = LoggerFactory.getLogger(StartConversationService.class);

    public String toBridge(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("Answer accepted to the question \"Accept UFO call?\" ");
            referenceToPage = APPROVE_PAGE2;
        } else if (result.equals("responseNo")){
            LOGGER.warn("The answer is rejected to the question \"Accept a UFO call?\"");
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
            answer = ANSWERYES1;
        else if(result.equals("responseNo"))
            answer = ANSWERNO1;
        else answer = ANSWERINCORRECT;
        return answer;
    }
}
