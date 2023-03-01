package com.springScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Member;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Member member = (Member) context.getBean("member");
		member.setMemberId(1);
		member.setMemberName("Hiren");
		member.setMemberEmail("hiren@gmail.com");
		member.setMemberLocation("Ahmedabad");
		System.out.println(member);

		Member member2 = (Member) context.getBean("member");
		System.out.println(member2);
	}
}
