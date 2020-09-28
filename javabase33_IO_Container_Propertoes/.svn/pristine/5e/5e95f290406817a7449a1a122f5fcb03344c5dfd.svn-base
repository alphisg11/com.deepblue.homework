package org.deepblue.javbase.conatiner.Homework;

public class Operation {

	public void userOP(User user) {

		String userName = user.getUserName();
		String userPassword = user.getUserPaswsword();

		System.out.println(userName);
		System.out.println(userPassword);
	}

	public User userOpGet() {
		User user = new User("admin1", "admin2", "admin3");
		return user;
	}

	public static void main(String[] args) {
		String userName = "admin";
		String userPassword = "123456";

		User user = new User();
		user.setUserName(userName);
		user.setUserPaswsword(userPassword);

		Operation op = new Operation();
		op.userOP(user);
		
		User u = op.userOpGet();
		System.out.println(u.getUserName());
		System.out.println(u.getUserPaswsword());
		System.out.println(u.getUserInformation());

	}

}
