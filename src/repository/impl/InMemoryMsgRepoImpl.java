package repository.impl;

import models.Message;
import repository.MsgRepo;

import java.util.HashMap;
import java.util.UUID;

public class InMemoryMsgRepoImpl implements MsgRepo {

    HashMap<String, Message> messageIdtoMessageMap = new HashMap<>();
    @Override
    public Message findById(String id) {
        return messageIdtoMessageMap.get(id);
    }

    @Override
    public Message saveMessage(String userId,String content) {
        Message msg = new Message(userId,content);
        messageIdtoMessageMap.put(UUID.randomUUID().toString(),msg); //,
        return msg;
    }

    @Override
    public void deleteMsg(String msgId) {
        messageIdtoMessageMap.remove(msgId);
    }
}
