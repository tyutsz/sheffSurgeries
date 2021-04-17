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
	nurseEmail email:true, blank:false, unique:true
	nurseOffice blank:false
	nursePhone blank:false, unique:true


    }
static hasMany = [doctors:Doctor]
static belongsTo = [Doctor, Surgery]
}
