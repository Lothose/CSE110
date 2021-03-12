// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment07
// Author      : Brandon Billmeyer & 1220167299
// Description : Monster class to be used with Assignment07.java

//monster class
class Monster {
	//private varibales
	private String name;
	private int healthScore;
	private Weapon weapon;
	
	//overloaded constructor
	public Monster(String str1, int int1, Weapon wea1) {
		this.name = str1;
		this.healthScore = int1;
		this.weapon = wea1;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getHealthScore() {
		return healthScore;
	}
	public String getWeaponName() {
		String str1 = weapon.getName();
		return str1;
	}
	
	//monster attack method
	public int attack(Monster mon1) {
		//picks random number from 0 to weapon max damage
		double maxDamage = Math.random()*weapon.getMaxDamage();
		//converts random double to int
		int damage = (int)maxDamage;
		//subtracts attack damage from defending monster
		mon1.healthScore = mon1.healthScore-damage;
		//returns damage in int
		return damage;
	}
	
}
