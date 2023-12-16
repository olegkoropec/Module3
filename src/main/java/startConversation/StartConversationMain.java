package startConversation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static reference.Answers.APPROVE_PAGE2;
import static reference.Answers.DISAPPROVE;

public class StartConversationMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(StartConversationMain.class);

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
}
