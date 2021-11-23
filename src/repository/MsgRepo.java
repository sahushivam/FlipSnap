package repository;

import models.Message;

public interface MsgRepo {

    Message findById(String id);
    Message saveMessage(String username, String content);

    void deleteMsg(String msgId);
}
