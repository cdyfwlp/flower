package com.jframe;

import javax.swing.*;
import java.awt.*;


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
          jf.add(new JButton("创建文件"))
                  .setBounds(150,150,150,30);
          jf.add(new JButton("创建当前时间文件"))
                  .setBounds(300,150,150,30);
          //大小
          jf.setBounds(660,350,600,400);
          //可见
          jf.setLayout(null);
          jf.setVisible(true);

      }
      public static void main(String[] args) {
          FlowerWin flowerWin=new FlowerWin();
          flowerWin.createFlower();
      }
}
