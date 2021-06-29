package practice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame{
   JTextField id;
   JTextField pw;
   JTextField pwCheck;
   JTextField name;
   JButton bt;
   
   public Login() {
      //생성
      id = new JTextField("ID 입력", 20);
      id.setForeground(Color.LIGHT_GRAY);
      pw = new JTextField("비밀번호 입력", 20);
      pw.setForeground(Color.LIGHT_GRAY);
      pwCheck = new JTextField("비밀번호 확인", 20);
      pwCheck.setForeground(Color.LIGHT_GRAY);
      name = new JTextField("이름 입력", 20);
      name.setForeground(Color.LIGHT_GRAY);
      bt = new JButton("등록");
      
      //스타일 및 레이아웃
      Dimension d = new Dimension(250, 40);
      setLayout(new FlowLayout());
      
      id.setPreferredSize(d);
      pw.setPreferredSize(d);
      pwCheck.setPreferredSize(d);
      name.setPreferredSize(d);
      
      //조립
      add(id);
      add(pw);
      add(pwCheck);
      add(name);
      add(bt);
      
      //리스너
      id.addFocusListener(new FocusListener() {
          public void focusGained(FocusEvent e) {
              if (id.getText().equals("ID 입력")) {
                     id.setText("");
                     id.setForeground(Color.BLACK);
                  }
          }

          public void focusLost(FocusEvent e) {
             if (id.getText().isEmpty()) {
                  id.setForeground(Color.LIGHT_GRAY);
                  id.setText("ID 입력");
               }
          }
       });
      
      pw.addFocusListener(new FocusListener() {
         public void focusGained(FocusEvent e) {
            if (pw.getText().equals("비밀번호 입력")) {
               pw.setText("");
               pw.setForeground(Color.BLACK);
            }
         }
         
         public void focusLost(FocusEvent e) {
            if (pw.getText().isEmpty()) {
               pw.setForeground(Color.LIGHT_GRAY);
               pw.setText("비밀번호 입력");
            }
         }
      });
      
      pwCheck.addFocusListener(new FocusListener() {
         public void focusGained(FocusEvent e) {
            if (pwCheck.getText().equals("비밀번호 확인")) {
               pwCheck.setText("");
               pwCheck.setForeground(Color.BLACK);
            }
         }
         
         public void focusLost(FocusEvent e) {
            if (pwCheck.getText().isEmpty()) {
               pwCheck.setForeground(Color.LIGHT_GRAY);
               pwCheck.setText("비밀번호 확인");
            }
         }
      });
      
      name.addFocusListener(new FocusListener() {
         public void focusGained(FocusEvent e) {
            if (name.getText().equals("이름 입력")) {
               name.setText("");
               name.setForeground(Color.BLACK);
            }
         }
         
         public void focusLost(FocusEvent e) {
            if (name.getText().isEmpty()) {
               name.setForeground(Color.LIGHT_GRAY);
               name.setText("이름 입력");
            }
         }
      });
      
      bt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         regist();
      }
   });
      
      //보이기
      setVisible(true);
      setBounds(300, 150, 300, 350);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public void regist() {
      if(id.getText().isEmpty() ||pw.getText().isEmpty() ||
               pwCheck.getText().isEmpty() ||name.getText().isEmpty()
               || id.getText().equals("ID 입력") || pw.getText().equals("비밀번호 입력")||
               pwCheck.getText().equals("비밀번호 확인")|| name.getText().equals("이름 입력")) {
            JOptionPane.showMessageDialog(null, "빈칸을 입력해주세요");
         }
         else {
            
            if(pw.getText().equals(pwCheck.getText() ) ) {
               JOptionPane.showMessageDialog(null, "등록성공");
            }
            else {
               JOptionPane.showMessageDialog(null, "비밀번호 확인해주세요");
            }
            
         }
      }

   public static void main(String[] args) {
      new Login();
   }
}