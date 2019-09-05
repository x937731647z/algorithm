package com.zju.cst.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
  public static void main(String[] args) throws Exception{
    //
      OutputStream os = null;
      Socket socket = null;
      InputStream is = null;
      FileInputStream fileInputStream = null;

      socket = new Socket(InetAddress.getByName("localhost"),9001);
      os = socket.getOutputStream();
      fileInputStream = new FileInputStream(new File("img/HuaWei.txt"));


      byte[] b1 = new byte[1024];
      int b1len;
      while ((b1len = fileInputStream.read(b1)) != -1){
          os.write(b1,0,b1len);
      }
      socket.shutdownOutput();

      is = socket.getInputStream();
      byte[] b2 = new byte[100];
      int b2len;
      while ((b2len = is.read(b2)) != -1){
          String string = new String(b2,0,b2len);
         System.out.println(string);
      }

      if (is != null){
          is.close();
      }
      if (fileInputStream != null){
          fileInputStream.close();
      }
      if (os != null){
          os.close();
      }
      if (socket != null){
          socket.close();
      }

  }
}
