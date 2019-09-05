package com.zju.cst.socket;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = null;
    Socket socket = null;
    InputStream is = null;
    OutputStream os = null;
    FileOutputStream fileOutputStream = null;

    serverSocket = new ServerSocket(9001);
    socket = serverSocket.accept();
    is = socket.getInputStream();
    fileOutputStream = new FileOutputStream(new File("img/test_server.txt"));


    byte[] bytes = new byte[1024];
    int len;
    while ((len= is.read(bytes)) != -1){
      fileOutputStream.write(bytes,0,len);
    }
    os = socket.getOutputStream();
    os.write("已经收到您发的文件了".getBytes());
    fileOutputStream.close();
    is.close();
    socket.close();
    serverSocket.close();

  }
}
