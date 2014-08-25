package beans;

import dao.DAO;
import dao.DAOImpl;
import model.Message;
import model.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valerie on 09.08.2014.
 */
@ManagedBean
@SessionScoped
public class UserBean implements Serializable
{
    private DAO dao;
    Message[] selectedMessagesList;
    private List<Message> messageList;
    private String text;
    private Message message;


    public DAO getDao() {
        return dao;
    }

    public UserBean() throws NamingException {
        dao = new DAOImpl();
    }

    public String toEditPage(Message message)
    {
        this.message = message;
        text = message.getText();
        return "edit";
    }

    public String editMessage()
    {
        message.setText(text);
        dao.updateMessage(message);
        return "index";
    }

    public List<Message> selectAllMessages() {
        messageList = dao.selectAllMessages();
        return messageList;
    }

    public Message[] getSelectedMessagesList() {
        return selectedMessagesList;
    }

    public void setSelectedMessagesList(Message[] selectedMessagesList) {
        this.selectedMessagesList = selectedMessagesList;
    }

    public User selectUserById(int userId)
    {
        User user = dao.selectUserById(userId);
        return user;
    }

    public List<Message> getMessageList() {
        return selectAllMessages();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
