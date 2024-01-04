import service.CapitanBridgeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CapitanBridgeServiceTest {
    CapitanBridgeService capitanBridgeService = new CapitanBridgeService();

    @Test
    void whoAreYouYes(){
        assertEquals(capitanBridgeService.whoAreYou("responseYes"), "responseYes");
    }

    @Test
    void whoAreYouNo(){
        assertEquals(capitanBridgeService.whoAreYou("responseNo"), "/refusal.jsp");
    }

    @Test
    void whoAreYouAnother(){
        assertEquals(capitanBridgeService.whoAreYou(""), "/incorrectResponse.jsp");
    }

    @Test
    void answerYes(){
        assertEquals(capitanBridgeService.answer("responseYes"), "Ви піднялися на місток! ");
    }

    @Test
    void answerNo(){
        assertEquals(capitanBridgeService.answer("responseNo"), "Ви не пішли на переговори! ");
    }

    @Test
    void answerAnother(){
        assertEquals(capitanBridgeService.answer(""), "Ви відповіли не коректно!");
    }
}
