package web;

public class SampleBeanMain {

	public static void main(String[] args) {
		SampleBean salary =new SampleBean();
		int money = 100000000;

		salary.setSalary(money);

		System.out.println(salary.getSalary()+"円");
	}

}
