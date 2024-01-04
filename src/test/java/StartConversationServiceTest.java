import org.junit.jupiter.api.Test;
import service.StartConversationService;

import static org.junit.jupiter.api.Assertions.*;

class StartConversationServiceTest {

    StartConversationService startConversationService = new StartConversationService();

    @Test
    void toBridgeYes() {
        assertEquals(startConversationService.toBridge("responseYes"), "/page2_CapitanBridge.jsp");
    }

    @Test
    void toBridgeNo(){
        assertEquals(startConversationService.toBridge("responseNo"), "/refusal.jsp");
    }

    @Test
    void toBridgeAnother(){
        assertEquals(startConversationService.toBridge(""), "/incorrectResponse.jsp");
    }

    @Test
    void answerYes(){
        assertEquals(startConversationService.answer("responseYes"), "Ви прийняли виклик! ");
    }

    @Test
    void answerNo(){
        assertEquals(startConversationService.answer("responseNo"), "Ви відхилили виклик! ");
    }

    @Test
    void answerAnother(){
        assertEquals(startConversationService.answer(""), "Ви відповіли не коректно!");
    }
}