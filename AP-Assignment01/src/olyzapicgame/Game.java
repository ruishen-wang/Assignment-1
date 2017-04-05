package olyzapicgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.spi.legacy.connection.LegacyServerSocketEndPointInfo;
import com.sun.webkit.ThemeClient;


public class Game
{

	int n;
	private String referee;
	private String gameID;
	
	 
	public Game(String IDOfGame, String referee)
	{
		gameID=IDOfGame;
		this.referee=referee;
	}

	public String getGameID(String gameID){
		return gameID;
	}
	
	public void setGameID(String gameID){
		this.gameID=gameID;
	}
	
	public String getReferee(String referee){
		return referee;
	
	}
	
	public void setReferee(String referee){
		this.referee=referee;
	}
}
	