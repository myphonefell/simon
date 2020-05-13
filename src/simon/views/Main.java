package simon.views;

import java.awt.Dimension;

import javax.swing.JFrame;

import simon.models.sequences.SequenceGenerator;
import simon.models.sequences.SequenceListener;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		View view = new View();
		SequenceGenerator gen = new SequenceGenerator(1,view);
		SequenceListener in = new SequenceListener(gen.squares,gen,view);

		frame.setPreferredSize(new Dimension(600,600));
		frame.setContentPane(view);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		gen.delay(100);
		int[] sequence = gen.generateSequence();
		in.generated = sequence;
		in.start();
		

	}

}
