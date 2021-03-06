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

	
	String toString(){
	return name
	}

    static constraints = {

	name blank:false
	address blank:false
	postcode blank:false
	telephone blank:false, unique:true
	numberOfPatients max: 50, blank:false
	description blank:false
	openingTime blank:false
    }


static hasMany = [doctors:Doctor, receptionists:Receptionist, nurses:Nurse, appointments:Appointment]
static belongsTo = [Doctor, Receptionist, Nurse, Appointment]

}
