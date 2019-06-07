package tcp_ip;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
     tcp_ip的客户端程序
 */
public class TCP_client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket=new Socket("127.0.0.1",8000);
        //调用客户端对象的getoutstream方法，生成OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //调用OutputStream的写方法，向服务器端写入数据
        outputStream.write("你好服务器".getBytes());
        //获取输入网络字节流输入对象，inputstream
        InputStream is = socket.getInputStream();
        //调用inputstream对象中的read方法，获得客户端数据；
        byte[] b=new byte[1024];
        int len = is.read(b);
        System.out.println(new String(b,0,len));
        //使用inputStream的读方法，获取服务器返回的数据
        //关闭流操作
        socket.close();

    }
}
