package com.apauca

class Receptionist {
//declaring variables	
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone
	
	



    static constraints = {
	
	recepName blank:false
	recepEmail blank:false, unique:true
	recepUsername unique:true, blank:false
	recepPassword blank:false
	recepPhone blank:false, unique:true 
    }

static belongsTo = [surgery:Surgery]
}
