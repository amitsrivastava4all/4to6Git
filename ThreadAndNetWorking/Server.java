import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(9001); // Server Open a Port for Communication
		System.out.println("Server is Waiting for the Client");
		Socket socket = server.accept();
		System.out.println("Here comes the Client");
		System.out.println("Enter the Data Send to the Client ");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		OutputStream os = socket.getOutputStream();	
		os.write(data.getBytes());  // Write Bytes on Channel
		os.close();
		socket.close();
		System.out.println("Data Sended to the Client");

	}

}
