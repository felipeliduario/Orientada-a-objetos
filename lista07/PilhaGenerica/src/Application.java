
public class Application {
	
	public static void main(String[] args) {
		Date at =  new Date();
		Date da =  new Date(16,8,2000);
		Date d =  new Date(10,8,2000);
		Date de =  new Date(19,8,2000);
		Date di =  new Date(18,8,2000);
		Date dok =  new Date(17,8,2000);
		Stack<Date> Stack= new Stack<Date>();
		try {
			Stack.push(da);
			Stack.push(at);
			Stack.push(d);
			Stack.push(de);
			Stack.push(dok);
			Stack.push(di);
		} catch (FullStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		Stack.pop();
		Stack.pop();
		Stack.pop();
	} catch (EmptyStackException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
