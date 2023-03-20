Feature: Borrowing Calculator 

@calculatorScenario3 	
Scenario: Verify the text 
Given user launch Chrome Browser
	When user opens URL "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" 
	And user enters below details 
		| Annual Income | Other Income | Monthly Living Expense | Home Loan | Other Loans | Other Commitments | Credit Limits |
		| 0         | 0        | 1                    | 0		    | 0         | 0                 | 0         |
	And user clicks "Work out how much I could borrow" button  
	Then verify the message displayed 
		| Message |
		| Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.|        	