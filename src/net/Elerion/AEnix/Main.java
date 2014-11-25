package net.Elerion.AEnix;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) throws SlickException {
		
        try {
            AppGameContainer AEnix = new AppGameContainer( new AEnix( "AEnix" ) );
            AEnix.setDisplayMode( Conf.AEnix.Res, Conf.AEnix.Res, false );
            AEnix.start( );
        } catch ( SlickException Error ){
            Error.printStackTrace( );
        }
        
       
		
	}

}

