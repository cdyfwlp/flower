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
          JFrame jf=new JFrame("�ļ��д���");
          JTextField text=new JTextField();
          text.setVisible(true);
          text.setColumns(10);
          text.setBounds(150,100,300,30);
          jf.add(text);
          JButton button1=new JButton("������ǰʱ���ļ�");
          button1.setBounds(150,150,150,30);
          button1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                   CreateFlowerFile createFlowerFile=new CreateFlowerFile();
                   createFlowerFile.createFolder();
              }
          });
          jf.add(button1);
          jf.add(new JButton("�����ļ�"))
                  .setBounds(300,150,150,30);
          //��С
          jf.setBounds(660,350,600,400);
          //����
          jf.setLayout(null);
          //�ɼ�
          jf.setVisible(true);
      }
      public static void main(String[] args) {
          FlowerWin flowerWin=new FlowerWin();
          flowerWin.createFlower();
      }
}
