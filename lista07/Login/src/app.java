import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class app{
	 public static void main(String[] args) {
	    Map<String, User> mapa = new TreeMap<String, User>();
	 
	    User a = new User("Jo�o", "Linux");
	    User b = new User("Antonio", "123456");
	    User c = new User("L�cia", "Internet");
	    User d = new User("Benedito", "felipe");
	    User e = new User();
	    e.addUser("Usuario", "senha");
	    mapa.put("Jo�o", a);
	    mapa.put("Antonio", b);
	    mapa.put("L�cia", c);
	    mapa.put("Benedito", d);
	    mapa.put("Usuario", e);
	    System.out.println(mapa);
	    System.out.println(mapa.get("L�cia"));
	    e.showUser(e);
	    Collection<User> Users = mapa.values();
	    for (User f : Users) {
	      System.out.println(f);
	    }
	  }
	}

