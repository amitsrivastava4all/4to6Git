package com.srivastava;

import com.srivastava.dto.QuestionDTO;

public class QuestionDAO {
	
	public QuestionDTO[] getAllQuestions(){
		QuestionDTO[] questionArray= new QuestionDTO[3];
		QuestionDTO obj = new QuestionDTO();
		obj.setQno(1);
		obj.setName("Q1. JVM Stands For");
		obj.setAns1("a) Java Virtual Machine");
		obj.setAns2("b) Java Vital Machine");
		obj.setAns3("c) Java Virtual Model");
		obj.setAns4("d) None of These");
		obj.setRans("a");
		questionArray[0]= obj;
		
		obj = new QuestionDTO();
		obj.setQno(2);
		obj.setName("Q2. JVM Stands For");
		obj.setAns1("a) Java Virtual Machine");
		obj.setAns2("b) Java Vital Machine");
		obj.setAns3("c) Java Virtual Model");
		obj.setAns4("d) None of These");
		obj.setRans("a");
		questionArray[1]= obj;
		
		obj = new QuestionDTO();
		obj.setQno(3);
		obj.setName("Q3. JVM Stands For");
		obj.setAns1("a) Java Virtual Machine");
		obj.setAns2("b) Java Vital Machine");
		obj.setAns3("c) Java Virtual Model");
		obj.setAns4("d) None of These");
		obj.setRans("a");
		questionArray[2]= obj;
		
		return questionArray;
	}

}
