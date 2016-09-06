package redesign;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//repeat task
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class java {

   public static void main(String args[]){
       //Displaying current time
       System.out.println("Time now is -> " + new Date());

       //Creating timer which executes once after five seconds
       Timer timer = new Timer();
       timer.scheduleAtFixedRate(new TaskExampleRepeating(), 1000, 5000);
   }
}

class TaskExampleRepeating extends TimerTask{
   //This task will repeat every five seconds
   public void run(){
      
       Date d = new Date();
		Long time = d.getTime();
		try {
		String TestFile = "C:\\1\\temp_"+time+".txt";
		  File FC = new File(TestFile);//Created object of java File class.
		  
			FC.createNewFile();
		//Create file.
		  
		  //Writing In to file.
		  //Create Object of java FileWriter and BufferedWriter class.
		  FileWriter FW = new FileWriter(TestFile);
				
		  BufferedWriter BW = new BufferedWriter(FW);
         BW.write(""+time);
		  BW.close();
		  System.out.println("added: " + "temp" +d+ ".txt");
       
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
   }
}