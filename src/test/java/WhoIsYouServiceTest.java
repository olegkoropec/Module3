import org.junit.jupiter.api.Test;
import service.WhoAreYouService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoIsYouServiceTest {
    WhoAreYouService whoAreYouService = new WhoAreYouService();
    @Test
    void trueYourselfYes(){
        assertEquals( whoAreYouService.isTrueAboutYourself("responseYes"), "/page4_Questionnaire.jsp");
    }

    @Test
    void trueYourselfNo(){
        assertEquals( whoAreYouService.isTrueAboutYourself("responseNo"), "/refusal.jsp");
    }

    @Test
    void trueYourselfAnother(){
        assertEquals(whoAreYouService.isTrueAboutYourself(""), "/incorrectResponse.jsp");
    }

    @Test
    void answerYes(){
        assertEquals(whoAreYouService.answer("responseYes"), "Ви захотіли розповісти про себе! ");
    }

    @Test
    void answerNo(){
        assertEquals(whoAreYouService.answer("responseNo"), "Ваша брехня була викрита! ");
    }

    @Test
    void answerAnother(){
        assertEquals(whoAreYouService.answer(""), "Ви відповіли не коректно!");
    }
}
