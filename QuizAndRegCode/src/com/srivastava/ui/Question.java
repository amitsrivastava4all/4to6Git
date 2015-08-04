package com.srivastava.ui;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import com.srivastava.QuestionDAO;
import com.srivastava.dto.QuestionDTO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question extends JFrame {
	int currentIndex = 0;
	JLabel questionLabel = new JLabel();
	JRadioButton rd1 = new JRadioButton("");
	JRadioButton rd2 = new JRadioButton("");
	JRadioButton rd3 = new JRadioButton("");
	JRadioButton rd4 = new JRadioButton("");
	ButtonGroup bg = new ButtonGroup();
	private final JButton btnPrev = new JButton("Prev");
	private final JButton btnNext = new JButton("Next");
	QuestionDTO array[];
	public static void main(String[] args) {
		
					Question frame = new Question();
					frame.setVisible(true);
				
	}
	
	private void dispQuestion(int index){
		QuestionDAO questionDAO = new QuestionDAO();
		 array = questionDAO.getAllQuestions();
		QuestionDTO questionDTO = array[index];
		//QuestionDTO questionDTO = questionDAO.getAllQuestions()[index];
		questionLabel.setText(questionDTO.getName());
		rd1.setText(questionDTO.getAns1());
		rd2.setText(questionDTO.getAns2());
		rd3.setText(questionDTO.getAns3());
		rd4.setText(questionDTO.getAns4());
		
		
	}

	/**
	 * Create the frame.
	 */
	public Question() {
		dispQuestion(currentIndex);
		bg.add(rd1);
		bg.add(rd2);
		bg.add(rd3);
		bg.add(rd4);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		getContentPane().setLayout(null);
		
		
		questionLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		questionLabel.setBounds(39, 34, 385, 23);
		getContentPane().add(questionLabel);
		
		
		rd1.setBounds(39, 104, 211, 23);
		getContentPane().add(rd1);
		
		
		rd2.setBounds(39, 158, 145, 23);
		getContentPane().add(rd2);
		
		
		rd3.setBounds(39, 219, 145, 23);
		getContentPane().add(rd3);
		
		
		rd4.setBounds(50, 272, 145, 23);
		getContentPane().add(rd4);
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prev();
			}
		});
		btnPrev.setBounds(246, 272, 89, 23);
		
		getContentPane().add(btnPrev);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				next();
			}
		});
		btnNext.setBounds(359, 272, 89, 23);
		
		getContentPane().add(btnNext);
	}
	private void prev(){
		
		if(currentIndex>0){
			currentIndex--;
			dispQuestion(currentIndex);
		}
	}
	
	private void next(){
		if(currentIndex<array.length-1){
			currentIndex++;
			dispQuestion(currentIndex);
		}
	}

}
