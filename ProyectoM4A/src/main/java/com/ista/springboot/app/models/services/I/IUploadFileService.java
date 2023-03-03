package com.ista.springboot.app.models.services.I;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.annotation.Resource;

import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {

	public Resource load(String filename) throws MalformedURLException;
	
	public String copy(MultipartFile file) throws IOException;
	
	public boolean delete(String filename);
}
