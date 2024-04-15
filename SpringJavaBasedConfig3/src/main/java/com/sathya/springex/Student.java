package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
		//3.Top of the field Create @Autowired
		@Autowired
		private EmailService emailService;
		@Autowired
		private JavaCourseService javaCourseService;
		
		//1.Top of the constructor Create @Autowired
		/*@Autowired
		public Student(EmailService emailService, JavaCourseService javaCourseService) {
			super();
			this.emailService = emailService;
			this.javaCourseService = javaCourseService;
		}*/
		
		//2.Top the Setters @Autowired annotation
		/*public EmailService getEmailService() {
			return emailService;
		}
		@Autowired
		public void setEmailService(EmailService emailService) {
			this.emailService = emailService;
		}
		public JavaCourseService getJavaCourseService() {
			return javaCourseService;
		}
		@Autowired
		public void setJavaCourseService(JavaCourseService javaCourseService) {
			this.javaCourseService = javaCourseService;
		}*/
		
		public void details() {
			emailService.message();
			javaCourseService.courseInfo();
		}

}