
public class Pessoas{
		private String name;
		private Endere�o endere�o;
		private int cod;
		public Pessoas(String name,Endere�o endere�o,int cod) {
			this.name = name;
			this.endere�o=endere�o;
			this.cod=cod;;
		}
		public Pessoas() {
		}
		
		public Endere�o getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(Endere�o endere�o) {
			this.endere�o = endere�o;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void imprimePessoa() {
			System.out.println(this.name);
		}
		public int getCod() {
			return cod;
		}
		public void setCod(int cod) {
			this.cod = cod;
		}
	}