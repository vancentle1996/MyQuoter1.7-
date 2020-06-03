package myquoter_gui;

public class Clip_In {
	double bodyClipPrice, rareClipPrice, steamClipPrice; //clip-in
	
	public double bodyClip(int index) {
		switch(index) {
			case 0: bodyClipPrice = 45; break;
			case 1: bodyClipPrice = 47.50; break;
			case 2: bodyClipPrice = 51; break;
			case 3: bodyClipPrice = 53.50; break;
			case 4: bodyClipPrice = 56; break;
			case 5: bodyClipPrice = 58.50; break;
			case 6: bodyClipPrice = 61; break;
			case 7: bodyClipPrice = 63.50; break;
			case 8: bodyClipPrice = 66; break;
			case 9: bodyClipPrice = 68.50; break;
			case 10: bodyClipPrice = 71; break;
		}
		return bodyClipPrice;
	}
	
	public double rareClip(int index) {
		switch(index) {
			case 0: rareClipPrice = 57; break;
			case 1: rareClipPrice = 59; break;
			case 2: rareClipPrice = 62; break;
			case 3: rareClipPrice = 66; break;
			case 4: rareClipPrice = 68; break;
			case 5: rareClipPrice = 72; break;
			case 6: rareClipPrice = 74; break;
			case 7: rareClipPrice = 77; break;
			case 8: rareClipPrice = 81; break;
			case 9: rareClipPrice = 84; break;
			case 10: rareClipPrice = 85.50; break;
		}
		return rareClipPrice;
	}
	
	public double steam1Clip(int index) {
		switch(index) {
			case 0: steamClipPrice = 48.50; break;
			case 1: steamClipPrice = 51; break;
			case 2: steamClipPrice = 54.50; break;
			case 3: steamClipPrice = 57; break;
			case 4: steamClipPrice = 59.50; break;
			case 5: steamClipPrice = 62; break;
			case 6: steamClipPrice = 64.50; break;
			case 7: steamClipPrice = 67; break;
			case 8: steamClipPrice = 69.50; break;
			case 9: steamClipPrice = 72; break;
			case 10: steamClipPrice = 74.50; break;
		}
		return steamClipPrice;
	}
}
