package myquoter_gui;

public class BodyHeavyClip {
	double bodyHeavyClipPrice;
	
	public double bodyHeavyClip(int index) {
		
		switch(index) {
			case 0: bodyHeavyClipPrice = 61.50; break;
			case 1: bodyHeavyClipPrice = 64.35; break;
			case 2: bodyHeavyClipPrice = 68.90; break;
			case 3: bodyHeavyClipPrice = 72.15; break;
			case 4: bodyHeavyClipPrice = 75.40; break;
			case 5: bodyHeavyClipPrice = 90.75; break;
			case 6: bodyHeavyClipPrice = 94.50; break;
			case 7: bodyHeavyClipPrice = 98.20; break;
			case 8: bodyHeavyClipPrice = 102; break;
			case 9: bodyHeavyClipPrice = 105.75; break;
			case 10: bodyHeavyClipPrice = 109.50; break;
		}
		return bodyHeavyClipPrice;  
	}
}



/*

Body Wave HEAVY clips					
inch	cm	Price			
10	25.4	 $420.00 	 $61.10 		
12	30.48	 $445.00 	 $643.50 	multiply by 1.3	
14	35.56	 $480.00 	 $689.00 		
16	40.64	 $505.00 	 $721.50 		
18	45.72	 $530.00 	 $754.00 		
20	50.8	 $555.00 	 $907.50 	multiply by 1.3	
22	55.88	 $580.00 	 $945.00 		
24	60.96	 $605.00 	 $982.50 		
26	66.04	 $630.00 	 $1,020.00 		
28	71.12	 $655.00 	 $1,057.50 		



*/