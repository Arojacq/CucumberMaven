Feature: Guru99 testing Demo page 

Scenario: Add Customer "http://demo.guru99.com/telecom" 

	Given The user launch the url 
	And The user click the Add customer 
	
	When The user fill the all details 
		|Aro|Jacq|arojacq@gmail.com|Velachery|1234567890|
	And The user click the submit button 
	Then The user get the CustomerID 
	And The user close the url 
	
	
	
Scenario: Add Customer "http://demo.guru99.com/telecom" 

	Given The user launch the url 
	And The user click the Add customer 
	
	When The user fill the all details 
		|Aro|Jacq|arojacq@gmail.com|Velachery|1234567890|
	And The user click the submit button 
	Then The user get the CustomerID 
	And The user close the url 
	
	
Scenario: Add Tariff Plan http://demo.guru99.com/telecom/ 


	Given The user Launch the url guru 
	And The user click the Add Tariff Plan 
	
	When The user fill all details in tariff plan 
		|Monthly Rental|500|
		|Free Local Minutes|250|
		|Free International Minutes|2|
		|Free SMS Pack|50|
		|Local Per Minutes Charges|1|
		|International Per Minutes Charges|50|
		|SMS Per Charges|1|
	And The user click Submit button 
	
	Then The user get the message congratulations 
	