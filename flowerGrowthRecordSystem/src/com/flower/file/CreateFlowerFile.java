package com.flower.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @PackageName:com.flower.file
 * @className:createFlowerFile
 * @Description: �ļ���
 * @author:xiao
 * @date 2022/12/10 18:10
 */
public class CreateFlowerFile {
       String path="C:\\Users\\Asus\\Desktop\\����\\����ѧϰ���£�\\ά������\\ӣ�����ɳ���¼";
       //�������ɳ���Ƭ�ļ���
       public  void  createFolder(){
           File  file = new File(path,new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
           if(!file.exists()){
               file.mkdirs();

           }
       }
}
