package demo_0608_iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class demo04_inputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("a.txt");
        int stamp=0;
        while((stamp=fi.read())!=-1){
            System.out.println(stamp);
        }
        fi.close();
    }
}
