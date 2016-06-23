package test;

public class Zerg {
	private int attack;
	private int defence;
	private int health;
	
	// 이러한 경우에 TestHanyang처럼 만들 수도 있지만 더 간단한 방법이 있다.
	// 여기를 우클릭 한 뒤  Source -> Generate Getters and Setters를 클릭한다.
	// 모두 선택하면 자동으로 get과 set이 선언된다.
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
