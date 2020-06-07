package myquoter_gui;

public class Clip_In {
	double bodyClipPrice, rareClipPrice, steamClipPrice; //clip-in
	
	public double bodyClip(int index) {
		switch(index) {
			case 0: bodyClipPrice = 47; break;
			case 1: bodyClipPrice = 49.50; break;
			case 2: bodyClipPrice = 53; break;
			case 3: bodyClipPrice = 55.50; break;
			case 4: bodyClipPrice = 58; break;
			case 5: bodyClipPrice = 60.50; break;
			case 6: bodyClipPrice = 63; break;
			case 7: bodyClipPrice = 65.50; break;
			case 8: bodyClipPrice = 68; break;
			case 9: bodyClipPrice = 70.50; break;
			case 10: bodyClipPrice = 73; break;
		}
		return bodyClipPrice;
	}
	
	public double rareClip(int index) {
		switch(index) {
			case 0: rareClipPrice = 59; break;
			case 1: rareClipPrice = 61; break;
			case 2: rareClipPrice = 65; break;
			case 3: rareClipPrice = 68; break;
			case 4: rareClipPrice = 70; break;
			case 5: rareClipPrice = 74; break;
			case 6: rareClipPrice = 76; break;
			case 7: rareClipPrice = 79; break;
			case 8: rareClipPrice = 83; break;
			case 9: rareClipPrice = 87; break;
			case 10: rareClipPrice = 87.50; break;
		}
		return rareClipPrice;
	}
	
	public double steam1Clip(int index) {
		switch(index) {
			case 0: steamClipPrice = 51.50; break;
			case 1: steamClipPrice = 53; break;
			case 2: steamClipPrice = 56.50; break;
			case 3: steamClipPrice = 59; break;
			case 4: steamClipPrice = 61.50; break;
			case 5: steamClipPrice = 64; break;
			case 6: steamClipPrice = 66.50; break;
			case 7: steamClipPrice = 69; break;
			case 8: steamClipPrice = 71.50; break;
			case 9: steamClipPrice = 74; break;
			case 10: steamClipPrice = 76.50; break;
		}
		return steamClipPrice;
	}
}
