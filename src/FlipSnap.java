import service.MsgService;
import service.impl.MsgServiceImpl;

public class FlipSnap {

    MsgService msgService;
    public void post(String username, String contant) {
        if(msgService == null) {
            msgService = new MsgServiceImpl();
        }
        msgService.postMessage(username,contant);
    }

    public void deleteMsg(String username, String content) {
        if(msgService == null) {
            msgService = new MsgServiceImpl();
        }
        msgService.deleteMsg(username, content);
    }

    public void seeMessage(String username) {
        if(msgService == null) {
            msgService = new MsgServiceImpl();
        }
        msgService.seeMessages(username);
    }

    public void seeFeeds() {
    }
}
