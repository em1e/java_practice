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

	public String isJamesTheGorfSafe(boolean jamesHere, boolean found, boolean mieHere) {
		if (isKidnapped(jamesHere) == true) {
			// If gorf has been found by james, then it has been kidnapped.
			// anything else then return "Gorf is safe"
		} else if (isFound(found) /* and mie is not here */) {
			// if it has only been found by players and mie is not there then it is safe.
		} else {
			// if it has not been found by anyone then gorf has not been found yet, and is safe.
		}
	}
	return isJamesTheGorfSafe(jamesHere, found, mieHere);
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
  // fyi. only 3 out of the 4 applications are open, refer back to violets discord for more information
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
