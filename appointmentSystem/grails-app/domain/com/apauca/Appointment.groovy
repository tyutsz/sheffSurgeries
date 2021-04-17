package com.apauca

class Appointment {
//declaring variables
	String appID
	Date appDate
	String appTime
	int appDuration
	String roomNumber

	String toString(){
	return appID
	}


    static constraints = {
	appDate blank:false
	appTime blank:false
	appDuration inList: [30, 45, 60], blank:false
	roomNumber blank:false


    }

static belongsTo = [Doctor, Patient, Surgery]
static hasMany = [doctors:Doctor, surgeries:Surgery, patients:Patient]
}
