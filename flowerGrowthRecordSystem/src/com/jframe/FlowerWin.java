package com.jframe;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @PackageName:com.jframe
 * @className:FlowerWin
 * @Description:
 * @author:xiao
 * @date 2022/12/10 19:39
 */
public class FlowerWin extends JFrame{
      public void createFlower(){
          JFrame jf=new JFrame("文件夹创建");
          //大小
          jf.setSize(600,300);
          //可见
          jf.setVisible(true);
          //容器
          Container container=jf.getContentPane();
          //面板
          JPanel jPanel=new JPanel();
          container.add(jPanel);

          JTextField text=new JTextField();
          text.setBounds(150,100,300,30);
          jPanel.add(text);

          jPanel.add(new JButton("创建文件"))
                  .setBounds(150,150,150,30);

          jPanel.add(new JButton("创建当前时间文件"))
                  .setBounds(300,150,150,30);
      }
      public static void main(String[] args) {
          FlowerWin flowerWin=new FlowerWin();
          flowerWin.createFlower();
      }
}
