package test;

public class OIV {
	
//	String studentname;
//	int age;
//	int fee;
//	String collegename;
//	
//	OIV (String name, int agee, int feez, String clgname){
//		
//		studentname=name;
//		age=agee;
//		fee=feez;
//		collegename=clgname;
//		
//		}
//	void display() {
//		System.out.println(studentname+" "+age+" "+fee+" "+collegename);
//	}
//	
//	public static void main(String[] args) {
//		OIV s=new OIV("sai",25,10000,"BVC college");
//		s.display();
//		OIV s2=new OIV("sri",26,20000,"BVC college");
//		s.display();
//		OIV s3=new OIV("raju",27,30000,"BVC college");
//		s.display();
//		OIV s4=new OIV("bobby",28,40000,"BVC college");
//		s.display();
//		OIV s5=new OIV("kiran",29,10000,"BVC college");
//		s.display();
	
	String  name;
	int  age ;
	int  fee;
	String  ITvidhya;
	
	OIV (String namee, int agee, int feez, String vidhya){
		
		name=namee;
		age=agee;
		fee=feez;
		ITvidhya=vidhya;
	}
	void display() {
		System.out.println(name+" "+age+" "+fee+" "+ITvidhya);
	}
	public static void main(String[] args) {
	OIV R=new OIV ("sai",20,5000,"IPD college");
	R.display();
	OIV R2=new OIV ("sree",25,57000,"IPD college");
	R2.display();

	OIV R3=new OIV ("sd",26,56000,"IPD college");
	R3.display();

	OIV R4=new OIV ("sf",27,54000,"IPD college");
	R4.display();

	OIV R5=new OIV ("sk",29,53000,"IPD college");
	R.display();

	OIV R6=new OIV ("so",23,52000,"IPD college");
	R.display();


	
	
	
	}

}
