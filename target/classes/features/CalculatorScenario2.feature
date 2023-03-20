Feature: Borrowing Calculator 

@calculatorScenario2
Scenario: Clicking the 'start over' button clears the form 

	Given user launch Chrome Browser 
	When user opens URL "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" 
	And user enters below details 
		| Annual Income | Other Income | Monthly Living Expense | Home Loan | Other Loans | Other Commitments | Credit Limits |
		| 80000         | 10000        | 500                    | 0		    | 100         | 0                 | 10000         |
	And user clicks Start over button 
	Then verify the form is cleared        	