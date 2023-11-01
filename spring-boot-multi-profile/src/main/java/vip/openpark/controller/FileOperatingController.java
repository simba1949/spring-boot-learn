package vip.openpark.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author anthony
 * @version 2019/7/8 8:45
 */
@RestController
@RequestMapping("file")
public class FileOperatingController {

	@PostMapping("upload")
	public String upload(@RequestParam(value = "image")MultipartFile file, HttpServletRequest request){
		try {
			// 获取 upload 目录，不存在就在创建
			// 获取当前项目的 classes 目录
			String realPath = FileOperatingController.class.getClassLoader().getResource("").getPath();
			// 获取服务器中当前WebRoot的物理路径
//			String realPath = request.getSession().getServletContext().getRealPath("/");

			File realPathFile = new File(realPath, "upload");
			if (!realPathFile.exists()){
				realPathFile.mkdirs();
			}

			// 文件上传
			file.transferTo(new File(realPathFile,file.getOriginalFilename()));
			return "http://localhost:8080/upload/" + file.getOriginalFilename();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}