
	import java.util.Calendar;
	public class Date {
		
	    Calendar cal = Calendar.getInstance();
		private int day;
		private int month;
		private int year;

		public Date() {
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.month = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
		}
		public Date(int day,int month,int year) {
			this.day = day;
			this.month = month;
			this.year = year; 
		}
		
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
		public int getYear() {
			return year;
		}

		public void adicionaDias(int day) {
			cal.add(Calendar.DATE, day);
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.month = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
			
		}
		
		public void proximoDia(int day) {
			cal.add(Calendar.DATE, day);
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.month = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
			
		}
		public void imprimiData () {
			System.out.println("dia:" + this.day+ " mes:" +this.month +" ano: "+ this.year );
		}
		
		public int diasNoMes() {
			return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		
		public boolean eAnoBixesto() {
			if (year % 400 == 0 ) {
				return true;
			}
			
			if ( year % 4 == 0  && year % 100 != 0 ){
				return true;
			}
			
			else return false;
		}	

	public String porExtenso () {
		String data = null;
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int year = cal.get(Calendar.YEAR);
		String mes=null;
		 if (month==1)
			 mes = "Janeiro";
		 else if (month==2)
			 mes = "Fevereiro";
		 else if (month==3)
			 mes = "Março";
		 else if (month==4)
			 mes = "Abril";
		 else if (month==5)
			 mes = "Maio";
		 else if (month==6)
			 mes = "Junho";
		 else if (month==7)
			 mes = "Julho";
		 else if (month==8)
			 mes = "Agosto";
		 else if (month==9)
			 mes = "Setembro";
		 else if (month==10)
			 mes = "Outubro";
		 else if (month==11)
			 mes = "Novembro";
		 else if (month==12)
			 mes = "Dezembro";
		Integer.toString(day);
		Integer.toString(year);
		data= day+" de "+mes+" de "+year;
		return data;
	}
}
