package Collection10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class MatchesPlayed implements Comparator<Player>
{
	public int compare(Player i1,Player i2) {
		if(i1.getMatchesPlayed()<i2.getMatchesPlayed()) 
		{
			return +1;
		}
		else if(i1.getMatchesPlayed()>i2.getMatchesPlayed()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	}
class PlayerName implements Comparator<Player>
{
	public int compare(Player i1,Player i2) {
		return i1.getPlayerName().compareTo(i2.getPlayerName());
	}
}
class Player implements Comparable<Player>
{
    private int playerId;
    private String playerName;
    private int matchesPlayed;
    private double averageScore;
   

	public Player(int playerId, String playerName, int matchesPlayed, double averageScore) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.averageScore = averageScore;
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}


	public double getAverageScore() {
		return averageScore;
	}


	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}


	@Override
	public int compareTo(Player o) {
		if(this.getAverageScore()<o.getAverageScore()) 
		{
			return +1;
		}
		else if(this.getAverageScore()>o.getAverageScore()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}


	@Override
	public String toString() {
		return "\n\nplayerId=" + playerId + " , playerName=" + playerName + " , matchesPlayed=" + matchesPlayed
				+ " , averageScore=" + averageScore + "";
	}
	
	}
public class SportMain {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<Player> t=new ArrayList<>();
	while(true) 
	{
		System.out.println("Press 1 ---> Add Player Detail");
		System.out.println("Press 2 ---> Print");
		System.out.println("Press 3 ---> Sort by matches played");
		System.out.println("Press 4 ---> Sort by player name");
		System.out.println();
		System.out.println("Enter your choice : ");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		case 1: System.out.print("Enter Id : ");
		int id=Integer.parseInt(sc.nextLine());
		 System.out.print("Enter name : ");
		String name =sc.nextLine();
		 System.out.print("Enter number matches played : ");
		int number=Integer.parseInt(sc.nextLine());
		System.out.print("Enter number average course : ");
		Double ac=Double.parseDouble(sc.nextLine());
		Player p=new Player(id,name,number,ac);
		t.add(p);
		break;
		case 2:System.out.println("Average Score : ");
		Collections.sort(t);
		System.out.println(t);
		break;
		case 3:System.out.println("Match Played : ");
		t.sort(new MatchesPlayed());
		System.out.println(t);
		break;
		case 4:System.out.println("Player Name: ");
		t.sort(new PlayerName());
		System.out.println(t);
		break;
		

		}
		
	}
}
}
