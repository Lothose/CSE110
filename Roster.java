// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment08
// Author      : Brandon Billmeyer & 1220167299
// Description : Roster class to be used with Assignment08.java

//import file reader and exception handler
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


class Roster {
	//Private variables
	private ArrayList<Player> players;
	
	//default constructor
	public Roster() {
		this.players = new ArrayList<Player>();
	}
	
	//overloaded constructor
	public Roster(String str1) {
		this.players = new ArrayList<Player>();
		String line;    
		//try file reader
		try {  
			//read file from string in roster method
			FileReader fr= new FileReader(str1);  
			//new input from file
			Scanner in = new Scanner(fr);
			//temporary variables to store data
			String str = "";
			double dbl1 = 0;
			double dbl2 = 0;
			//while loop for next line
			while (in.hasNext()) {  
				line = in.nextLine(); 
				//split line into array by watching for space " ". 
				String[] temp = line.split(" ");
				//assign split to temp variables
				str = temp[0] + " " + temp[1];
				dbl1 = Double.parseDouble(temp[2]);
				dbl2 = Double.parseDouble(temp[3]);
				//add player based on temp variables
				addPlayer(str, dbl1, dbl2);
				}   
			in.close();
			}    
		//catch exception for error with file reader
		catch(IOException e)    { 
			System.out.println("IO exception" + e);    
			}
	}

	//Add player method
	public void addPlayer(String name, double attackStat, double blockStat) {
		Player player1 = new Player(name, attackStat, blockStat);
		players.add(player1);
	}
	
	//count players in roster
	public int countPlayers() {
		int count = players.size();
		return count; 
	}
	
	//search for player by name
	public Player getPlayerByName(String str1) {
		Player found = null;
		for (Player players : players) {
			if (str1.equals(players.getName())) {
				found = players;
			}
		}
		return found;
	}
	
	//Top attackers method
	public void printTopAttackers() {
		//set place 1 and 2 for players
		Player top1 = new Player();
		Player top2 = new Player();
		//loop through array list and set top attack to top 1. If its found moves top1 to top2 before writing to top1
		for (int i = 0; i < players.size(); i++ ) {
			if (players.get(i).getAttackStat() > top1.getAttackStat()) {
				top2 = top1;
				top1 = players.get(i);
			}
			if (players.get(i).getAttackStat() < top1.getAttackStat() && players.get(i).getAttackStat() > top2.getAttackStat()) {
				top2 = players.get(i);
			}
		}
		//displays player info of top two spots. 
		top1.printPlayerInfo();
		top2.printPlayerInfo();
	}
	
	//Top blockers method uses same logic with block stat as attack stat.
	public void printTopBlockers() {
		Player top1 = new Player();
		Player top2 = new Player();
		for (int i = 0; i < players.size(); i++ ) {
			if (players.get(i).getBlockStat() > top1.getBlockStat()) {
				top2 = top1;
				top1 = players.get(i);
			}
			if (players.get(i).getBlockStat() < top1.getBlockStat() && players.get(i).getBlockStat() > top2.getBlockStat()) {
				top2 = players.get(i);
			}
		}
		top1.printPlayerInfo();
		top2.printPlayerInfo();
	}
	
	//list all players in formatted print out. 
	public void printAllPlayers() {
		for (int i = 0; i < players.size(); i++ ) {
			players.get(i).printPlayerInfo();
			}
	}
}