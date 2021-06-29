package app0526.thread.ex2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class CounterProgress extends JFrame{
	JProgressBar bar_1;
	JProgressBar bar_2;
	JProgressBar bar_3;
	
	JButton bt;
	
	Thread t1;
	Thread t2;
	Thread t3;
	
	public CounterProgress() {
		bar_1 = new JProgressBar();
		bar_2 = new JProgressBar();
		bar_3 = new JProgressBar();
		bt = new JButton("Start");
		
		//스타일 레이아웃
		this.setLayout(new FlowLayout());
		bar_1.setPreferredSize(new Dimension(260, 30));
		bar_2.setPreferredSize(new Dimension(260, 30));
		bar_3.setPreferredSize(new Dimension(260, 30));
		
		add(bar_1);
		add(bar_2);
		add(bar_3);
		add(bt);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600,100,300,200);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBar();
			}
		});
	}
	
	public void addBar() {
		
	}
	
	
	public static void main(String[] args) {
		new CounterProgress();
	}
}
