package demo_0608_iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("a.txt");
        //写入中文是不对的，中文属于字符类型，无法用字节流写入文件。
        //String str="端午快乐，吃粽子啦";
        String str="hiahia";
        byte[] by=str.getBytes();
        fo.write(by,1,3);
        fo.close();
    }
}
