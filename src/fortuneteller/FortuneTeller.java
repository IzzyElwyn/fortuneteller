package fortuneteller;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) throws InterruptedException {

		// added throws InterruptedException in order to utilize sleep
		// sleep in my slowType method to create a delay effect in printing strings
		// as though the fortune teller is actively typing to the user

		Scanner input = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		LocalTime today = LocalTime.now();

		// set quit shaming message here, since I'll be using it A LOT
		String quitShaming = "\nNobody likes a quitter...";

		// get the current time of day to be specific with greeting/farewell message
		int currentHour = today.getHour();
		String greeting;
		if (currentHour < 12) {
			greeting = "Good Morning...";
			slowType(greeting);

		} else if (currentHour > 12 && currentHour < 17) {
			greeting = "Good Afternoon...";
			slowType(greeting);

		} else {
			greeting = "Good Evening...";
			slowType(greeting);
		}

		// Ask for the user's first name
		String getFirstName = "\nWhat is your first name?\n";
		slowType(getFirstName);

		String firstName = input.nextLine();

		// Check the input to see if user wants to quit
		if (firstName.equalsIgnoreCase("quit")) {
			slowType(quitShaming);
			System.exit(0);
		}

		// Ask for the user's last name
		String getLastName = ("Thank you, " + firstName + ". \nNow, what is your last name?\n");
		slowType(getLastName);

		String lastName = input.nextLine();

		// Check the input to see if user wants to quit
		if (lastName.equalsIgnoreCase("quit")) {
			slowType(quitShaming);
			System.exit(0);
		}

		// Ask for the user's age
		String getAge = ("And how old are you?\n");
		slowType(getAge);

		String userAge = input.nextLine();

		// Check the input to see if user wants to quit
		if (userAge.equalsIgnoreCase("quit")) {
			slowType(quitShaming);

			System.exit(0);
		}

		// check to see if they actually entered an int for their age
		try {
			Integer.parseInt(userAge);
		} catch (NumberFormatException ageCheck) {
			// they entered a string and not an int, prompt them to re-enter their age
			String promptAgeReentry = "Please enter your age as a number.\n";
			slowType(promptAgeReentry);

			userAge = input.nextLine();

			// check to see if they're going to quit
			if (userAge.equalsIgnoreCase("quit")) {
				slowType(quitShaming);
				System.exit(0);
			} else {
				// check to see if they entered another string
				try {
					Integer.parseInt(userAge);
				} catch (NumberFormatException ageCheck2) {
					// they entered a string again, now we're going to assign their age for them
					String assignAge = "Now you're just being obtuse. We'll say your age is 8.\n";
					slowType(assignAge);
					userAge = "8";
				}
			}
		}

		// Ask the user for their birth month as an integer
		String getBirthMonth = "And what is the number of the month in which you were born?\n";
		slowType(getBirthMonth);

		String userBirthMonth = input.nextLine();
		// Check the input to use if user wants to quit
		if (userBirthMonth.equalsIgnoreCase("quit")) {
			slowType(quitShaming);
			System.exit(0);
		} else {
			try {
				Integer.parseInt(userBirthMonth);
			} catch (NumberFormatException monthCheck) {
				// they entered a string and not an int, give them one more chance
				String promptMonthNumReentry = "Please enter the Number of your birth month. \nExample: if you were born in January, enter \"1\"\n";
				slowType(promptMonthNumReentry);

				userBirthMonth = input.nextLine();

				// check to see if they want to quit
				if (userBirthMonth.equalsIgnoreCase("quit")) {
					slowType(quitShaming);
					System.exit(0);
				} else {
					try {
						Integer.parseInt(userBirthMonth);
					} catch (NumberFormatException MonthCheck2) {
						// they entered a string again,assign a birth month
						String assignBirthMonth = "You didn't enter a number... \nWe'll just say December\n";
						slowType(assignBirthMonth);
						userBirthMonth = "12";
					}
				}
			}
		}

		// Ask for the user's favorite ROYGBIV color and offer help if they need it
		String getRoygbivColor = "Now, of the ROYGBIV colors, which is your favorite? \nIf you don't know what ROYGBIV is, simply ask for \"help\".\n";
		slowType(getRoygbivColor);

		String userColor = input.nextLine();
		// do a while loop to check for 'help' as the input and provide explanation
		// prompt to re-enter color choice, loops if they ask for help again
		// if user quits let them exit
		while (userColor.equalsIgnoreCase("help")) {
			String roygbivHelp = "The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet \nWhich ROYGBIV color is your favorite?\n";
			slowType(roygbivHelp);
			userColor = input.nextLine();
		}
		// Check the input to see if user wants to quit
		if (userColor.equalsIgnoreCase("quit")) {
			slowType(quitShaming);
			System.exit(0);
		}

		// Ask for the user's number of siblings
		String getSiblingCount = "Last question, how many siblings do you have?\n";
		int getSiblingCountLength = getSiblingCount.length();
		int getSiblingCountPrint = 0;
		while (getSiblingCountLength > 0) {
			System.out.print(getSiblingCount.charAt(getSiblingCountPrint));
			Thread.sleep(50);
			--getSiblingCountLength;
			++getSiblingCountPrint;
		}

		String userSiblings = input.nextLine();

		// Check the input to see if user wants to quit
		if (userSiblings.equalsIgnoreCase("quit")) {
			slowType(quitShaming);
			System.exit(0);
		} else {
			try {
				Integer.parseInt(userSiblings);
			} catch (NumberFormatException siblingCheck) {
				// they entered a string instead of an int. Ask them to try again
				String promptSiblingNumReentry = "Please enter your answer as a number.\n";
				slowType(promptSiblingNumReentry);

				userSiblings = input.nextLine();

				if (userSiblings.equalsIgnoreCase("quit")) {
					slowType(quitShaming);
					System.exit(0);
				} else {
					try {
						Integer.parseInt(userSiblings);
					} catch (NumberFormatException siblingCheck2) {
						// they entered a string again. Assign them no siblings
						String assignSiblings = "Clearly you're an only child.\n";
						slowType(assignSiblings);
						userSiblings = "0";
					}
				}
			}
		}

		int retirementNumYears;

		// set years to retirement based on userAge being even or odd
		if ((Integer.parseInt(userAge) % 2) > 0) {
			retirementNumYears = Integer.parseInt(userAge) + 5;
		} else {
			retirementNumYears = Integer.parseInt(userAge) - 4;
		}

		String retirementYears = retirementNumYears + " years";
		String vacationHome;

		// determine if the user entered a number greater than or equal to 0
		// if they entered a negative number, give them a bad vacation home
		if (Integer.parseInt(userSiblings) >= 0) {
			switch (Integer.parseInt(userSiblings)) {
			case 1:
				vacationHome = "Michigan City, IN";
				break;
			case 2:
				vacationHome = "Monterey, CA";
				break;
			case 3:
				vacationHome = "Venice, Italy";
				break;
			case 4:
				vacationHome = "Seoul, Korea";
				break;
			default:
				vacationHome = "Dublin, Ireland";
			}
		} else {
			vacationHome = "The Darvaza Gas Crater, Turkmenistan";
		}

		String transportMode;

		userColor = userColor.toLowerCase();

		// Set transportMode variable based on the user's ROYGBIV choice
		switch (userColor) {
		case "red":
			transportMode = "scooter";
			break;
		case "orange":
			transportMode = "Uber";
			break;
		case "yellow":
			transportMode = "motorcycle";
			break;
		case "green":
			transportMode = "Prius";
			break;
		case "blue":
			transportMode = "Tesla";
			break;
		case "indigo":
			transportMode = "roller blades";
			break;
		case "violet":
			transportMode = "skateboard";
			break;
		default:
			transportMode = "penny-farthing";
		}

		double bankBalance;

		// set their bankBalance based on the month in which they were born
		if (Integer.parseInt(userBirthMonth) >= 6 && Integer.parseInt(userBirthMonth) <= 12) {
			bankBalance = (Integer.parseInt(userBirthMonth) * 100.6) * Integer.parseInt(userBirthMonth);
		} else if (Integer.parseInt(userBirthMonth) < 6 && Integer.parseInt(userBirthMonth) > 0) {
			bankBalance = (Integer.parseInt(userBirthMonth) * 120.75) * Integer.parseInt(userBirthMonth);
		} else {
			bankBalance = 0.00;
		}

		// print the final complete prediction
		String finalPrediction = "\n" + firstName + " " + lastName + " will retire in " + retirementYears + " with "
				+ currency.format(bankBalance) + " in " + "the bank, \na vacation home in " + vacationHome
				+ ", and travel by " + transportMode + ".";
		slowType(finalPrediction);

		// bid the user a time-appropriate goodbye
		System.out.println(" ");
		String farewell;
		if (currentHour < 12) {
			farewell = "\nHave a lovely day...";
			slowType(farewell);
		} else if (currentHour > 12 && currentHour < 17) {
			farewell = "\nHave a lovely afternoon...";
			slowType(farewell);
		} else {
			farewell = "\nHave a good night...";
			slowType(farewell);
		}

		input.close();
	}

	public static void slowType(String phrase) throws InterruptedException {
		int phraseLength = phrase.length();
		int phrasePrintChar = 0;
		while (phraseLength > 0) {
			System.out.print(phrase.charAt(phrasePrintChar));
			Thread.sleep(50);
			--phraseLength;
			++phrasePrintChar;
		}
	}
}
