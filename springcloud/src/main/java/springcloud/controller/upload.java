package springcloud.controller;

import org.springframework.web.multipart.MultipartFile;

public class upload
{
	private MultipartFile file;

	public MultipartFile getFile()
	{
		return file;
	}

	public void setFile(MultipartFile file)
	{
		this.file = file;
	}
	
}
