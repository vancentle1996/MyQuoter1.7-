package myquoter_gui;

public class LooseDoubleWeft {
	
	double looseD;
	
	public double looseDoubleWeft(int index) {
		
		switch(index) {
			case 0: looseD = 48; break;
			case 1: looseD = 50.50; break;
			case 2: looseD = 54; break;
			case 3: looseD = 56.50; break;
			case 4: looseD = 59; break;
			case 5: looseD = 61.50; break;
			case 6: looseD = 64; break;
			case 7: looseD = 66.50; break;
			case 8: looseD = 69; break;
			case 9: looseD = 71.50; break;
			case 10: looseD = 74; break;
		}
		return looseD;
	}
}

/*
10	25.4	 $410.00 	 $460.00 
12	30.48	 $435.00 	 $485.00 
14	35.56	 $470.00 	 $520.00 
16	40.64	 $495.00 	 $545.00 
18	45.72	 $520.00 	 $570.00 
20	50.8	 $545.00 	 $595.00 
22	55.88	 $570.00 	 $620.00 
24	60.96	 $595.00 	 $645.00 
26	66.04	 $620.00 	 $670.00 
28	71.12	 $645.00 	 $695.00 
30	76.2	 $670.00 	 $720.00 
*/