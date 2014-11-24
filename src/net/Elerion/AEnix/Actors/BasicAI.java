package net.Elerion.AEnix.Actors;

import net.Elerion.AEnix.tick;
import net.Elerion.AMath.AMath;


public class BasicAI {
	
	public Player Actor;
	
	public BasicAI( Player Actor ){
		this.Actor = Actor;
	}
	
	public void moveRnd( ){
		int rndDir = AMath.rand( 0, 3 );
		switch (rndDir){
			case(0):{tick.addCmd(this.Actor.moveUp()); break;}
			case(1):{tick.addCmd(this.Actor.moveDown()); break;}
			case(2):{tick.addCmd(this.Actor.moveLeft()); break;}
			case(3):{tick.addCmd(this.Actor.moveRight()); break;}
		}
		
	}
	
	
	
}
