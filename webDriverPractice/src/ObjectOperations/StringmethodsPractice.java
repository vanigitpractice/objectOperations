package ObjectOperations;

public class StringmethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vani";
		String a="my java@ practice@on my laptop";
		String[] b=a.split("@");
		System.out.println(b.length);
		for(int i=0; i<b.length; i++)
		{
			System.out.println(i+b[i]);
		}
		String c="    my testing practice ";
		//trim
		 System.out.println(c.trim());
        //uppercase
		 System.out.println(c.toUpperCase());
		 //replace
		 System.out.println(c.replace("testing","java"));
	}

}
