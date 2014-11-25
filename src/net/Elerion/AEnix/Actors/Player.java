package net.Elerion.AEnix.Actors;

import net.Elerion.AEnix.Conf;
import net.Elerion.AEnix.tick;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;


public class Player extends Actor {
	public int Width;
	public int Height;
	public boolean outOfBounds;
	public Rectangle Elm;
	public Color Clr;
	public Ghost ghost;

	
	
	public Player( Vector2f startPos, int sizeX, int sizeY, Color startColor ){
		this.Width  		= sizeX;
		this.Height 		= sizeY;
		this.outOfBounds 	= false;
		this.Clr			= startColor;
		this.turnsPerTick	= 1;
		this.turns			= this.turnsPerTick;
		this.Elm 			= new Rectangle( startPos.x, startPos.y, sizeX, sizeY );
		this.ghost 			= new Ghost( this );
		
		tick.regAsActor( this );
	}

	
	//|**************
	//|	MOVEMENT	*
	//|**************
	public Runnable moveUp( ){
		if ( --turns <= 0 ) return null;
		Player self = this;
		return new Runnable( ){ public void run(){
			self.setPos( self.getPos().x, self.getPos().y -16 );
		}; };
	}
	
	public Runnable moveDown( ){
		if ( --turns <= 0 ) return null;
		Player self = this;
		return new Runnable( ){ public void run(){
			self.setPos( self.getPos().x, self.getPos().y +16 );
		}; };
	}
	
	public Runnable moveLeft( ){
		if ( --turns <= 0 ) return null;
		Player self = this;
		return new Runnable( ){ public void run(){
			self.setPos( self.getPos().x -16, self.getPos().y );
		}; };
	}
	
	public Runnable moveRight( ){
		if ( --turns <= 0 ) return null;
		Player self = this;
		return new Runnable( ){ public void run(){
			self.setPos( self.getPos().x +16, self.getPos().y );
		}; };
	}
	
	
	//|**************
	//|	MUTATORS	*
	//|**************
	public Vector2f getPos( ){
		return this.Elm.getLocation( );
	}
	
	public boolean isOutOfBounds( ){
		return this.outOfBounds;
	}

	public void setPos( float x, float y ){
		if ( x+this.Width > Conf.AEnix.Res || y+this.Height > Conf.AEnix.Res ) return;
		if ( x < 0 || y < 0  ) return;
		this.Elm.setLocation( x, y );
	}
	
	public void setPos( Vector2f newPos ){
		this.Elm.setLocation( newPos );
	}
	
	
}
