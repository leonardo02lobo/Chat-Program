package Utils;

import Window.Panel_Sign_in;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class methods_File {

    String file = "database.txt";
    int counter = 0;
    String us, pass;
    public static String Dataname = "";
    Data_UserName username = new Data_UserName();

    public void setDatos(String us, String pass) {
        this.us = us;
        this.pass = pass;
    }

    public void Read_File() throws IOException {
        try {
            FileReader leer = new FileReader(file);
            BufferedReader lector = new BufferedReader(leer);

            String date = "";
            String word = lector.readLine();
            while (word != null) {
                date += word + "\n";
                word = lector.readLine();
                counter++;
            }
            tokens1(date);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(methods_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tokens1(String date) {
        for (int i = 0; i < counter; i++) {
            String word[] = date.split("\n");
            tokens2(word[i]);
        }
    }

    public void tokens2(String date2) {
        for (int i = 0; i < counter / 2; i++) {
            String[] word2 = date2.split(";");
            username.setName(word2[0]);
            username.setUser(word2[1]);
            username.setPassword(word2[2]);
            ValiditySesion(username.getUser(), username.getPassword(),username.getName());
        }
    }

    public void ValiditySesion(String user, String password,String name) {

        if (user.equals(us) && password.equals(pass)) {
            Dataname = name;
            Panel_Sign_in.band = true;
        }
    }
}
