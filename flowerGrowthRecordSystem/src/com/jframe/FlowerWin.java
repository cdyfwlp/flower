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
          JFrame jf=new JFrame("�ļ��д���");
          JTextField text=new JTextField();
          text.setVisible(true);
          text.setColumns(10);
          text.setBounds(150,100,300,30);
          jf.add(text);
          jf.add(new JButton("�����ļ�"))
                  .setBounds(150,150,150,30);
          jf.add(new JButton("������ǰʱ���ļ�"))
                  .setBounds(300,150,150,30);
          //��С
          jf.setBounds(660,350,600,400);
          //�ɼ�
          jf.setLayout(null);
          jf.setVisible(true);

      }
      public static void main(String[] args) {
          FlowerWin flowerWin=new FlowerWin();
          flowerWin.createFlower();
      }
}
