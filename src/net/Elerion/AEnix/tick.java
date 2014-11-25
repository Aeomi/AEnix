package net.Elerion.AEnix;

import java.util.ArrayList;

import net.Elerion.AEnix.Actors.Actor;
import net.Elerion.AEnix.Actors.BasicAI;
import net.Elerion.AEnix.Actors.Player;

public class tick {
	
	public static int total = 0;
	private static ArrayList<Actor> registeredActors = new ArrayList<Actor>();
	private static tickBuffer Buffer = new tickBuffer( );
	
	public static void addCmd( Runnable Cmd ){ Buffer.add( Cmd ); }
	
	public static void exec( Runnable tickHook ){	
		tickHook.run( );
		
		for ( Runnable Cmd : Buffer.getBuffer() ){ Cmd.run( ); }
		
		Buffer.clear( );
		for ( Actor User : registeredActors ){ User.resetTurns(); }
		System.out.println( "Tick: "+ ++tick.total );
	}
	
	public static void regAsActor( BasicAI Actor ){ Actor.Actor.turns = Actor.Actor.turnsPerTick; }
	public static void regAsActor( Player Actor ){ Actor.turns = Actor.turnsPerTick; }
	
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