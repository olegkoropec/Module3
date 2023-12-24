import bridge.CapitanBridgeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CapitanBridgeServletServiceTest {
    CapitanBridgeService capitanBridgeService = new CapitanBridgeService();

    @Test
    void whoAreYouYes(){
        assertEquals(capitanBridgeService.whoAreYou("responseYes"), "responseYes");
    }

    @Test
    void whoAreYouNo(){
        assertEquals(capitanBridgeService.whoAreYou("responseNo"), "/refusal.jsp");
    }
}
