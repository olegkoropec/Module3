package bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.ToPage.*;

public class CapitanBridgeService {
    public static final Logger LOGGER = LoggerFactory.getLogger(CapitanBridgeService.class);

    public String whoAreYou(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("Відповідь прийнята на питання \"Піднятися на капітанський місток?\" ");
            referenceToPage = APPROVE_PAGE3;
        } else {
            LOGGER.warn("Відповідь відхилено на питання \"Піднятися на капітанський місток?\" ");
            referenceToPage = DISAPPROVE;
        }
        return referenceToPage;
    }

    public String answer(String result){
        String answer;
        if (result.equals("responseYes"))
            answer = ANSWERYES2;
        else answer = ANSWERNO2;
        return answer;
    }
}
