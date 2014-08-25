package dao;

import model.Message;
import model.User;

import java.util.List;

/**
 * Created by Valerie on 09.08.2014.
 */
public interface DAO
{
    public List<User> selectAllUsers();
    public List<Message> selectUserMessages(int userId);
    public boolean insertMessage(Message message);
    public List<Message> selectAllMessages();
    public User selectUserById(int userId);
    public boolean updateMessage(Message message);

}
