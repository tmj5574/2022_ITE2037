package Lab03;

public class Staff {
	private String name;
	private int age;
	private String department;
	private int workDays;
	private int vacationDays;
	
	public Staff(String name, int age) {
		this.name = name;
		this.age = age;
		this.department = "None";
		this.workDays = 0;
		this.vacationDays = 20;
	} // name 과 age만 set하는 생성자
	
	public Staff(String name, int age, String department, int workDays, int vacationDays) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.workDays = workDays;
		this.vacationDays = vacationDays;
		} // 모든 게 변경되는 생성자
	
	public String getName() {
		return this.name;
	} //이름 반환하는 getter
	
	public void setCareer(String department, int workDays){
		this.department = department;
		this.workDays = workDays;
	} //department랑 workdays 변경하는 setter
	
	public boolean sameCareer(Staff staff) {
		if (this.department.equals(staff.department)&& this.workDays == staff.workDays) {
			return true;
		}
		else {
			return false;
		}
	} //동일한 커리어 여부 반환
	
	public String toString() {
		return "Name: "+this.name+", "+
		"Age: "+this.age+", "+
		"Department: "+this.department+", "+
		"workDays: "+this.workDays+", "+
		"VacationDays: "+this.vacationDays ;
	} //string 으로 변환
	
	public void vacation(int wantDays) {
		if (wantDays > this.vacationDays) {
			System.out.println(this.name + ", 남은 휴가일 수 부족.");
		}
		
		else {
			this.vacationDays = this.vacationDays - wantDays;
			System.out.printf("%s, 휴가 %d 사용. 남은 휴가 일수: %d\n", this.name, wantDays, this.vacationDays);
		}
	}
}
