package service.impl;

import repository.MsgRepo;
import repository.impl.InMemoryMsgRepoImpl;
import service.MsgService;

public class MsgServiceImpl implements MsgService {

    MsgRepo msgRepo = new InMemoryMsgRepoImpl();

    @Override
    public void postMessage(String sender, String content) {
        msgRepo.saveMessage(sender,content);
    }

    @Override
    public void deleteMsg(String userName, String msgId) {
        msgRepo.deleteMsg(msgId);
    }//validation

    @Override
    public void seeMessages(String username) {
        /*
            1. get all messages
            2. Apply filter to view messages
         */
    }
}
