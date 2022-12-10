package com.flower.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @PackageName:com.flower.file
 * @className:createFlowerFile
 * @Description: 文件夹
 * @author:xiao
 * @date 2022/12/10 18:10
 */
public class CreateFlowerFile {
       String path="C:\\Users\\Asus\\Desktop\\技术\\工作学习（新）\\维护发布\\樱花树成长记录";
       //创建树成长照片文件夹
       public  void  createFolder(){
           File  file = new File(path,new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
           if(!file.exists()){
               file.mkdirs();

           }
       }
}
