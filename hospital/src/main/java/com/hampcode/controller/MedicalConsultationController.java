package com.hampcode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hampcode.business.IMedicalExamBusiness;
import com.hampcode.model.entity.MedicalConsultation;
import com.hampcode.model.entity.MedicalConsultationItem;
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
	
	//consulta medica
	private MedicalConsultation medicalConsultation;
	
	//lista medica de items
	private MedicalConsultationItem medicalConsultationItem;	
	private List<MedicalConsultationItem> medicalConsultationItems;
	
	//lista medica de dexamenes
	private MedicalExam medicalExam;
	private List<MedicalExam> medicalExams;
	private List<MedicalExam> medicalExamItems;
	
	@PostConstruct
	public void init() {
		
		medicalConsultation = new MedicalConsultation();
		medicalConsultationItem = new MedicalConsultationItem();
		medicalExam = new MedicalExam();
		
		medicalExams = new ArrayList<MedicalExam>();
		medicalExamItems=new ArrayList<MedicalExam>();
		
		getAllExams();
	}
	
	public void getAllExams() {
		try {
			medicalExams = medicalExamBusiness.getAll();
		}catch(Exception e) {
			
		}
	}
	

	public void saveMedicalConsultation() {
	
	}
	
	public void addMedicalConsultationItem() {
		
	}
	
	public void addMedicalExamenItem() {
		medicalExamItems.add(medicalExam);
	}

	public MedicalConsultation getMedicalConsultation() {
		return medicalConsultation;
	}

	public void setMedicalConsultation(MedicalConsultation medicalConsultation) {
		this.medicalConsultation = medicalConsultation;
	}

	public MedicalConsultationItem getMedicalConsultationItem() {
		return medicalConsultationItem;
	}

	public void setMedicalConsultationItem(MedicalConsultationItem medicalConsultationItem) {
		this.medicalConsultationItem = medicalConsultationItem;
	}

	public List<MedicalConsultationItem> getMedicalConsultationItems() {
		return medicalConsultationItems;
	}

	public void setMedicalConsultationItems(List<MedicalConsultationItem> medicalConsultationItems) {
		this.medicalConsultationItems = medicalConsultationItems;
	}

	public MedicalExam getMedicalExam() {
		return medicalExam;
	}

	public void setMedicalExam(MedicalExam medicalExam) {
		this.medicalExam = medicalExam;
	}

	public List<MedicalExam> getMedicalExams() {
		return medicalExams;
	}

	public void setMedicalExams(List<MedicalExam> medicalExams) {
		this.medicalExams = medicalExams;
	}

	public List<MedicalExam> getMedicalExamItems() {
		return medicalExamItems;
	}

	public void setMedicalExamItems(List<MedicalExam> medicalExamItems) {
		this.medicalExamItems = medicalExamItems;
	}
	

	
	
	
	

}
