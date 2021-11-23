package models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {

    private String msgId;
    private String content;
    private String userId;
    private LocalDateTime msgTimeStamp;

    public Message(String userId,String content) {
        this.msgId = UUID.randomUUID().toString();
        setContent(content);
        setMsgTimeStamp(); //created time
        setUserId(userId);
    }
    public LocalDateTime getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp() {
        this.msgTimeStamp = LocalDateTime.now();
    }

    public String getMsgId() {
        return msgId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
