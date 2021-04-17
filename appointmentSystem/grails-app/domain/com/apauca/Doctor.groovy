package com.apauca

class Doctor {
//declaring variables
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio


	String toString(){
	return fullName
	}


    static constraints = {
	fullName blank:false
	qualification blank:false
	position blank:false
	doctorEmail email:true, blank:false, unique:true
	password blank:false
	doctorOffice blank:false
	doctorPhone blank:false, unique:true
	bio maxSize:5000
    }

//relationship between classes
static belongsTo = [Surgery, Receptionist, Prescription, Nurse, Appointment]
static hasMany = [appointments:Appointment, nurses:Nurse, patients:Patient, prescriptions:Prescription, surgeries:Surgery, receptionists:Receptionist]
}
