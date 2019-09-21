package com.hampcode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hampcode.business.IMedicalExamBusiness;
import com.hampcode.model.entity.MedicalExam;

@Named
@ViewScoped
public class MedicalConsultationController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMedicalExamBusiness medicalExamBusiness;
	
	private List<MedicalExam> medicalExams;
	
	@PostConstruct
	public void init() {
		medicalExams = new ArrayList<MedicalExam>();
		getAllExams();
	}
	
	public void getAllExams() {
		try {
			medicalExams = medicalExamBusiness.getAll();
		}catch(Exception e) {
			
		}
	}
	
	public List<MedicalExam> getMedicalExams() {
		return medicalExams;
	}

	public void setMedicalExams(List<MedicalExam> medicalExams) {
		this.medicalExams = medicalExams;
	}

}
