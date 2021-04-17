package com.apauca

class Nurse {
//declaring variables
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone
	


    static constraints = {
	
	nurseName blank:false
	qualifications blank:false
	nurseEmail blank:false, unique:true
	nurseOffice blank:false
//declared phone as a string so i can validate using RegEx
	nursePhone blank:false, unique:true


    }
static hasMany = [doctors:Doctor]
static belongsTo = [doctor:Doctor, surgery:Surgery]
}
