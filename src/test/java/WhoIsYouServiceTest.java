import org.junit.jupiter.api.Test;
import service.WhoIsYouService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoIsYouServiceTest {
    WhoIsYouService whoIsYouService = new WhoIsYouService();
    @Test
    void trueYourselfYes(){
        assertEquals( whoIsYouService.trueYourself("responseYes"), "/page4_Questionnaire.jsp");
    }

    @Test
    void trueYourselfNo(){
        assertEquals( whoIsYouService.trueYourself("responseNo"), "/refusal.jsp");
    }

    @Test
    void trueYourselfAnother(){
        assertEquals(whoIsYouService.trueYourself(""), "/incorrectResponse.jsp");
    }

    @Test
    void answerYes(){
        assertEquals(whoIsYouService.answer("responseYes"), "Ви захотіли розповісти про себе! ");
    }

    @Test
    void answerNo(){
        assertEquals(whoIsYouService.answer("responseNo"), "Ваша брехня була викрита! ");
    }

    @Test
    void answerAnother(){
        assertEquals(whoIsYouService.answer(""), "Ви відповіли не коректно!");
    }
}
