package tcp_ip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
   创建服务器端对象
 */

public class TCP_server {
    public static void main(String[] args) throws IOException {
        //创建服务器对象serverSocket；
        ServerSocket serverSocket=new ServerSocket(8000);
        //调用服务器对象serverSocket中的accept()方法，获取对应的Socket对象
        Socket socket = serverSocket.accept();
        //使用socket对象中的getinputstream方法获得inputstream对象
        InputStream is = socket.getInputStream();
        //调用inputstream对象中的read方法，获得客户端数据；
        byte[] b=new byte[1024];
        int len = is.read(b);
        System.out.println(new String(b,0,len));
        //使用secket对象中的getoutputstream方法，获得outputstream对象
        OutputStream os = socket.getOutputStream();
        //使用OutputStream对象的write方法向客户端写入数据
        os.write("你好客户端".getBytes());
        //关闭流，释放资源
        serverSocket.close();
        socket.close();
    }
}
