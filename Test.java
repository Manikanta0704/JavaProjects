import java.util.Scanner;

/*public class Test{
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if (i%j==0) {
					count=count +1;
				}
			}
			if(count==2) {
				System.out.println(i+ " is a prime number");
			}
			else {
		 		System.out.println(i+ " is not a prime number");
			}
		}
	}
}*/


/*public class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if (i%j==0) {
					count=count +1;
				}
			}
			if(count==2) {
				System.out.println("Enter number is a prime number");
			}
			else {
		 		System.out.println("Enter number is not a prime number");
			}
		}
	}
}*/
/*
public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		char ch=sc.next().charAt(0);
		char ch = 'z';

		if (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}*/

/*
public class Test{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(i+" is a prime number");
		}
		else{
			System.out.println(i+" is not a prime number");
			}
		}
	}
}*/

/*public class Test{
	public static void main(String [] args) {
		int i=12;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(--i);
	}
}*/

/*class A {
	static int i = 10;
	int j = 20;

	static void m1() {
		
		System.out.println("m1-A");
		System.out.println(i);
		//System.out.println(j);--> Error
		A a = new A();
		System.out.println(a.j);
	}

	void m2() {
		System.out.println("m2-A");
		System.out.println(i);
		System.out.println(j);
		
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		//A.m1();
		a.m2();
	}
}*/

/*class A{
	 
	void m1(){
		System.out.println("m1-A");
		int a=10;
		//static int b=20;
	}
	static void m2() {
		System.out.println("m2-A");
		int c=30;
		//static int d=40;
	}
}


public class Test{
	public static void main(String [] args) {
		int e=40;
		//static int f=15;
		A a=new A();
		a.m1();
		a.m2();
		
	}
}*/


/*public class Test{
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}*/


/*class Test{
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/

/*class Test{
	public static void main(String[] args) {
		for(int num=0;num<5;num++) {
			for(int j=0;j<10;j++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}*/

/*public class Test{
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//System.out.print((char)(65+j)+" "); ---------->  a b c d e f
				//System.out.print((char)(65+i)+" "); ---------->  a a a a a a
			}
			System.out.println();
		}
	}
}*/

/*class Test{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/

// SATYAMURTHY NUMBER OR STRONG NUMBER
/*public class Test {
	public static void main(String[] args) {
		//System.out.println("Eneter :");
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter :");
		int n = sc.nextInt();
		int t = n;
		int sum = 0;

		while (t > 0) {
			int d = t % 10;
			int f = 1;

			for (int i = d; i > 0; i--) {
				f = f * i;
			}
			sum = sum + f;
			t = t % 10;
		}
		if(sum==n)
			System.out.println(n+"k.n");
		else
			System.out.println(n+ "n.k.n");
	}
}*/
/*
 * 
 * FACTORS OF A NUMBER
public class Test{
	public static void main(String[] args) {
		
		System.out.println("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++){
			if(n%i==0) {
				System.out.println(i+" ");
			}		
		}
	}
}*/

//SUM OF NUMBERS



/*class Test{
	public static void main(String[] args) {
		int n;
		int r,sum=0;
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits "+sum);
	}
}*/

//ARMSTRONG NUMBER
/*public class Test{
	public static void main(String[] args) {
		
		int n,r,sum=0,c;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		
		
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(c==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}
}*/

//PERFECT NUMBER

/*class Test{
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
			sum=sum+i;
		}}
		if(sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}
}*/

//PALINDROME NUMBER

/*class Test{
	public static void main(String[] args) {
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		int n,r,s=0,c;
		n=sc.nextInt();
		c=n;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;		
		}
		if(c==s) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not Palindrome number");
		}
	}
}*/

/*public class Test{
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
	}
}*/

/*public class Test{
	public static void main(String[] args) {
		int k,n,n1;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		n1=n+1;
		int count=0;
		
		for(int i=1;i<=n1;i++) {
			if(i*i==n1){
				count =count+1;
			}
		}
		if(count==1) {
			System.out.println("Sunny Number");
		}
		else {
			System.out.println("Not Sunny Number");
		}
	}
}*/


/*public class Test{
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print((char)(68-i)+" ");
			}
			System.out.println();
		}
	}
}
*/

