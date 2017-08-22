package org.yuexinshuxuan.ws.service;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.google.zxing.WriterException;

public interface QRCodeService {

	void generateQRImage(File qrFile, String qrCodeText, int size, String fileType) throws WriterException, IOException;

	OutputStream generateQRStream(String qrCodeText, int size, String fileType) throws WriterException, IOException;

}