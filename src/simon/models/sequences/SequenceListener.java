package simon.models.sequences;

import simon.controllers.ColourSquare;
import simon.views.View;
import simon.Utils;

public class SequenceListener extends Thread {
	private ColourSquare[] squares;
	private View listenView;
	
	public int[] generated; // generated sequence
	private final int[] RESET = {5,5,5,5}; // reset default user input sequence arr
	
	public SequenceListener(ColourSquare[] squares) {
		this.squares = squares;
		this.listenView = squares[0].view;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("no change");
			if(this.listenView.sequenceInput[3] != 5) {
				System.out.println("4 taps detected");
				if(Utils.areEqual(this.generated,this.listenView.sequenceInput)) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Incorrect");
				}
				this.currentThread().stop();
				this.listenView.sequenceInput = this.RESET;
			}
			
		}
		
	}	
	
}
