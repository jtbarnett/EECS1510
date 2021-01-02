import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prac {

    public static void main(String[] args) {


        @Override
        public String toString() {
            return name + "\t" + phonenumber + "\t" + notes + "\n";
        }

        public static void storePhoneBook(String FileName) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter("PhoneBook.txt",true));
            for (int i = 0; i < count; i++) {
                String en = entry[i].toString();
                bw.write(en);
            }
            bw.flush();
            bw.close();
        }
    }
}