class NativeModifier
{
	static
	{
		System.loadLibrary("native Library");  // load native Library
	}
	public native void m1();      // Declare a native method
}
class child 
{
	public static void main(String...args)
	{
		NativeModifier n = new NativeModifier();    // Invoke a Native method
		n.m1();
	}
}

// native is the modifier applicable only for methods but not for variables and classes.