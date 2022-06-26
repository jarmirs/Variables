
class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}
	void retirement() {
		int yearsLeft =65-age;
		System.out.println(yearsLeft);}
/*		change retirement() method to be able to get a return from it will have to do the following:
 * change void to type (ex int) say method returns type integer 
 * at bottom of the method use keyword return + variable
 * 
 */
		int retireCalculation(){
			int calculation= 65 - age;
			return calculation;
		}
//		Get methods : method to return age & name values in main method see below
		int getAge() {
			return age;
		}
		String getName() {
			return name;
		}
	}


public class Variables {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Jorge Sparks";
		person1.age = 27;

		person1.speak();
		person1.retirement();
//		set equal to return value of method // will results will be return calculation
		int retireAge=person1.retireCalculation();
		System.out.println(retireAge + " Years til retirement ");
//  call get methods to get return values 		
		int age =person1.getAge();
		String name=person1.getName();
//		use System.out function to print those values acquired with the get methods	
		System.out.println(" my name is " + name + " & I'm " + age + " years old. ");
		
	}
}
