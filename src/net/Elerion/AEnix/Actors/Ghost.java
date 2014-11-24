package net.Elerion.AEnix.Actors;

import net.Elerion.AEnix.Conf;

import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;

public class Ghost {
	
	public Rectangle Elm;
	public int Height, Width;
	public Color Clr;
	private boolean outOfBounds;
	
	public Ghost( Player Pl ){
		this.Height = Pl.Height;
		this.Width = Pl.Width;
		this.Clr = new Color( Pl.Clr.r, Pl.Clr.g, Pl.Clr.b, 0.25f );
		this.Elm = new Rectangle( Pl.getPos().x, Pl.getPos().y, this.Height, this.Width );
	}
	
	public void moveUp( ){
		this.setPos( this.getPos( ).x, this.getPos().y-16 );
	}
	public void moveDown( ){
		this.setPos( this.getPos( ).x, this.getPos().y+16 );
	}
	public void moveLeft( ){
		this.setPos( this.getPos( ).x-16, this.getPos().y );
	}
	public void moveRight( ){
		this.setPos( this.getPos( ).x+16, this.getPos().y );
	}
	
	
	
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
	
}
