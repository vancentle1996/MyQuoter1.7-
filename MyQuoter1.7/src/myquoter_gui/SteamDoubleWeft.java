package myquoter_gui;

public class SteamDoubleWeft {
	
	double steamD;
	
	public double steamDoubleWeft(int index) {
		
		switch(index) {
			case 0: steamD = 50.50; break;
			case 1: steamD = 53; break;
			case 2: steamD = 56.50; break;
			case 3: steamD = 59; break;
			case 4: steamD = 61.50; break;
			case 5: steamD = 64; break;
			case 6: steamD = 66.50; break;
			case 7: steamD = 69; break;
			case 8: steamD = 71.50; break;
			case 9: steamD = 74; break;
			case 10: steamD = 76.50; break;
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