package view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server  {

	private String ip = "localhost";
	private int port = 22222;
	private Scanner scanner = new Scanner(System.in);
	private Thread thread;
	
	private Socket socket;
	private DataOutputStream dos;
	private DataInputStream dis;
	private boolean yourTurn;
	
	private ServerSocket serverSocket;
	private boolean firstPlayer =  true;
	private boolean accepted = false;
	
	public Server() {
		System.out.println("Please input the IP: ");
		ip = scanner.nextLine();
		System.out.println("Please input the port: ");
		port = scanner.nextInt();
		while(port <1 || port > 65535) {
			System.out.println("The port you entered was invalid, please enter another port: ");
			port = scanner.nextInt();
		}
		
		if(!connect()) {
			initialiseServer();
		}
		
//		thread = new Thread(this,"Monopoly Deal");
//		thread.start();
		firstPlayer = true;
		MainBoard board = new MainBoard(this);
		board.setVisible(true);
	}
	

	
	private void listenForServerRequest() {
		Socket socket = null;
		try {
			socket = serverSocket.accept();
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
			accepted = true;
			System.out.println("CLIENT HAS REQUESTED TO JOIN, AND WE HAVE ACCEPTED");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean connect() {
		try {
			socket = new Socket(ip, port);
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
			accepted = true;
		} catch (IOException e) {
			System.out.println("Unable to connect to the address: " + ip + ":" + port + " | Starting a server");
			return false;
		}
		System.out.println("Successfully connected to the server.");
		return true;
	
	}
	
	private void initialiseServer() {
		try {
			serverSocket = new ServerSocket(port, 8, InetAddress.getByName(ip));
		} catch (Exception e) {
			e.printStackTrace();
		}
		yourTurn = true;
		firstPlayer = false;
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Server server = new Server();
	}
	
	
	
	public boolean isAccepted() {
		return accepted;
	}



	public boolean isFirstPlayer() {
		return firstPlayer;
	}



	//@Override
//	public void run() {
//		while(true){
//			
//			
//			if(!firstPlayer && !accepted) {
//				listenForServerRequest();
//			}
//			}
//		}

}
