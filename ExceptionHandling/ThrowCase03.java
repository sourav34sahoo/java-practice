class ThrowCase03
{
	public static void main(String...args) {
		throw new Test();
	}
}
/* 
ThrowCase03.java:4: error: cannot find symbol
                throw new Test();
                          ^
  symbol:   class Test
  location: class ThrowCase03
  
  we can use throw keyword only for Throwable type otherwise we will get
   compiletime error saying Incompatiable types.
 */