package models.users;

import java.util.*;
import models.users.User;

public class UserPassword2 extends User {

    private String password2;

    public UserPassword2(){

    }

    public UserPassword2(Long id,String email, String name, String role, String password1, Date dateOfBirth, String password2) {
        super(id, email, name,role, password1, dateOfBirth);
        this.password2 = password2;
    }

    public String getPassword2(){
        return password2;
    }

    public void setPassword2(String p){
        this.password2 = p;
    }

}