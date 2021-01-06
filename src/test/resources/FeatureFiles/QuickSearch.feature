@Quicksearch
Feature:Check Quicksearch Form

Background:user is logged in.
Given user is on quicksearch form.

@Quicksearch @Text
Scenario:Check searching with Title and Abstract Field
When user selects title and abstract field from dropdown and enters "Grommet" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Text
Scenario:Check searching with Title  Abstract and claims Field
When user selects title  abstract claims field from dropdown and enters "Jet Engine" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Text
Scenario:Check searching with claims Field
When user selects claims field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Text
Scenario:Check searching with Fulltext Field
When user selects fulltext field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Text
Scenario:Check searching with Independent claims Field
When user selects independent claims field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Publication number Field
When user selects publication number field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Publication date Field
When user selects publication date field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Publication Year Field
When user selects publication Year field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Application number Field
When user selects Application number field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Application date Field
When user selects Application date field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Application year Field
When user selects Application year field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Priority number Field
When user selects Priority number field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Priority country Field
When user selects Priority country field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Biblio
Scenario:Check searching with Priority dates Field
When user selects Priority dates field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Inventor Field
When user selects Inventor field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Examiner Field
When user selects Examiner field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Attorny Field
When user selects Attorny field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with current owner Field
When user selects current owner field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with All Assignee Field
When user selects All Assignee field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Assigne normalized Field
When user selects Assigne normalized field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Inventor Field
When user selects Inventor field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Parties
Scenario:Check searching with Current assignee Field
When user selects Current assignee field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with US classification class
When user selects Current assignee field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with All classification class
When user selects All classification field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with IPC classification class
When user selects IPC field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with Locarno classification class
When user selects Locarno field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with CPC classification class
When user selects CPC field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Clases
Scenario:Check searching with IPC classification class
When user selects IPC field from dropdown and enters "motor piston" in the textbox.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Operators
Scenario:Check searching with OR and AND operators and with all three search fields
When user selects the Title field from dropdown and enters "motor piston".
Then user selects OR operator from the operators dropdown.
Then user selects claims field from the second dropdown and enters claims as " ".
Then user selects AND from the operators dropdown.
Then user enters dates in the PBD fields.
Then user clicks on search button.
Then results page should be displayed.

@Quicksearch @Operators
Scenario:Check searching with NOT operators and with all three search fields
When user selects the title field from dropdown and enter "motor piston".
Then user selects NOT operator from the operators dropdown.
Then user enters dates in the PBD fields.
Then user clicks on search button.
Then results page should be displayed.










