Feature: Borrowing Calculator 

@calculatorScenario1
Scenario: Calculate borrowing estimate for person with below details 

	Given user launch Chrome Browser 
	When user opens URL "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" 
	And user enters below details 
		| Annual Income | Other Income | Monthly Living Expense | Home Loan | Other Loans | Other Commitments | Credit Limits |
		| 80000         | 10000        | 500                    | 0		    | 100         | 0                 | 10000         |
	And user clicks "Work out how much I could borrow" button 
	Then verify borrowing estimate is calculated as "$415,000" 
        	