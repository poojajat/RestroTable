/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.swing;

/**
 *
 * @author pjat2
 */
public class User {
    private String userName;
      private String password;
      private String post;
      
      public User(){
          
      }

    public User(String userName, String password, String post) {
        this.userName = userName;
        this.password = password;
        this.post = post;
    }
    

      
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
      
      
}
