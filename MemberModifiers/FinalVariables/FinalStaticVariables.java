class FinalStaticVariables
{
	static int x;
}

/*For the normsl sttic variables it is not required to perform initialization
explicitlly, JVM will always provide default values.*/

class FinalStaticVariables
{
	final static int x;
}

/* But for the final static variables we should perform initialization 
explicitly otherwise we will get C.E .*/ 