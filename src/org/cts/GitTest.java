package org.cts;



public class GitTest {
	public void greenOmr(String name) 
	{
		System.out.println("Name is:" + name);
	}
	public void greenOmr(int Phonenum , byte id) 
	{
		System.out.println("Phonenu & Id is:" + Phonenum + " " + id); 
	}
	public void greenOmr(float fsalary, Integer batch, float timeshedule) 
	{
		System.out.println("Omr details;" + fsalary + " " + batch + " " + timeshedule);
	}
	public void greenOmr(String course, long fees, String candidate, short faculty) 
	{ 
		System.out.println("Details:" + course + " " + fees + " " + candidate + " " + faculty );
	}
	
	public static void main(String[] args) 
	{
		GitTest gt = new GitTest();
		gt.greenOmr("Greens Technology");
		gt.greenOmr(78657,(byte) 55);
		gt.greenOmr(50000f, 12, 12f);
		gt.greenOmr("java", 20000, "Experience", (short) 23);
	}

}
