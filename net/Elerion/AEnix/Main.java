package net.Elerion.AEnix;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	public static void main(String[] args) {
		
        try {
            AppGameContainer AEnix = new AppGameContainer( new AEnix( "AEnix" ) );
            AEnix.setDisplayMode( Conf.AEnix.Res, Conf.AEnix.Res, false );
            AEnix.start( );
        } catch ( SlickException Error ){
            Error.printStackTrace( );
        }
        
        try {
            AppGameContainer Menu = new AppGameContainer( new Menu( "Menu" ) );
            Menu.setDisplayMode( Conf.Menu.Res, Conf.Menu.Res, false );
           // Menu.start( );
        } catch ( SlickException Error ){
            Error.printStackTrace( );
        }
		
		
	}

}
