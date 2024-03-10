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
    Panel_Sign_in sign = new Panel_Sign_in();

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
        String name = "";
        String user = "";
        String password = "";
        for (int i = 0; i < counter / 2; i++) {
            String[] word2 = date2.split(";");
            name = word2[0];
            user = word2[1];
            password = word2[2];
        }
        sign.CompareDate(user, password);
    }
}