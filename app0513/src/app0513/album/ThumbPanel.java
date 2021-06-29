package app0513.album;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

//썸네일의 이미지를 그리기 위한 썸네일 패널
public class ThumbPanel extends JPanel implements MouseListener{
	Toolkit kit;
	Image image;
	int width=50;
	int height=50;
	XCanvas can; //null, 필요하면 has a관계로 보유하면 된다!!
	
	public ThumbPanel(String filename, XCanvas can) {
		this.setPreferredSize(new Dimension(width, height));
		kit = Toolkit.getDefaultToolkit(); //new 할수 없다!!
		image = kit.getImage(filename);
		this.can = can; //넘겨받은 캔버스 주소값을 멤버변수에 보관해놓자!!
		
		this.addMouseListener(this); //패널인 나 자신과 리스너인 나 자신을 연결
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, width, height, this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("XCanvas에 전달할 이미지는 "+image);
		can.setImage(image); //XCanvas의 가진 setImage()메서드 호출!!!
		can.repaint(); //캔버스 다시 그리기 요청
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
