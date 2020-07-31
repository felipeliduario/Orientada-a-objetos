
public class Pessoas{
		private String name;
		private Endereço endereço;
		private int cod;
		public Pessoas(String name,Endereço endereço,int cod) {
			this.name = name;
			this.endereço=endereço;
			this.cod=cod;;
		}
		public Pessoas() {
		}
		
		public Endereço getEndereço() {
			return endereço;
		}
		public void setEndereço(Endereço endereço) {
			this.endereço = endereço;
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