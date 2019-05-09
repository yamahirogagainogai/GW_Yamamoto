package web;

public class EmpBean {

	private String name = null;
	private int age = 0;

	//setAgeで受取った値をreturnで返す
	public int getAge() {
		return age;
	}

	//カプセル化したnameに引数の値がが入ったnameの値を代入
	public void setAge(int age) {
		this.age = age;
	}

	//setNameで受取った値をreturnで返す
	public String getName() {
		return name;
	}

	//カプセル化したnameに引数の値が入ったnameの値を代入する
	public void setName(String name) {
		this.name = name;
	}
}
