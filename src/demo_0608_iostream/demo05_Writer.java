package demo_0608_iostream;

import java.io.FileWriter;
import java.io.IOException;

public class demo05_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("a.txt");
        String str="端午节快乐，吃粽子";
        try(fw){
            fw.write(str);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
