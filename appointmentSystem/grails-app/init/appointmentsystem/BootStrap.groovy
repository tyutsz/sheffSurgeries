package com.apauca

class BootStrap {

    def init = { servletContext ->

	def surgery1=new Surgery(			
			 name: 'City Health Centre',
			 address: '21 Marble Street Sheffield',
			 postcode: 'S115TY',
			 telephone: '0114555555',
			 numberOfPatients: '20',
			 description: 'Lorem Ipsum', 
			 openingTime: '09:00-17:00hrs'
			).save()

	def surgery2=new Surgery(			
			 name: 'Barnsley Health Centre',
			 address: '16 Summer Street Barnsley',
			 postcode: 'S225EZ',
			 telephone: '07823555889',
			 numberOfPatients: '30',
			 description: 'Lorem Ipsum', 
			 openingTime: '09:00-17:00hrs'
			).save()

	def doctor1=new Doctor(			
			 fullName: 'Dr Sarah Macdonald',
			 qualification: 'MBChB Sheffield',
			 position: 'GP',
			 doctorEmail: 's.mavdonald@myemail.com',
			 password: 'secret222',
			 doctorOffice: 'D-9888',
			 doctorPhone: '0125689415',
			 bio: 'Lorem Ipsum'
			).save()

	def doctor2=new Doctor(			
			 fullName: 'Dr Mitchell Smith',
			 qualification: 'MBChB Leeds',
			 position: 'Surgeon',
			 doctorEmail: 'm.smith@myemail.com',
			 password: 'secret222',
			 doctorOffice: 'DH-8989',
			 doctorPhone: '0122789456',
			 bio: 'Lorem Ipsum'
			).save()

	def recep1=new Receptionist(			
			 recepName: 'Rob Kingston',
			 recepEmail: 'r.kingston@email.com',
			 recepUsername: 'rking',
			 recepPassword: 'secret2019',
			 recepPhone: '01442224445'
			).save()

	def recep2=new Receptionist(			
			 recepName: 'James Longley',
			 recepEmail: 'j.longley@email.com',
			 recepUsername: 'jlongley',
			 recepPassword: 'secret2019',
			 recepPhone: '07856898995'
			).save()

	def nurse1=new Nurse(			
			 nurseName:'Susan Peters',
			 qualifications: 'Registered General Nurse',
			 nurseEmail: 's.peters@email.com',
			 nurseOffice: 'B-456',
			 nursePhone: '01142224433'
			).save()

	def nurse2=new Nurse(			
			 nurseName:'Karen Karington',
			 qualifications: 'Registered General Nurse',
			 nurseEmail: 'k.karington@email.com',
			 nurseOffice: 'C-1234',
			 nursePhone: '07856954789'
			).save()

	def patient1=new Patient(			
			 patientName: 'Tom Rivers',
			 patientAddress: '2 One Way Street, Eckington',
			 patientResidence: 'Sheffield',
			 patientDOB: new Date('20/09/1988'),
			 patientID: 'E25555',
			 dateRegistered: new Date('26/02/2018'),
			 patientPhone: '01442224444'
			).save()

	def patient2=new Patient(			
			 patientName: 'John Doe',
			 patientAddress: '16 Medlat roft, Rotherham',
			 patientResidence: 'Rotherham',
			 patientDOB: new Date('16/09/1993'),
			 patientID: 'J9876',
			 dateRegistered: new Date('16/03/2021'),
			 patientPhone: '07856159357'
			).save()

	def prescrip1=new Prescription(			
			 pharmacyName: 'City Centre Pharmacy',
			 prescripNumber: '56788',
			 medicine: 'Paracetamol',
			 totalCost: '5.90',
			 dateIssued: new Date('25/05/2019'),
			 patientPaying: true
			).save()

	def prescrip2=new Prescription(			
			 pharmacyName: 'Plodder Lane Pharmacy',
			 prescripNumber: 'C-78955',
			 medicine: 'Naproxen',
			 totalCost: '10.25',
			 dateIssued: new Date('16/08/2020'),
			 patientPaying: false
			).save()

	def app1=new Appointment(			
			 appDate: new Date('11/04/2019'),
			 appTime: '3:00PM',
			 appDuration: 45,
			 roomNumber: 'A-1111'
			).save()

	def app2=new Appointment(			
			 appDate: new Date('30/11/2021'),
			 appTime: '4:00PM',
			 appDuration: 60,
			 roomNumber: 'B-63'
			).save()





    }
    def destroy = {
    }
}
