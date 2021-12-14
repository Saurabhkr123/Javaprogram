package myProject;


public class dynamicarray {
	

	

		public static void main(String[] args) {
			
			
			int[] age = {10,20,30,40,50};
			
			System.out.println("Accessing to the array elements...!");
			System.out.println("FirstElement: " +age[0]);
			System.out.println("SecondElement: "+age[1]);
			System.out.println("ThirdElement: " +age[2]);
			System.out.println("FourthElement: "+age[3]);
			System.out.println("FifthElement: " +age[4]);
			System.out.println("================");
			
			age[0]=12;
			age[1]=24;
			age[2]=36;
			age[3]=48;
			age[4]=60;
			System.out.println("New array created and the elements of them......");
			System.out.println("FirstElement: " +age[0]);
			System.out.println("SecondElement: "+age[1]);
			System.out.println("ThirdElement: " +age[2]);
			System.out.println("FourthElement: "+age[3]);
			System.out.println("FifthElement: " +age[4]);
			System.out.println("Arrays elements of all " + age);
			System.out.println("------Elements accessed through the loop----------");
			 
			for (int i=0; i<age.length; i++) {
				System.out.println(age[i]);
			}
		}
	}


