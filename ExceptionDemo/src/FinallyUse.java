import java.io.IOException;
import java.sql.SQLException;

// Throw Early and Catch Later
class X
{
	 static void dbConnect() throws SQLException,IOException {
		 int a = 100;
		 try{
		 System.out.println("DB Open...");
		 if(a==100){
		 throw new SQLException();
		 }
		 
		 else if(a==200)
		 {
			 throw new IOException();
		 }
		 System.out.println("DB Processing Going On...");
		 
		 }
		 finally{
			 System.out.println("DB Close....");
		 }
		 /*catch(SQLException e){
			 System.out.println("DB Problem "+e);
		 }*/
	 }
	 static void logic() throws SQLException,IOException{
		 
		 System.out.println("Logic Start");
		 dbConnect();
		 System.out.println("Logic Ends...");
	 }
	 static void ui(){
		 System.out.println("UI Code Starts");
		 try{
		 logic();
		 System.out.println("UI Code Ends...");
		 }
		 catch(SQLException e){
			 System.out.println("DB Related Exception "+e);
			 e.printStackTrace();
		 }
		 catch(IOException e){
			 System.out.println("IO Related Exception "+e);
		 }
		 
	 }
}

public class FinallyUse {

	public static void main(String[] args) {
		X.ui();

	}

}
