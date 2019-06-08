package demo_0608_iostream;

import java.io.FileReader;
import java.io.IOException;

public class demo03_Reader_io {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("a.txt");
        int stamp=0;
        char[] ch=new char[1024];
        while((stamp=fr.read(ch))!=-1){
            String str=new String(ch,0,stamp);
            System.out.println(str);
        }
        fr.close();
    }
}
