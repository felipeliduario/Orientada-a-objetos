
public class Pessoas extends Endereço {
		private String name;
		public Pessoas(String name) {
			this.name = name;
		}
		public Pessoas() {
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
	}