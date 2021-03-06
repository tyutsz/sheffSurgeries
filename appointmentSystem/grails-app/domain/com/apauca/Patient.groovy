package com.apauca

class Patient {
//declaring variables
	String patientName
	String patientAddress
	String patientResidence
	Date patientDOB
	String patientID
	Date dateRegistered
	String patientPhone

	String toString(){
	return patientName
	}


    static constraints = {
	patientName blank:false
	patientAddress blank:false
	patientResidence blank:false
	patientDOB blank:false
	patientID blank:false, unique:true
	dateRegistered blank:false
	patientPhone blank:false, unique:true
    }

static hasMany = [doctors:Doctor, prescriptions:Prescription, appointments:Appointment]
static belongsTo = [Doctor, Prescription, Appointment]
}
