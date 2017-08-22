package org.yuexinshuxuan.ws.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.service.QRCodeServiceImpl;

import com.google.zxing.WriterException;

@RestController
public class QRCodeController {

	@Autowired
	QRCodeServiceImpl qrCodeService;
	
	@RequestMapping("/qr")
	public void genAndSaveQRCode() throws WriterException, IOException {
		String qrCodeText = "http://www.gogole.com";
		String filePath = "/Users/yumingwei/Downloads/QRCode.png";
		int size = 125;
		String fileType = "png";
		File qrFile = new File(filePath);
		
		qrCodeService.generateQRImage(qrFile, qrCodeText, size, fileType);
	}
}
