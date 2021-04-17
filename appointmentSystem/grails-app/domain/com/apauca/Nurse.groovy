package com.apauca

class Nurse {
//declaring variables
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

	String toString(){
	return nurseName
	}


    static constraints = {
	nurseName blank:false
	qualifications blank:false
	nurseEmail email:true, blank:false, unique:true
	nurseOffice blank:false
	nursePhone blank:false, unique:true


    }

static belongsTo = [Doctor, Surgery]
static hasMany = [surgeries:Surgery, doctors:Doctor]
}
