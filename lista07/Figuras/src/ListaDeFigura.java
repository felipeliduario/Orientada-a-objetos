import java.awt.*;
import java.util.ArrayList;

class ListaDeFigura<E extends Figura> {
	ArrayList<Figura> listFigura = new ArrayList<Figura>();
	
	public ListaDeFigura(int t) {
	}

	public void insere(Figura f) {
		
		listFigura.add(f);
		
	}
	public void remove() {
		if (!listFigura.isEmpty()  ) {
			listFigura.remove(listFigura.size());
		}	
	}

	public void desenha(Graphics g) {
		for (Figura A: listFigura)
			listFigura.get(A.getLado()).desenha(g);
	}
}
