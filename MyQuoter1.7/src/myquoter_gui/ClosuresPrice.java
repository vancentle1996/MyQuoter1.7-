package myquoter_gui;

public class ClosuresPrice {
	double straightClosurePrice, looseClosurePrice, bodyClosurePrice, deepClosurePrice, rareClosurePrice, 
	steam1ClosurePrice, steam2ClosurePrice, blondeClosurePrice, blonde55ClosurePrice, greyClosurePrice; //closures
	
	public double straightClosure(int index) {
		switch(index) {
			case 0: straightClosurePrice = 50; break;
			case 1: straightClosurePrice = 55; break;
			case 2: straightClosurePrice = 60; break;
			case 3: straightClosurePrice = 65; break;
			case 4: straightClosurePrice = 70; break;
			case 5: straightClosurePrice = 75; break;
		}
		return straightClosurePrice;
	}
	
	public double looseClosure(int index) {
		switch(index) {
			case 0: looseClosurePrice = 52.50; break;
			case 1: looseClosurePrice = 57.50; break;
			case 2: looseClosurePrice = 62.50; break;
			case 3: looseClosurePrice = 67.50; break;
			case 4: looseClosurePrice = 72.50; break;
			case 5: looseClosurePrice = 77.50; break;
		}
		return looseClosurePrice;
	}
	
	public double bodyClosure(int index) {
		switch(index) {
			case 0: bodyClosurePrice = 53.50; break;
			case 1: bodyClosurePrice = 58.50; break;
			case 2: bodyClosurePrice = 63.50; break;
			case 3: bodyClosurePrice = 68.50; break;
			case 4: bodyClosurePrice = 73.50; break;
			case 5: bodyClosurePrice = 78.50; break;
		}
		return bodyClosurePrice;
	}
	
	public double deepClosure(int index) {
		switch(index) {
			case 0: deepClosurePrice = 55; break;
			case 1: deepClosurePrice = 60; break;
			case 2: deepClosurePrice = 65; break;
			case 3: deepClosurePrice = 70; break;
			case 4: deepClosurePrice = 75; break;
			case 5: deepClosurePrice = 80; break;
		}
		return deepClosurePrice;
	}
	
	public double rareClosure(int index) {
		switch(index) {
			case 0: rareClosurePrice = 57.50; break;
			case 1: rareClosurePrice = 62.50; break;
			case 2: rareClosurePrice = 67.50; break;
			case 3: rareClosurePrice = 72.50; break;
			case 4: rareClosurePrice = 77.50; break;
			case 5: rareClosurePrice = 82.50; break;
		}
		return rareClosurePrice;
	}
	
	public double steam1Closure(int index) {
		switch(index) {
			case 0: steam1ClosurePrice = 52.50; break;
			case 1: steam1ClosurePrice = 57.50; break;
			case 2: steam1ClosurePrice = 62.50; break;
			case 3: steam1ClosurePrice = 67.50; break;
			case 4: steam1ClosurePrice = 72.50; break;
			case 5: steam1ClosurePrice = 77.50; break;
		}
		return steam1ClosurePrice;
	}
	
	public double steam2Closure(int index) {
		switch(index) {
			case 0: steam2ClosurePrice = 52.50; break;
			case 1: steam2ClosurePrice = 57.50; break;
			case 2: steam2ClosurePrice = 62.50; break;
			case 3: steam2ClosurePrice = 67.50; break;
			case 4: steam2ClosurePrice = 72.50; break;
			case 5: steam2ClosurePrice = 77.50; break;
		}
		return steam2ClosurePrice;
	}
	
	public double blondeClosure(int index) {
		switch(index) {
			case 0: blondeClosurePrice = 60; break;
			case 1: blondeClosurePrice = 65; break;
			case 2: blondeClosurePrice = 70; break;
			case 3: blondeClosurePrice = 75; break;
			case 4: blondeClosurePrice = 80; break;
			case 5: blondeClosurePrice = 85; break;
		}
		return blondeClosurePrice;
	}
	
	public double blonde5x5Closure(int index) {
		switch(index) {
			case 0: blonde55ClosurePrice = 75; break;
			case 1: blonde55ClosurePrice = 80; break;
			case 2: blonde55ClosurePrice = 85; break;
			case 3: blonde55ClosurePrice = 90; break;
			case 4: blonde55ClosurePrice = 95; break;
			case 5: blonde55ClosurePrice = 100; break;	
		}
		return blonde55ClosurePrice;
	}
	
	public double greyClosure(int index) {
		switch(index) {
			case 0: greyClosurePrice = 52.50; break;
			case 1: greyClosurePrice = 57.50; break;
			case 2: greyClosurePrice = 62.50; break;
			case 3: greyClosurePrice = 67.50; break;
			case 4: greyClosurePrice = 72.50; break;
			case 5: greyClosurePrice = 77.50; break;
		}
		return greyClosurePrice;
	}
	
}
