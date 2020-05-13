package simon.views;

import java.awt.Dimension;

import javax.swing.JFrame;

import simon.models.sequences.SequenceGenerator;
import simon.models.sequences.SequenceListener;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		View view = new View();
		SequenceGenerator gen = new SequenceGenerator(view.boxes,1);
		SequenceListener in = new SequenceListener(view.boxes);
		
		frame.setPreferredSize(new Dimension(600,600));
		frame.setContentPane(view);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		gen.delay(2000);
		int[] sequence = gen.generateSequence();
		in.generated = sequence;
		in.start();
		

	}

}
