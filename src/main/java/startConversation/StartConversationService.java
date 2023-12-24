package startConversation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answer.*;
import static reference.ToPage.APPROVE_PAGE2;
import static reference.ToPage.DISAPPROVE;

public class StartConversationService {
    public static final Logger LOGGER = LoggerFactory.getLogger(StartConversationService.class);

    public String toBridge(String result) {
        String referenceToPage;
        if (result.equals("responseYes")) {
            LOGGER.info("Відповідь прийнята на питання \"Прийнати виклик НЛО?\" ");
            referenceToPage = APPROVE_PAGE2;
        } else {
            LOGGER.warn("Відповідь відхилено на питання \"Прийнати виклик НЛО?\"");
            referenceToPage = DISAPPROVE;
        }
        return referenceToPage;
    }

    public String answer(String result){
        String answer;
        if (result.equals("responseYes"))
            answer = ANSWERYES1;
        else answer = ANSWERNO1;
        return answer;
    }
}
