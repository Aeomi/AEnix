package net.Elerion.AEnix;

import java.util.ArrayList;

import org.newdawn.slick.geom.Rectangle;


public class Grid {
	
	ArrayList<Rectangle> Elms;
	
	public Grid( int Amt, int ScrRes ){
		this.Elms = new ArrayList<Rectangle>();
		
		for ( int y=0; y<ScrRes; y++ ){
			if(y%Amt==0)
			for ( int x=0; x<ScrRes; x++ ){
				if ( x%Amt==0 ){
					Rectangle Cell = new Rectangle( x, y, Amt, Amt );
					Elms.add( Cell );
				}
				
			}
			
		}
		
		
		
	}
	
	
	
	
}
