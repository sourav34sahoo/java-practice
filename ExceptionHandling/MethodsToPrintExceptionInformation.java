class MethodsToPrintExceptionInformation
{
	public static void main(String...args) {
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			// e.printStackTrace();   ArithmeticException: / by zero or ,Location also
			//Name of Exception , Description & Location 
			
			//System.out.println(e.toString());   ArithmeticException: / by zero
			//Name of Exception , Name of Exception , Description
			
			System.out.println(e.getMessage());  // / by zero
			// Name of Exception , Description
		}
	}
}