package PractiseCode;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String str="core java seleniuma";
		String str1="core java seleniumA";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('a')); //1st occurrence
		
		System.out.println(str.indexOf('a', str.indexOf('a')+1));//2nd occurrence
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("kapil"));
		
		//comparison
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1)); //ignore uppercase
		//substring
		System.out.println("************");
		System.out.println(str.substring(0, 9));
		
		//trim
		String s="   kapil Rathore   ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ",""));
		
		//split
		
		String test="hello_world_test_selenium";
		String[] testval = test.split("_");
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		String s2="cares";
		System.out.println(s2.concat("kapil"));
		
		String x="hello";
		String y="world";
		int a=100;
		int b=200;
		System.out.println(x+y); //helloworld
		System.out.println(a+b); // 300
		
		System.out.println(x+y+a+b); //helloworld100200
		
		System.out.println(a+b+x+y); //300helloworld
		
		System.out.println(x+y+(a+b)); //helloworld300
		
		
	}

}
