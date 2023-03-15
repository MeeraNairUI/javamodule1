package source.use.mod;
import source.mod.HelloWorld;
public class UseHelloWorld {

	public static void main(String []args) {
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
