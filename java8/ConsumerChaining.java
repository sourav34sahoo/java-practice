import java.util.function.*;
class Movie
{
	String name;
	Movie(String name) {
		this.name=name;
	}
}
class ConsumerChaining
{
	public static void main(String...args){
		Consumer<Movie> c1= m->System.out.println(m.name+" :ready to release");
		Consumer<Movie> c2= m->System.out.println(m.name+" :realesed but its bigger flop");
		Consumer<Movie> c3= m->System.out.println(m.name+" :storing information in database");
		Consumer<Movie> cc= c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("spider");
		cc.accept(m);
	}
}
/*
spider :ready to release
spider :realesed but its bigger flop
spider :storing information in database
*/