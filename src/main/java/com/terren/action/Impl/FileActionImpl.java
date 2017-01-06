package com.terren.action.Impl;

import com.terren.action.IUserAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/1/6.
 */
@Controller
public class FileActionImpl implements IUserAction{
    @RequestMapping(value="fileUpload")
    public String   goToFileUpload(){
        return  "FileUpload";
    }

    @RequestMapping(value = "uploadFileAction")
    public void getFileUpload(@RequestParam MultipartFile[] myfiles, HttpServletRequest request){
        for(int i=0;i<myfiles.length;i++){
            System.out.println(myfiles[i].getOriginalFilename());
        }

    }
}
