package myquoter_gui;

public class LooseWaveS {
	
	double loosewave_S_Price;
	
	public double looseS(int index) {
		switch(index) {
		case 0: loosewave_S_Price = 47; break;
		case 1: loosewave_S_Price = 49.50; break;
		case 2: loosewave_S_Price = 53; break;
		case 3: loosewave_S_Price = 55.50; break;
		case 4: loosewave_S_Price = 58; break;
		case 5: loosewave_S_Price = 60.50; break;
		case 6: loosewave_S_Price = 63; break;
		case 7: loosewave_S_Price = 65.50; break;
		case 8: loosewave_S_Price = 68; break;
		case 9: loosewave_S_Price = 70.50; break;
		case 10: loosewave_S_Price = 73; break;
	}
	return loosewave_S_Price;
	}
}

/*
12		 $435.00 	 $495.00 
14		 $470.00 	 $530.00 
16		 $495.00 	 $555.00 
18		 $520.00 	 $580.00 
20		 $545.00 	 $605.00 
22		 $570.00 	 $630.00 
24		 $595.00 	 $655.00 
26		 $620.00 	 $680.00 
28		 $645.00 	 $705.00 
30		 $670.00 	 $730.00 
*/