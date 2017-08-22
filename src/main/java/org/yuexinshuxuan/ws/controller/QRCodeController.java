package org.yuexinshuxuan.ws.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.service.QRCodeService;
import org.yuexinshuxuan.ws.service.QRCodeServiceImpl;

import com.google.zxing.WriterException;

@RestController
public class QRCodeController {

	@Autowired
	QRCodeService qrCodeService;
	
	@RequestMapping("/saveQRCode")
	public String genAndSaveQRCode() throws WriterException, IOException {
		String qrCodeText = "http://www.gogole.com";
		String filePath = "/Users/yumingwei/Downloads/QRCode.png";
		int size = 125;
		String fileType = "png";
		File qrFile = new File(filePath);
		
		qrCodeService.generateQRImage(qrFile, qrCodeText, size, fileType);
		
		return "Done";
	}
	
	@RequestMapping("/generateQRCode")
	public void generateQRCode() throws WriterException, IOException {
		String qrCodeText = "http://www.gogole.com";
		int size = 125;
		String fileType = "png";
		
		qrCodeService.generateQRStream(qrCodeText, size, fileType);
	}
}
