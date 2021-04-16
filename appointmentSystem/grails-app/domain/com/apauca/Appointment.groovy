package com.apauca

class Appointment {
//declaring variables
	Date appDate
	String appTime
	int appDuration
	String roomNumber


    static constraints = {
	appDate blank:false
	appTime blank:false
	appDuration inList: [30, 45, 60], blank:false
	roomNumber blank:false


    }
}
