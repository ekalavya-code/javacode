package myclasses;

public class StudentData {
	
	private String studentName;
	private int rollNo;
	private int semester;
	private String branch;
	private float markinPercentage;
	private long contactNo;
	
	public StudentData(String studentName,int rollNo,int semester,String branch,float markinPercentage,long contactNo)
	{
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.semester = semester;
		this.branch = branch;
		this.markinPercentage = markinPercentage;
		this.contactNo = contactNo;
	}
	public StudentData(int rollNo, long contactNo)
	{
		this.rollNo = rollNo;
		this.contactNo = contactNo;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public int getSemester()
	{
		return semester;
	}
	public String getBranch()
	{
		return branch;
	}
	public float getMarkinPercentage()
	{
		return markinPercentage;
	}
	public long getContactNo()
	{
		return contactNo;
	}
	public void display(StudentData testobj)
	{
		System.out.println("The Name of Student name is:" + testobj.getStudentName());
		System.out.println("The Name of Student rollNo is:" + testobj.getRollNo());
		System.out.println("The Name of Student semester is:" + testobj.getSemester());
		System.out.println("The Name of Student branch is:" + testobj.getBranch());
		System.out.println("The Name of Student mark in percentage is:" + testobj.getMarkinPercentage());
		System.out.println("The Name of Student contact no is:" + testobj.getContactNo());
	}
	
	public void gradeComputation(float markInPercentage)
	{
		if(markInPercentage<=30)
			System.out.println("F Grade");
		if(markInPercentage<=40 && markInPercentage>=31)
			System.out.println("D Grade");
		if(markInPercentage<=50 && markInPercentage>=41)
			System.out.println("C Grade");
		if(markInPercentage<=70 && markInPercentage>=51)
			System.out.println("B Grade");
		if(markInPercentage>70)
			System.out.println("A Grade");
	}
	
	public static void main(String args[])
	{
		StudentData test = new StudentData("Vivek", 123, 3, "EEE", 70, 8754536346l);
		test.display(test);
		test.gradeComputation(test.getMarkinPercentage());
	}
}
