package com.apauca

class Surgery {
//declaring variables
	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime
	


    static constraints = {

	name blank:false, unique:true
	address blank:false
	postcode blank:false
	telephone blank:false, unique:true
	numberOfPatients max: 50, blank:false
	description blank:false
	openingTime blank:false
    }



static hasMany = [receptionists:Receptionist, doctors:Doctor, appointments:Appointment, nurses:Nurse]
}
