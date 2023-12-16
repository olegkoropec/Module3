package bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static reference.Answers.*;

public class CapitanBridgeMain {
    public static final Logger LOGGER = LoggerFactory.getLogger(CapitanBridgeMain.class);

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
}
