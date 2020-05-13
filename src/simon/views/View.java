package simon.views;

import javax.swing.*;

import java.awt.*;
import java.awt.*;

import simon.controllers.ColourSquare;

public class View extends JPanel{
	private JLabel title;
	ColourSquare[] boxes=new ColourSquare[4];
	JPanel a,b;
	public int[] sequenceInput = {5,5,5,5};
	
	public View() {
		super();
		this.setBackground(Color.BLACK);
		init();
	}
	private void init() {
		a=new JPanel(new GridLayout(2,1));
		b=new JPanel(new GridLayout(2,2));
		
		title=new JLabel("Simon Says");
		title.setForeground(Color.WHITE);
	    title.setFont(new Font("Jokerman",Font.ITALIC,40));
	    
		boxes[0]=new ColourSquare(Color.RED,0,this);
		boxes[1]=new ColourSquare(Color.YELLOW,1,this);
		boxes[2]=new ColourSquare(Color.BLUE,2,this);
		boxes[3]=new ColourSquare(Color.GREEN,3,this);
		
		a.setBackground(Color.BLACK);
		a.add(title);
		
		b.setBackground(Color.BLACK);
		b.add(boxes[0]);
		b.add(boxes[1]);
		b.add(boxes[2]);
		b.add(boxes[3]);
		
		a.add(b);
		
		this.add(a);
	}
	
	private void endScreen() {
		title.setText("Game Over");
		a.remove(b);
		
	}
	

}
