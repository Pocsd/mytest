package cn.com.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务端以及开启");
		Socket socket = serverSocket.accept();
		while (true) {
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(inputStream);
		}
	}
}
