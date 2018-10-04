package sharepoint;

import java.io.File;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class connectFTPserver {
	static int files = 0;
	static int folders = 0;
	
	
	
    public static void displayIt(String adress, ChannelSftp sftpChannel) throws SftpException{
        sftpChannel.cd(adress);  
        Vector<LsEntry> filelist = sftpChannel.ls(adress);
         for(int i=0; i<filelist.size();i++){
             LsEntry entry = (LsEntry) filelist.get(i);
             if (entry.getFilename().equals(".") || entry.getFilename().equals("..")) {
     			continue;
     		}
             
             System.out.println(adress+"/"+entry.getFilename());
             files = files+1;
            
             if(entry.getAttrs().isDir()){
            	 folders = folders+1;
          displayIt(adress+"/"+entry.getFilename().toString(), sftpChannel);
             }   
         }
    }


	
	  public static void main(String args[]) {
	 
		    JSch jsch = new JSch();
	        Session session = null;
	        try {
	            session = jsch.getSession("acer", "98.220.9.24", 22);
	            session.setConfig("StrictHostKeyChecking", "no");
	            session.setPassword("Comrade20");
	            session.connect();
	            System.out.println("Connected to SFTP server");

	            Channel channel = session.openChannel("sftp");
	            channel.connect();
	            
	      
	        ChannelSftp sftpChannel = (ChannelSftp) channel;     
		  
		  

	            displayIt("/home/acer", sftpChannel);
	        	System.out.println("files: "+(files-folders));
	    		System.out.println("folders: "+folders);
	            
	            sftpChannel.exit();
	            session.disconnect();
 }    
	        
	        
	        catch (JSchException e) {
	            e.printStackTrace();  
	        } catch (SftpException e) {
	            e.printStackTrace();
	        }
	        

	}}
