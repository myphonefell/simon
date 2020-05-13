package simon.models.sequences;

import simon.controllers.ColourSquare;

import java.util.Random;

public class SequenceGenerator {

	private ColourSquare[] squares;
	private final int LENGTH = 4;
	private int level;
	private Random rand = new Random();
	
	public SequenceGenerator(ColourSquare[] squares, int level) {
		this.squares = squares;
		this.level = level;
	}
	
	public int[] generateSequence() {
		int temp;
		int[] sequence = new int[this.LENGTH];
		for(int i = 0; i < this.LENGTH; ++i) {
			temp = this.rand.nextInt(this.LENGTH);
			sequence[i] = temp;
			this.squares[temp].glow();
			delay(1000);
			this.squares[temp].unglow();
			delay(1000);
		}
		return sequence;
	}
	
	public void delay(int ms) {
		try {
			Thread.sleep(ms);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
