package net.Elerion.AEnix;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Menu extends BasicGame {

	public Menu( String Title ) {
		super( Title );
	}

	@Override
	public void init( GameContainer Frame ) throws SlickException {
		Frame.setClearEachFrame( true );
		Frame.setVSync( true );
		Frame.setForceExit( true );
		Frame.setSmoothDeltas( true );
		
	}

	@Override
	public void update( GameContainer Frame, int Delta ) throws SlickException {
		
	}
	
	@Override
	public void render( GameContainer Frame, Graphics Rend ) throws SlickException {
		
	}
	
	
}
