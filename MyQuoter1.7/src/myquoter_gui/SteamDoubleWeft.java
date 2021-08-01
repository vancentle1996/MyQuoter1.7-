package myquoter_gui;

public class SteamDoubleWeft {
	
	double steamD;
	
	public double steamDoubleWeft(int index) {
		
		switch(index) {
			case 0: steamD = 52.50; break;
			case 1: steamD = 55; break;
			case 2: steamD = 58.50; break;
			case 3: steamD = 61; break;
			case 4: steamD = 63.50; break;
			case 5: steamD = 66; break;
			case 6: steamD = 68.50; break;
			case 7: steamD = 71; break;
			case 8: steamD = 73.50; break;
			case 9: steamD = 76; break;
			case 10: steamD = 78.50; break;
		}
		return steamD;
	}
}

/* 

10	25.4	 $455.00 	 $505.00 
12	30.48	 $480.00 	 $530.00 
14	35.56	 $515.00 	 $565.00 
16	40.64	 $540.00 	 $590.00 
18	45.72	 $565.00 	 $615.00 
20	50.8	 $590.00 	 $640.00 
22	55.88	 $615.00 	 $665.00 
24	60.96	 $640.00 	 $690.00 
26	66.04	 $665.00 	 $715.00 
28	71.12	 $690.00 	 $740.00 

*/