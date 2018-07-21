package top.coos.nat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Application {

	public static void main(String[] args) {

		ApplicationInitialize.initialize(Application.class);
		String rootPath = Application.class.getResource("/").getFile().toString();
		String fileName = rootPath + "Initialize.txt";

		String file = "my name is YI! nice to meet you";// ReadFromFile.readFileByLinesln(fileName);
		exSocket(file);

	}

	public static void exSocket(String file) {

		try {
			InetAddress addr = InetAddress.getByName("localhost");
			Socket socket = new Socket(addr, 5203);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			for (int i = 0; i < 1000000; i++) {
				String readline = file + i + "AAAA";
				// 将从系统标准输入读入的字符串输出到Server
				out.println(readline);
				// 刷新输出流，使Server马上收到该字符串
				out.flush();
				System.out.println("Client:" + readline);

				System.out.println("Servlet :" + in.readLine());
			}
			socket.close(); // 关闭Socket

		} catch (Exception e) {

			System.out.println("Error" + e); // 出错则打印出错信息
		}

	}
}
