//  - - - - - - Exercise 1: Can James the gorf be saved? - - - - - -

class Gorf {
	boolean jamesHere = true;
	boolean found = true;
	boolean mieHere = true;
	// feel free to add anything else you feel like could be added into this 

  public static Boolean isKidnapped(boolean jamesHere) {
    // has james found it or not?
	}

	public static boolean isFound(boolean found) {
		// has gorf been found yet
	}

	public static boolean mieSaving(boolean mieHere) {
		//  has mie tried saving gorf yet
	}

	public static String isJamesTheGorfSafe(boolean jamesHere, boolean found, boolean mieHere) {
		if (isKidnapped(jamesHere)) {
			// has it been found? else return "Gorf not found yet"
			// has mie tried saving it? if yes then return "Gorf is dead"
			// anything else then return "Gorf is safe"
		} else if (isFound(found) /* and mie is not here */) {
			// return "Gorf is already safe"
		} else {
			// return "Gorf is already safe"
		}
	}
	isJamesTheGorfSafe(jamesHere, found, mieHere)
	// remember to call the correct functions!
}

//   - - - - - - - - Exercise 2: Staff member list - - - - - - - -

class staff {
	String[][] StaffMembers = {{James, Manager},
	{Lunar, Manager}, {Ryan, Manager}, 
	{Mie, LT}, {Flaym, LT}, {Chloe, LT}, 
	{Choc, Mod}, {Aloy, Mod}, {Carmi, Mod},
	{Rao, Helper}, {Achro, Helper}, {Remi, Helper}, {Misfit, Helper},
	{Danny, Helper}, {Tato, Helper}, {Kiri, Helper}, {Thunder, Helper}, 
	{Kio, Media}, {Auvrie, Media}, {Fortelling, Builder}};

  	public static String canJoinStaff(String application) {
    		// There are 4 different types of applications: staff, builder, media and qa. 
		// If application does not fall under any of these, then return "Not a position at violets"
	}

	public static int howManyStaff() {
		// return the amount of staff members in StaffMembers
	}

	public static String isStaffMember(String playerName) {
		// make a loop that checks if playerName equals any of staffMembers[x][0],
		// or any of the names in the 2d array

		// return a string, either something like "yes, " + playerName + "is a staff member."
		// or make up your own return message!
	}

	public static String roleOf(String PlayerName) {
		// make a loop that checks if playerName equals any of staffMembers[x][0],
		// or any of the names in the 2d array.
		// if the player is a staff member then return their role, else return that they are a member.
	}
	// remember to call the correct functions!
}
