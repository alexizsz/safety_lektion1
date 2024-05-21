package org.example.alexis;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordHandling {



    public String hashPassword(String hashedPassword){
        String salt = BCrypt.gensalt();

        return BCrypt.hashpw(hashedPassword, salt);
    }

    public boolean checkPassword(String password, String hashedPassword){
        return BCrypt.checkpw(password, hashedPassword);
    }


}
