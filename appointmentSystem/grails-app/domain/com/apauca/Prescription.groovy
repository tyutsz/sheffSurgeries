package com.apauca

class Prescription {
//declaring variables
	String pharmacyName
	int prescripNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying



    static constraints = {
	pharmacyName unique:true, blank:false
	prescripNumber unique:true, blank:false
	medicine blank:false
	totalCost blank:false
	dateIssued blank:false
	patientPaying blank:false
    }

static belongsTo = [patients:Patient, doctor:Doctor]

}
