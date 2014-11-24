package net.Elerion.AMath;

public class AMath {
	
	public static int rand( int Min, int Max ){
		return (int)(Math.random()*(Max+1-Min))+Min;
		
	}

	public static float rand( float Min, float Max ){
		return ((int)(Math.random()*(Max+1-Min))+Min);
	}
	
	public static double rand( double Min, double Max ){
		return ((int)(Math.random()*(Max+1-Min))+Min);
	}
	
}
