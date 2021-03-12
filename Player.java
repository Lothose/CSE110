// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment08
// Author      : Brandon Billmeyer & 1220167299
// Description : Player class to be used with Assignment08.java

class Player {
	//Private variables
	private String name;
	private double attackStat;
	private double blockStat;
	
	//default constructor
	public Player() {
		this.name = null;
		this.attackStat = 0.0;
		this.blockStat = 0.0;
	}
	
	//overloaded constructor
	public Player(String aName, double anAttackStat, double aBlockStat) {
		this.name = aName;
		this.attackStat = anAttackStat;
		this.blockStat = aBlockStat;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public double getAttackStat() {
		return attackStat;
	}	
	public double getBlockStat() {
		return blockStat;
	}
	
	//setters
	public void setAttackStat(double dbl1) {
		this.attackStat = dbl1;
	}
	public void setBlockStat(double dbl1) {
		this.blockStat = dbl1;
	}
	
	//Formatted print for player info
	public void printPlayerInfo() {
		System.out.printf("%s (attack = %.2f, block = %.2f)%n", name, attackStat, blockStat);
	}
}