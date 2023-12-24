import org.junit.jupiter.api.Test;
import whoIsYou.WhoIsYouService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoIsYouServletMainTest {
    WhoIsYouService whoIsYouService = new WhoIsYouService();
    @Test
    void trueYourselfYes(){
        assertEquals( whoIsYouService.trueYourself("responseYes"), "/page4_Questionnaire.jsp");
    }

    @Test
    void trueYourselfNo(){
        assertEquals( whoIsYouService.trueYourself("responseNo"), "/refusal.jsp");
    }
}
