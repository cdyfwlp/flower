package com.jframe;

import com.flower.file.CreateFlowerFile;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @PackageName:com.jframe
 * @className:FlowerWin
 * @Description:
 * @author:xiao
 * @date 2022/12/10 19:39
 */
public class FlowerWin{
      private void createFlower(){
          JFrame jf=new JFrame("文件夹创建");
          JTextField text=new JTextField();
          text.setVisible(true);
          text.setColumns(10);
          text.setBounds(150,100,300,30);
          jf.add(text);
          JButton button1=new JButton("创建当前时间文件");
          button1.setBounds(150,150,150,30);
          button1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                   CreateFlowerFile createFlowerFile=new CreateFlowerFile();
                   createFlowerFile.createFolder();
              }
          });
          jf.add(button1);
          jf.add(new JButton("创建文件"))
                  .setBounds(300,150,150,30);
          //大小
          jf.setBounds(660,350,600,400);
          //布局
          jf.setLayout(null);
          //可见
          jf.setVisible(true);
      }
      public static void main(String[] args) {
          FlowerWin flowerWin=new FlowerWin();
          flowerWin.createFlower();
      }
}
