import org.junit.jupiter.api.Test;
import whoIsYou.WhoIsYouMain;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoIsYouMainTest {
    WhoIsYouMain whoIsYouMain = new WhoIsYouMain();
    @Test
    void trueYourselfYes(){
        assertEquals( whoIsYouMain.trueYourself("responseYes"), "/page4_Questionnaire.jsp");
    }

    @Test
    void trueYourselfNo(){
        assertEquals( whoIsYouMain.trueYourself("responseNo"), "/refusal.jsp");
    }
}
