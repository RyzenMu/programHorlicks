

//package helloWorld;

public class forName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName(pqr);
	}

}


class pqr

{
	static
	{
		System.out.println("in static");
	}
	
	{
		System.out.println("in instance of");
	}
}
