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

	def doctor1=new Doctor(			
			 fullName: 'Dr Sarah Macdonald',
			 qualification: 'MBChB Sheffield',
			 position: 'GP',
			 doctorEmail: 's.mavdonald@myemail.com',
			 password: 'secret222',
			 doctorOffice: 'D-9888',
			 doctorPhone: 4562566,
			 bio: 'Lorem Ipsum'
			).save()

	def recep1=new Receptionist(			
			 recepName: 'Rob Kingston',
			 recepEmail: 'r.kingston@email.com',
			 recepUsername: 'rking',
			 recepPassword: 'secret2019',
			 recepPhone: '01442224445'
			).save()

	def nurse1=new Nurse(			
			 nurseName:'Susan Peters',
			 qualifications: 'Registered General Nurse',
			 nurseEmail: 's.peters@email.com',
			 nurseOffice: 'B-456',
			 nursePhone: '01142224433'
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

	def prescrip1=new Prescription(			
			 pharmacyName: 'City Centre Pharmacy',
			 prescripNumber: '56788',
			 medicine: 'Paracetamol',
			 totalCost: '5.90',
			 dateIssued: new Date('25/05/2019'),
			 patientPaying: true
			).save()

	def app1=new Appointment(			
			 appDate: new Date('11/04/2019'),
			 appTime: '3:00PM',
			 appDuration: 45,
			 roomNumber: 'A-1111'
			).save()




    }
    def destroy = {
    }
}
