import bridge.CapitanBridgeMain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CapitanBridgeMainTest {
    CapitanBridgeMain capitanBridgeMain = new CapitanBridgeMain();

    @Test
    void whoAreYouYes(){
        assertEquals(capitanBridgeMain.whoAreYou("responseYes"), "responseYes");
    }

    @Test
    void whoAreYouNo(){
        assertEquals(capitanBridgeMain.whoAreYou("responseNo"), "/refusal.jsp");
    }
}
