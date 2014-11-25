package net.Elerion.AEnix.Actors;

import net.Elerion.AEnix.tick;
import net.Elerion.AMath.AMath;


public class BasicAI {
	
	public Player Actor;
	
	public BasicAI( Player Actor ){
		this.Actor = Actor;
	}
	
	public void moveRnd( ){
		int rndDir = AMath.rand( 0, 4 );
		switch (rndDir){
			case(1):{
				tick.addCmd(this.Actor.moveUp());	this.Actor.ghost.moveUp();	break;
			}
			case(2):{ tick.addCmd(this.Actor.moveDown());	this.Actor.ghost.moveDown();	break;}
			case(3):{ tick.addCmd(this.Actor.moveLeft());	this.Actor.ghost.moveLeft();	break;}
			case(4):{ tick.addCmd(this.Actor.moveRight());	this.Actor.ghost.moveRight();	break;}
		}
	}
	
	
	
	
	
}
