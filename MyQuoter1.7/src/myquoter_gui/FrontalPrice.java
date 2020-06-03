package myquoter_gui;

public class FrontalPrice {
	double straightFrontalPrice, looseFrontalPrice, bodyFrontalPrice, deepFrontalPrice, rareFrontalPrice, steam1FrontalPrice, steam2FrontalPrice, blondeFrontalPrice, greyFrontalPrice; //frontals

	public double straightFrontal(int index) {
		switch(index) {
			case 0: straightFrontalPrice = 90; break;
			case 1: straightFrontalPrice = 100; break;
			case 2: straightFrontalPrice = 105; break;
			case 3: straightFrontalPrice = 110; break;
			case 4: straightFrontalPrice = 115; break;
			case 5: straightFrontalPrice = 120; break;
		}
		return straightFrontalPrice;
	}
	
	public double looseFrontal(int index) {
		switch(index) {
			case 0: looseFrontalPrice = 92.50; break;
			case 1: looseFrontalPrice = 102.50; break;
			case 2: looseFrontalPrice = 107.50; break;
			case 3: looseFrontalPrice = 112.50; break;
			case 4: looseFrontalPrice = 117.50; break;
			case 5: looseFrontalPrice = 122.50; break;
		}
		return looseFrontalPrice;
	}
	
	public double bodyFrontal(int index) {
		switch(index) {
			case 0: bodyFrontalPrice = 93.50; break;
			case 1: bodyFrontalPrice = 103.50; break;
			case 2: bodyFrontalPrice = 108.50; break;
			case 3: bodyFrontalPrice = 113.50; break;
			case 4: bodyFrontalPrice = 118.50; break;
			case 5: bodyFrontalPrice = 123; break;
		}
		return straightFrontalPrice;
	}
	
	public double deepFrontal(int index) {
		switch(index) {
			case 0: deepFrontalPrice = 95; break;
			case 1: deepFrontalPrice = 105; break;
			case 2: deepFrontalPrice = 110; break;
			case 3: deepFrontalPrice = 115; break;
			case 4: deepFrontalPrice = 120; break;
			case 5: deepFrontalPrice = 125; break;
		}
		return deepFrontalPrice;
	}
	
	public double rareFrontal(int index) {
		switch(index) {
			case 0: rareFrontalPrice = 97.50; break;
			case 1: rareFrontalPrice = 107.50; break;
			case 2: rareFrontalPrice = 112.50; break;
			case 3: rareFrontalPrice = 117.50; break;
			case 4: rareFrontalPrice = 122.50; break;
			case 5: rareFrontalPrice = 127.50; break;
		}
		return rareFrontalPrice;
	}
	
	public double steam1Frontal(int index) {
		switch(index) {
			case 0: steam1FrontalPrice = 92.50; break;
			case 1: steam1FrontalPrice = 102.50; break;
			case 2: steam1FrontalPrice = 107.50; break;
			case 3: steam1FrontalPrice = 112.50; break;
			case 4: steam1FrontalPrice = 117.50; break;
			case 5: steam1FrontalPrice = 122.50; break;
		}
		return steam1FrontalPrice;
	}
	
	public double steam2Frontal(int index) {
		switch(index) {
			case 0: steam2FrontalPrice = 92.50; break;
			case 1: steam2FrontalPrice = 102.50; break;
			case 2: steam2FrontalPrice = 107.50; break;
			case 3: steam2FrontalPrice = 112.50; break;
			case 4: steam2FrontalPrice = 117.50; break;
			case 5: steam2FrontalPrice = 122.50; break;
		}
		return steam2FrontalPrice;
	}
	
	public double blondeFrontal(int index) {
		switch(index) {
			case 0: blondeFrontalPrice = 105; break;
			case 1: blondeFrontalPrice = 115; break;
			case 2: blondeFrontalPrice = 120; break;
			case 3: blondeFrontalPrice = 125; break;
			case 4: blondeFrontalPrice = 130; break;
			case 5: blondeFrontalPrice = 135; break;
		}
		return blondeFrontalPrice;
	}
	
	public double greyFrontal(int index) {
		switch(index) {
			case 0: greyFrontalPrice = 92.50; break;
			case 1: greyFrontalPrice = 102.50; break;
			case 2: greyFrontalPrice = 107.50; break;
			case 3: greyFrontalPrice = 112.50; break;
			case 4: greyFrontalPrice = 117.50; break;
			case 5: greyFrontalPrice = 122.50; break;
		}
		return greyFrontalPrice;
	}
}
