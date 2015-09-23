import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String ipAddressOfServer = "localhost";
		int serverPortNo = 9001;
		
		Socket socket = new Socket(ipAddressOfServer,serverPortNo);
		System.out.println("Client Comes");
		InputStream is = socket.getInputStream();
		int singleByte = is.read();
		while(singleByte!=-1)
		{
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		socket.close();
	}

}
