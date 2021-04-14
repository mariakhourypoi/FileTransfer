package dev.sftp.service;

public interface FileTransferService {
	
	boolean uploadFile(String localFilePath, String remoteFilePath);
	

}
