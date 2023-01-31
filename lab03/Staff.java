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
	} // name �� age�� set�ϴ� ������
	
	public Staff(String name, int age, String department, int workDays, int vacationDays) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.workDays = workDays;
		this.vacationDays = vacationDays;
		} // ��� �� ����Ǵ� ������
	
	public String getName() {
		return this.name;
	} //�̸� ��ȯ�ϴ� getter
	
	public void setCareer(String department, int workDays){
		this.department = department;
		this.workDays = workDays;
	} //department�� workdays �����ϴ� setter
	
	public boolean sameCareer(Staff staff) {
		if (this.department.equals(staff.department)&& this.workDays == staff.workDays) {
			return true;
		}
		else {
			return false;
		}
	} //������ Ŀ���� ���� ��ȯ
	
	public String toString() {
		return "Name: "+this.name+", "+
		"Age: "+this.age+", "+
		"Department: "+this.department+", "+
		"workDays: "+this.workDays+", "+
		"VacationDays: "+this.vacationDays ;
	} //string ���� ��ȯ
	
	public void vacation(int wantDays) {
		if (wantDays > this.vacationDays) {
			System.out.println(this.name + ", ���� �ް��� �� ����.");
		}
		
		else {
			this.vacationDays = this.vacationDays - wantDays;
			System.out.printf("%s, �ް� %d ���. ���� �ް� �ϼ�: %d\n", this.name, wantDays, this.vacationDays);
		}
	}
}
