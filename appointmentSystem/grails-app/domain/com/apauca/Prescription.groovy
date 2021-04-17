package com.apauca

class Prescription {
//declaring variables
	String pharmacyName
	String prescripNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying

	String toString(){
	return prescripNumber
	}

    static constraints = {
	pharmacyName unique:true, blank:false
	prescripNumber unique:true, blank:false
	medicine blank:false
	totalCost blank:false
	dateIssued blank:false
	patientPaying blank:false
    }


static belongsTo = [Patient, Doctor]
static hasMany = [doctors:Doctor, patients:Patient]

}
