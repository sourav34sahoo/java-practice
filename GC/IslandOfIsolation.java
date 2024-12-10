class IslandOfIsolation
{
	IslandOfIsolation i;
	public static void main(String...args) {
		IslandOfIsolation i1 = new IslandOfIsolation();
		IslandOfIsolation i2 = new IslandOfIsolation();
		IslandOfIsolation i3 = new IslandOfIsolation();
		i1.i=i2;
		i2.i=i3;
		i3.i=i1;
		i1=null;
		i2=null;
		i3=null;
	}
}