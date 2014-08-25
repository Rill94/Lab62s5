package model;

import java.time.LocalDateTime;

/**
 * Created by Valerie on 09.08.2014.
 */
public class Message
{
    private int MessageId;
    private String Text;
    private int user_UserId;
    private LocalDateTime date;

    public int getMessageId() {
        return MessageId;
    }

    public Message(int messageId, String text, int user_UserId, LocalDateTime date) {
        MessageId = messageId;
        Text = text;
        this.user_UserId = user_UserId;
        this.date = date;
    }

    public void setMessageId(int messageId) {
        MessageId = messageId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getUser_UserId() {
        return user_UserId;
    }

    public void setUser_UserId(int user_UserId) {
        this.user_UserId = user_UserId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
