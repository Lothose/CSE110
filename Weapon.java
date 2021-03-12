// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment07
// Author      : Brandon Billmeyer & 1220167299
// Description : Weapon class to be used with Assignment07.java

//Weapon class
class Weapon {
	//private strings
	private String name;
	private int maxDamage;
	
	//constructor with no variable input
	public Weapon() {
		this.name = "Pointy Stick";
		this.maxDamage = 1;
	}
	
	//overloaded constructor
	public Weapon(String name, int damage) {
		this.name = name;
		this.maxDamage = damage;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getMaxDamage() {
		return maxDamage;
	}
	
	//setters
	public void setName(String str1) {
		this.name = str1;
	}
	public void setMaxDamage(int int1) {
		this.maxDamage = int1;
	}
}
