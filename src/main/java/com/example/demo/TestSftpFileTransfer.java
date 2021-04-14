package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dev.sftp.service.FileTransferService;
@Component
public class TestSftpFileTransfer {
	@Autowired
	private FileTransferService fileTransferService;
	
	private Logger logger = LoggerFactory.getLogger(TestSftpFileTransfer.class);
	
	public void run(String... args) throws Exception {
        logger.info("Start upload file");
		boolean isUploaded = fileTransferService.uploadFile("/home/simplesolution/readme.txt", "/readme2.txt");
		logger.info("Upload result: " + String.valueOf(isUploaded));
	}
}
