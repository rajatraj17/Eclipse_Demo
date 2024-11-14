
public class world {
	public int id;
	public String name;
	public String designation;
	
	public void printemployeedetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(designation);
	}
	
	public static void main(String []args)
    {
        world world1 = new world ();
        world1.id =10;
        world1.name = "John";
        world1.designation = "manager";
        world1.printemployeedetails();
        
        world world2 = new world ();
        world2.id =15;
        world2.name = "Jary";
        world2.designation = "HR";
        world2.printemployeedetails();
        
        world world3 = new world ();
        world3.id =18;
        world3.name = "Jame";
        world3.designation = "Analyst";
        world3.printemployeedetails();
    }
};