/*public class Test{
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/

/*public class Test{
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(5-i+" ");
			}
			System.out.println();
		}
	}
}
*/
/*public class Test {
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				count=count+1;
				System.out.print(count+ " ");
			}
			System.out.println();
		}
	}
}*/
/*class Test{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 9-i; j++){
				System.out.print(" "+" ");
			}
			for(int k = 0; k <= i; k++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/

/*
public class Test{
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}*/

/*public class Test{
	public static void main(String args[]) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/
/*

class Account{
	String accNo;
	String accHolderName;
	String accType;
	int balance;
	
	public Account() {
		accNo = "abc123";
		accHolderName = "Durga";
		accType = "Savings";
		balance = 25000;
	}
	public void getAccountDetails() {
		System.out.println("Account Details");
		System.out.println("---------------------");
		System.out.println("Account Number : "+accNo);
		System.out.println("Account Holder Name : "+accHolderName);
		System.out.println("Account Type : "+accType);
		System.out.println("Account Balance : "+balance);
		
	}
	
}
public class Test {
	public static void main(String[] args) {
		Account account = new Account();
		//account.setAccountDetails();
		account.getAccountDetails();		
	}
}*/

/*public class Test{
	public static void main(String [] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2&&j==2) {
					System.out.print(0+" ");
				}
				else {
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}
}*/

/*class Employee{
	int empId;
	String empName;
	int empAge;
	int empSalary;

	public Employee(){
	empId=111;
	empName="Mani";
	empAge=22;
	empSalary=50000;
	
}
	public void getempDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Id       :"+empId);
		System.out.println("Name     :"+empName);
		System.out.println("Age      :"+empAge);
		System.out.println("Salary   :"+empSalary);
		
	}

}
public class Test{
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.getempDetails();
		System.out.println();
		
		Employee emp2=new Employee();
		emp2.getempDetails();
		System.out.println();
		
		Employee emp3=new Employee();
		emp3.getempDetails();
	}
}*/


/*class Employee{
	int empId;
	String empName;
	int empAge;
	
	public Employee(int ID,String NAME,int AGE ) {
		empId=ID;
		empName=NAME;
		empAge=AGE;
	}
	
	public void getempDetails() {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("--------------------");
		System.out.println("ID    :"+empId);
		System.out.println("NAME  :"+empName);
		System.out.println("AGE   :"+empAge);
	}
}
public class Test{
	Employee compareAge(Employee e) {
		if(this.empAge>e.empAge)
			return this;
		else
			return e;
	}
	public static void main(String[] args) {
		Employee emp1=new Employee(111,"MANI",21);
		emp1.getempDetails();
		System.out.println();
		
		Employee emp2=new Employee(222,"PAVAN",22);
		emp2.getempDetails();
		System.out.println();
		
		Employee emp3=new Employee(333,"SRINU",23);
		emp3.getempDetails();
	}
}
*/


/*class Employee{
	int empId;
	String empName;
	int empAge;
	
	Employee(int ID,String NAME,int AGE ){
		this.empId=ID;
		this.empName= NAME;
		this.empAge=AGE;
		
	}
	
	Employee(){
		
	}
	
	public void getAccountDetails() {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("-----------------");
		System.out.println("ID                :"+empId);
		System.out.println("EMPLOYEE NAME     :"+empName);
		System.out.println("EMPLOYEE AGE      :"+empAge);
	}
}	
class Test{
	public static void main(String [] args) {
		Employee emp1=new Employee(111,"MANI",22);
		//emp1.getAccountDetails();
		//System.out.println();
		
		
		Employee emp2=new Employee();
		emp2 = emp1;
		//emp2.getAcoountDetails();
		System.out.println(emp2);
		
		//Employee emp2=new Employee();
	}
}*/

/*class A{
	private class B{
		private int i=20;
		private int j=30;
		
		public void main(String[] args) {
			System.out.println(i);
			System.out.println(j);
			
		}
	}
}*/

