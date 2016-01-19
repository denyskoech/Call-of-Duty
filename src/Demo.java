
public class Demo { 
public static void main (String[]args){
	
	Soldier ghost=new Soldier (30,6000);
	System.out.println(ghost.takeDamage(500));

	SuperSoldier MJ=new SuperSoldier (40,7000);
	System.out.println(MJ.takeDamage(2500,6500));

}
}