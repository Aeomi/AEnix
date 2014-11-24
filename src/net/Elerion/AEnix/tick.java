package net.Elerion.AEnix;

import java.util.ArrayList;

public class tick {
	
	public static int total 		 = 0;
	private static tickBuffer Buffer = new tickBuffer( );
	
	public static void addCmd( Runnable Cmd ){
		Buffer.add( Cmd );
	}
	
	public static void exec( ){
		
		for ( Runnable Cmd : Buffer.getBuffer() ){
			Cmd.run( );
		}
		
		Buffer.clear( );
		System.out.println( "Tick: "+ ++tick.total );
	}
	
	
}



class tickBuffer {
	
	private ArrayList<Runnable> buffer;
	
	public tickBuffer( ){
		this.buffer = new ArrayList<Runnable>( );
	}
	
	public void add( Runnable Cmd ){
		this.getBuffer().add( Cmd );
	}
	
	public void clear( ){
		this.getBuffer().clear();
	}

	public ArrayList<Runnable> getBuffer( ){ return buffer; }
	
}