/*
class Employee{
	int empId=111;
	String empName="Mani";
	int empAge=22;
	float empSalary=90000f;
	
	public String toString() {
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("-----------------");
		System.out.println("EMPLOYEE ID     :"+empId);
		System.out.println("EMPLOYEE NAME   :"+empName);
		System.out.println("EMPLOYEE AGE    :"+empAge);
		System.out.println("EMPLOYEE SALARY :"+empSalary);
		return"";
	}
	
}
class Student{
	int stdId=222;
	String stdName="Swamy";
	int stdAge=19;
	
	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS");
		System.out.println("----------------");
		System.out.println("STUDENT ID   :"+stdId);
		System.out.println("STUDENT NAME :"+stdName);
		System.out.println("STUDENT AGE  :"+stdAge);
	}
}
class Test{
	public static void main(String [] args) {
		Employee emp=new Employee();
		System.out.println(emp);;
		System.out.println();
		Student std=new Student();
		std.getStudentDetails();
	}
}*/

/*class Test{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("*");
			
			}
			System.out.println();
		}
	}
}
*/
/*class A{
	int a=5;
	void m1() {
		int i=10;
		System.out.println("m1 method");
	}
}
class B extends A{
	void m2(){
		System.out.println("m2 method");
	}
}
class C extends B{
	void m3(){
		System.out.println("m3 method");
	}
}
class Test{
	public static void main(String [] args) {
		A a=new A();
		a.m1();
		//a.m2();
		//a.m3();
		System.out.println();
		
		B b =new B();
		b.m1();
		b.m2();
		//b.m3();
		System.out.println();
		
		C c =new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println();
	}
}*/
/*
class Test {
	static int i = 20;

	int j = 30;

	Test() {

	}

	Test(int i) {

		this.i = i;

	}

	Test(int i, int j) {
		this(i);
		this.j = j;
	}

	void show() {
		System.out.println(" aoijgoi");
		int i = 90;
		System.out.println(i);
	}

	public static void main(String ar[]) {
		Test obj1 = new Test();
		// obj1.show();
		System.out.println(obj1.i);
		Test obj2 = new Test(45);
		System.out.println(obj2.i);
		Test obj3 = new Test(100, 200);
		System.out.println(obj3.i);

		//System.out.println("after reassigning");
		System.out.println(obj1.i);

	}
}
*/
/*
class Test{
	public static void main(String [] args) {
		
		int marks[]=new int[3];
		
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}
	}
}
*/

/*class Test{
	public static void main(String[] args) {
		int marks[]= {10,20,30};
		
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}
	}
}*/
/*
class Test{
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int marks[]=new int[size];
		
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(marks[i]);
		}
	}
}*/
/*
class A {
	int i = 10;
	int j = 20;
	void m1() {
		System.out.println("mani");
		this.m2();
		
	}
	static void m2() {
		System.out.println("Swamy");
	}
	
	A(){
		
	}
	A(int i){
		System.out.println(i);
		System.out.println(this.i);
		this.i=i;
		System.out.println(this.i);
		
	}

	A(int i, int j) {
		System.out.println(i+"  "+j);
		System.out.println(this.i+"   "+this.j);
	}
}
class B{
	void m3() {
		System.out.println("pavan");
	}
	void m4() {
		System.out.println("Srinu");
	}
}

class Test {
	public static void main(String[] args) {
		A a1=new A(100);
		A a2=new A(50,60);
		a1.m1();
		a2.m2();
		B b=new B();
		b.m3();
		b.m4();
	}
}*/


/*
class Test{
	public static void main(String [] args) {
		for(int i=0;i<=5;i++) {
			for (int num=1;num<=i;num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
*/
/*class Test{
	public static void main(String [] args) {
		//int count=0;
		for(int i=1;i<=5;i++) {
			for (int num=1;num<=i;num++) {
				System.out.print("* ");
				//count =count +1;
			}
			System.out.println();
		}
	}
}*/


// class Test{
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your Name :" );
//		System.out.println("Enter Your Age :" );
//		String name = sc.nextLine();
//		int age = sc.nextInt();
//		
//		
//		System.out.println("My name is : "+name);
//		System.out.println(" My Age is : "+age);
//	}
//}

class A {
	
	public static void main(String[] args) {
		
		String str = "Manikanta";
		int count =0;
		
		for(int i=0;i<str.length()-1;i++) {
		char ch = str.charAt(i);
		System.out.println(ch);
}

	}}





















