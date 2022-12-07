public class TimeType {


	public int hours;
	public int min;
	public int sec;
	
	public TimeType() {
	}
	
	public TimeType(int hours, int min, int sec) {
		this.hours = hours;
		this.min = min;
		this.sec = sec;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSeconds(int seconds) {
		this.sec = seconds;
	}
	
	public void increment() {
		
		if(this.sec >= 60) {
			this.sec = 0;
			this.min += 1;
		}
		if(this.min >= 60) {
			this.min = 0;
			this.hours += 1;
		}
		if(this.hours >= 12) {
			this.hours = 1;
		}
			else {
				this.hours += 1;
			}
		}
		boolean lessThan(TimeType other) {
			if(this.hours < other.hours) {
				return true;
			}
			else {
				return false;
				
			}
		}
		public static void main(String[] args) {
			TimeType clock = new TimeType(10,45,20);
			System.out.println(clock.getHours() + ':' + clock.getMin() + ':' + clock.getSec());
	}
}
