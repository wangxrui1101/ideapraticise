package demo_0608_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo02_filecopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("a.txt");
        FileOutputStream fo=new FileOutputStream("b.txt");
        byte[] by=new byte[1024];
        int swag=0;
        while((swag=fi.read(by))!=-1){
            fo.write(by,0,swag);
        }
        fo.close();
        fi.close();

    }
}
