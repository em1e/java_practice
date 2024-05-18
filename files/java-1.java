//  - - - - - - Exercise 1.1: Can James the gorf be saved? - - - - - -

class Gorf {
	// these booleans can be changed when testing
	boolean jamesHere = true;
	boolean found = true;
	boolean mieHere = true;
	// feel free to add anything else you feel like could be added into this 

	public boolean isKidnapped(boolean jamesHere) {
   		 // has james found and kidnapped it or not?
	}

	public boolean isFound(boolean found) {
		// has gorf been found by anyone else yet?
	}

	public boolean mieSaving(boolean mieHere) {
		//  has mie tried saving gorf?
	}

	public String isJamesTheGorfSafe(boolean jamesHere, boolean found, boolean mieHere) {
		if (isKidnapped(jamesHere) == true) {
			// has it been found? else return "Gorf not found yet"
			// has mie tried saving it? if yes then return "Gorf is dead"
			// anything else then return "Gorf is safe"
		} else if (isFound(found) /* and mie is not here */) {
			// return "Gorf is already safe"
		} else {
			// return "Gorf is already safe"
		}
	}
	isJamesTheGorfSafe(jamesHere, found, mieHere);
	// remember to call the correct functions
}

//   - - - - - - - - Exercise 1.2: Staff member list - - - - - - - -

class staff {
	String[][] StaffMembers = {{James, Manager},
	{Lunar, Manager}, {Ryan, Manager}, 
	{Mie, LT}, {Flaym, LT}, {Chloe, LT}, 
	{Choc, Mod}, {Aloy, Mod}, {Carmi, Mod},
	{Rao, Helper}, {Achro, Helper}, {Remi, Helper}, {Misfit, Helper},
	{Danny, Helper}, {Tato, Helper}, {Kiri, Helper}, {Thunder, Helper}, 
	{Kio, Media}, {Auvrie, Media}, {Fortelling, Builder}};

	public String canJoinStaff(String application) {
    		// There are 4 different types of applications: staff, builder, media and qa. 
		// If application does not fall under any of these, then return "Not a position at violets"
	}

	public int howManyStaff() {
		// return the amount of staff members in StaffMembers
	}

	public String isStaffMember(String playerName) {
		// make a loop that checks if playerName equals any of staffMembers[x][0],
		// or any of the names in the 2d array

		// return a string, either something like "yes, " + playerName + "is a staff member."
		// or make up your own return message!
	}

	public String roleOf(String PlayerName) {
		// make a loop that checks if playerName equals any of staffMembers[x][0],
		// or any of the names in the 2d array.
		// if the player is a staff member then return their role, else return that they are a member.
	}
	// remember to call the correct functions
}

//   - - - - - - - - Exercise 1.3: Calculator - - - - - - - -

class calculator {
	String count(int num1, char operator, int num2) {
		// check if operator is valid, else return error (and correct error message)

		// if valid: add cases for each of the math equations (for each of the valid operators)
		
		// else check: operator = null, operator = "" and else throw that it doens't exist
	}
	// remember to call the correct functions
}
