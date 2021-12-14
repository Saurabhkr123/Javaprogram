package myProject;

 class Employee_all {
 private int variable;
 public  Employee_all() {
	 this.variable= 10;
 }
 public Employee_all(int num) {
	 this.variable=num;
 }
 public int getValue() {
	 return variable;
 }
}
    class MultipleConstructors {
	 public static void main(String args[]) {
		 Employee_all obj=new Employee_all();
		 Employee_all Obj=new Employee_all(100);
		 System.out.println(obj.getValue());
		 System.out.println(Obj.getValue());
		 
		 
	 }
 }
