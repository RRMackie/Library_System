package com.loginpage;

/**
 * A basic coding example for creating a login page

 *
 * @author Robert Mackie
 * @version 0.1 22/02/24
 */
public class LoginPage {
    public String userName;
    public String userPassword;


    /**
     * Constructor for Username and Password
     *
     * @param name     The users registered name
     * @param password    The users password
     */
    public LoginPage(String name, String password)
    {
        userName = name;
        userPassword = password;
    }

    /**
     * A method to return the username
     *
     *
     * @return    the string name
     */
    public String getName()
    {
        return userName;
    }

}
