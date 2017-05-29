package model.Entities;

/**
 * Created by rzzayed on 5/28/17.
 */
public class UserForm {
    private static final long serialVersionUID = 748392348L;

    private int id;
    private String username;
    private String password;



    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
