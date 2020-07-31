
	import java.util.Calendar;
	public class Date {
		
		Calendar cal = Calendar.getInstance();
		private int day;
		private int mounth;
		private int year;

		
		public Date(int day, int mounth, int year) {
			this.day = day;
			this.mounth = mounth;
			this.year = year;
		}
		public Date() {
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.mounth = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
		}
		
		public int getDay() {
			return day;
		}
		public int getMounth() {
			return mounth;
		}
		public int getYear() {
			return year;
		}

		public void adicionaDias(int day) {
			cal.add(Calendar.DATE, day);
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.mounth = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
			
		}
		
		public void proximoDia(int day) {
			cal.add(Calendar.DATE, day);
			this.day = cal.get(Calendar.DAY_OF_MONTH);
			this.mounth = cal.get(Calendar.MONTH);
			this.year = cal.get(Calendar.YEAR); 
			
		}
		public void imprimiData () {
			System.out.println("dia:" + this.day+ " mes:" +this.mounth +" ano: "+ this.year );
		}
		
		public int diasNoMes() {
			return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		}
		
		public boolean eAnoBixesto(int year) {
			if (year % 400 == 0 ) {
				return true;
			}
			
			if ( year % 4 == 0  && year % 100 != 0 ){
				return true;
			}
			
			else return false;
		}	
}
