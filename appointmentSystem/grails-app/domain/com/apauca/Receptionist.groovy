package com.apauca

class Receptionist {
//declaring variables
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone

    static constraints = {
	recepName blank:false
	recepEmail email:true, blank:false, unique:true
	recepUsername unique:true, blank:false
	recepPassword blank:false
	recepPhone blank:false, unique:true
    }

static belongsTo = [surgery:Surgery]
}
