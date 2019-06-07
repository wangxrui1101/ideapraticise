package demo_0608_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("a.txt",true);
        String str="nihao";
        byte[] by=str.getBytes();
        fo.write(by,1,3);
        fo.close();
    }
}
