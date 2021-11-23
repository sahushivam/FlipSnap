package service;

public interface MsgService {

    public void postMessage(String sender, String content);

    void deleteMsg(String userName,String msgId);

    void seeMessages(String username);
}
