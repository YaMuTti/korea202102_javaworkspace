package practice;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



public class Album extends JFrame{

   JPanel p_south;
   JPanel canvas;
   JPanel can;

   Color[] colors=new Color[7];
   Thumbnail[] list=new Thumbnail[7];

   public void createThumb() {

      for (int i = 0; i < list.length; i++) {
         list[i]=new Thumbnail(colors[i], this);//생성
         p_south.add(list[i]);
      }
   }

   public Album() {

      colors[0]=Color.red;
      colors[1]=Color.orange;
      colors[2]=Color.yellow;
      colors[3]=Color.green;
      colors[4]=Color.blue;
      colors[5]=new Color(0,0,128);
      colors[6]=new Color(128,0,128);

      //생성

      p_south=new JPanel();
      canvas=new JPanel();
      can=new JPanel();

      //스타일, 레이아웃

      p_south.setPreferredSize(new Dimension(900,100));
      can.setPreferredSize(new Dimension(800, 450));
      can.setBorder(new LineBorder(Color.BLACK));
      canvas.setBorder(new LineBorder(Color.BLACK));
      p_south.setBorder(new LineBorder(Color.BLACK));
     
      canvas.setBackground(Color.white);
      p_south.setBackground(Color.white);

      //조립
      canvas.add(can);
      createThumb();
      add(p_south, BorderLayout.SOUTH);
      add(canvas);

      //보여주기
      setBounds(300, 150, 900, 600);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      new Album();
   }
}

class Thumbnail extends JPanel{
   Album Album;
   Color colors;

   public Thumbnail(Color colors, Album Album) {
      this.Album=Album;  
      this.colors=colors;
      this.setBackground(colors);
      this.setPreferredSize(new Dimension(110, 80));
      this.addMouseListener(new MouseAdapter() {

         public void mouseReleased(MouseEvent e) {
            Album.can.setBackground(colors);
         }
      });
   }
}