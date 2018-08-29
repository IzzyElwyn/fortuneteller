package fortuneteller;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) throws InterruptedException {

		// added throws InterruptedException in order to utilize sleep
		// sleep used to create a delay effect in printing strings
		// as though the fortune teller is actively typing to the user

		Scanner input = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		LocalTime today = LocalTime.now();

		// get the current time of day to be specific with greeting/farewell message
		int currentHour = today.getHour();
		String greeting;
		if (currentHour < 12) {
			greeting = "Good Morning...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(50);
				--greetingLength;
				++greetingPrint;
			}
		} else if (currentHour > 12 && currentHour < 17) {
			greeting = "Good Afternoon...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(50);
				--greetingLength;
				++greetingPrint;
			}
		} else {
			greeting = "Good Evening...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(50);
				--greetingLength;
				++greetingPrint;
			}
		}


		// Ask for the user's first name
		String getFirstName = "\nWhat is your first name?";
		int getFirstNameLength = getFirstName.length();
		int getFirstNamePrint = 0;
		while (getFirstNameLength > 0) {
			System.out.print(getFirstName.charAt(getFirstNamePrint));
			Thread.sleep(50);
			--getFirstNameLength;
			++getFirstNamePrint;
		}

		String firstName = input.nextLine();

		// Check the input to see if user wants to quit
		if (firstName.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's last name
		String getLastName = ("Thank you, " + firstName + ". \nNow, what is your last name?");
		int getLastNameLength = getLastName.length();
		int getLastNamePrint = 0;
		while (getLastNameLength > 0) {
			System.out.print(getLastName.charAt(getLastNamePrint));
			Thread.sleep(50);
			--getLastNameLength;
			++getLastNamePrint;
		}

		String lastName = input.nextLine();
		
		// Check the input to see if user wants to quit
		if (lastName.equalsIgnoreCase("quit")) {
			String quitShaming = "\nNobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's age
		String getAge = ("\nAnd how old are you?");
		int getAgeLength = getAge.length();
		int getAgePrint = 0;
		while (getAgeLength > 0) {
			System.out.print(getAge.charAt(getAgePrint));
			Thread.sleep(50);
			--getAgeLength;
			++getAgePrint;
		}

		String userAge = input.nextLine();

		// Check the input to see if user wants to quit
		if (userAge.equalsIgnoreCase("quit")) {
			String quitShaming = "\nNobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// check to see if they actually entered an int for their age
		try {
			Integer.parseInt(userAge);
		} catch (NumberFormatException ageCheck) {
			// they entered a string and not an int, prompt them to re-enter their age
			String promptAgeReentry = "\nPlease enter your age as a number.";
			int promptAgeReentryLength = promptAgeReentry.length();
			int promptAgeReentryPrint = 0;
			while (promptAgeReentryLength > 0) {
				System.out.print(promptAgeReentry.charAt(promptAgeReentryPrint));
				Thread.sleep(50);
				--promptAgeReentryLength;
				++promptAgeReentryPrint;
			}
			userAge = input.nextLine();
			// check to see if they're going to quit
			if (userAge.equalsIgnoreCase("quit")) {
				String quitShaming = "\nNobody likes a quitter...";
				int quitShamingLength = quitShaming.length();
				int quitShamingPrint = 0;
				while (quitShamingLength > 0) {
					System.out.print(quitShaming.charAt(quitShamingPrint));
					Thread.sleep(50);
					--quitShamingLength;
					++quitShamingPrint;
				}
				System.exit(0);
			} else {
				// check to see if they entered another string
				try {
					Integer.parseInt(userAge);
				} catch (NumberFormatException ageCheck2) {
					// they entered a string again, now we're going to assign their age for them
					String assignAge = "\nNow you're just being obtuse. We'll say your age is 8.";
					int assignAgeLength = assignAge.length();
					int assignAgePrint = 0;
					while (assignAgeLength > 0) {
						System.out.print(assignAge.charAt(assignAgePrint));
						Thread.sleep(50);
						--assignAgeLength;
						++assignAgePrint;
						userAge = "8";
					}
				}
			}
		}
		
		// Ask the user for their birth month as an integer
		String getBirthMonth = "\nAnd what is the number of the month in which you were born?";
		int getBirthMonthLength = getBirthMonth.length();
		int getBirthMonthPrint = 0;
		while (getBirthMonthLength > 0) {
			System.out.print(getBirthMonth.charAt(getBirthMonthPrint));
			Thread.sleep(50);
			--getBirthMonthLength;
			++getBirthMonthPrint;
		}

		String userBirthMonth = input.nextLine();
		// Check the input to use if user wants to quit
		if (userBirthMonth.equalsIgnoreCase("quit")) {
			String quitShaming = "\nNobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		} else {
			try {
				Integer.parseInt(userBirthMonth);
			} catch (NumberFormatException monthCheck) {
				// they entered a string and not an int, give them one more chance
				String promptMonthNumReentry = "\nPlease enter the Number of your birth month. \nExample: if you were born in January, enter \"1\"";
				int promptMonthNumReentryLength = promptMonthNumReentry.length();
				int promptMonthNumReentryPrint = 0;
				while (promptMonthNumReentryLength > 0) {
					System.out.print(promptMonthNumReentry.charAt(promptMonthNumReentryPrint));
					Thread.sleep(50);
					--promptMonthNumReentryLength;
					++promptMonthNumReentryPrint;
				}

				userBirthMonth = input.nextLine();

				// check to see if they want to quit
				if (userBirthMonth.equalsIgnoreCase("quit")) {
					String quitShaming = "\nNobody likes a quitter...";
					int quitShamingLength = quitShaming.length();
					int quitShamingPrint = 0;
					while (quitShamingLength > 0) {
						System.out.print(quitShaming.charAt(quitShamingPrint));
						Thread.sleep(50);
						--quitShamingLength;
						++quitShamingPrint;
					}
					System.exit(0);
				} else {
					try {
						Integer.parseInt(userBirthMonth);
					} catch (NumberFormatException string4) {
						// they entered a string again,assign a birth month
						String assignBirthMonth = "\nYou didn't enter a number... \nWe'll just say December";
						int assignBirthMonthLength = assignBirthMonth.length();
						int assignBirthMonthPrint = 0;
						while (assignBirthMonthLength > 0) {
							System.out.print(assignBirthMonth.charAt(assignBirthMonthPrint));
							Thread.sleep(50);
							--assignBirthMonthLength;
							++assignBirthMonthPrint;
							userBirthMonth = "12";
						}
					}
				}
			}
		}

		// Ask for the user's favorite ROYGBIV color and offer help if they need it
		String getRoygbivColor = "\nNow, of the ROYGBIV colors, which is your favorite? \nIf you don't know what ROYGBIV is, simply ask for \"help\".";
		int getRoygbivColorLength = getRoygbivColor.length();
		int getRoygbivColorPrint = 0;
		while (getRoygbivColorLength > 0) {
			System.out.print(getRoygbivColor.charAt(getRoygbivColorPrint));
			Thread.sleep(50);
			--getRoygbivColorLength;
			++getRoygbivColorPrint;
		}

		String userColor = input.nextLine();
		// do a while loop to check for 'help' as the input and provide explanation
		// prompt to re-enter color choice, loops if they ask for help again
		// if user quits let them exit
		while (userColor.equalsIgnoreCase("help")) {
			String roygbivHelp = "\nThe ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet \nWhich ROYGBIV color is your favorite?";
			int roygbivHelpLength = roygbivHelp.length();
			int roygbivHelpPrint = 0;
			while (roygbivHelpLength > 0) {
				System.out.print(roygbivHelp.charAt(roygbivHelpPrint));
				Thread.sleep(50);
				--roygbivHelpLength;
				++roygbivHelpPrint;
			}
			userColor = input.nextLine();
		}
		// Check the input to see if user wants to quit
		if (userColor.equalsIgnoreCase("quit")) {
			String quitShaming = "\nNobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's number of siblings
		String getSiblingCount = "\nLast question, how many siblings do you have?";
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
			String quitShaming = "\nNobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(50);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		} else {
			try {
				Integer.parseInt(userSiblings);
			} catch (NumberFormatException siblingCheck) {
				// they entered a string instead of an int. Ask them to try again
				String promptSiblingNumReentry = "\nPlease enter your answer as a number.";
				int promptSiblingNumReentryLength = promptSiblingNumReentry.length();
				int promptSiblingNumReentryPrint = 0;
				while (promptSiblingNumReentryLength > 0) {
					System.out.print(promptSiblingNumReentry.charAt(promptSiblingNumReentryPrint));
					Thread.sleep(50);
					--promptSiblingNumReentryLength;
					++promptSiblingNumReentryPrint;
				}
				
				userSiblings = input.nextLine();
				
				if (userSiblings.equalsIgnoreCase("quit")) {
					String quitShaming = "\nNobody likes a quitter...";
					int quitShamingLength = quitShaming.length();
					int quitShamingPrint = 0;
					while (quitShamingLength > 0) {
						System.out.print(quitShaming.charAt(quitShamingPrint));
						Thread.sleep(50);
						--quitShamingLength;
						++quitShamingPrint;
					}
					System.exit(0);
				} else {
					try {
						Integer.parseInt(userSiblings);
					} catch (NumberFormatException siblingCheck2) {
						// they entered a string again. Assign them no siblings
						String assignSiblings = "\nClearly you're an only child.";
						int assignSiblingLength = assignSiblings.length();
						int assignSiblingPrint = 0;
						while (assignSiblingLength > 0) {
							System.out.print(assignSiblings.charAt(assignSiblingPrint));
							Thread.sleep(50);
							--assignSiblingLength;
							++assignSiblingPrint;
							userSiblings = "0";
						}
					}
				}
			}
			Integer.parseInt(userSiblings);
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
		} else if (Integer.parseInt(userBirthMonth) <= 6 && Integer.parseInt(userBirthMonth) > 0) {
			bankBalance = (Integer.parseInt(userBirthMonth) * 120.75) * Integer.parseInt(userBirthMonth);
		} else {
			bankBalance = 0.00;
		}

		// print the final complete prediction
		String finalPrediction = "\n" + firstName + " " + lastName + " will retire in " + retirementYears + " with "
				+ currency.format(bankBalance) + " in " + "the bank, \na vacation home in " + vacationHome
				+ ", and travel by " + transportMode + ".";
		int finalPredictionLength = finalPrediction.length();
		int finalPredictionPrint = 0;
		while (finalPredictionLength > 0) {
			System.out.print(finalPrediction.charAt(finalPredictionPrint));
			Thread.sleep(50);
			--finalPredictionLength;
			++finalPredictionPrint;
		}

		// bid the user a time-appropriate goodbye
		System.out.println(" ");
		String farewell;
		if (currentHour < 12) {
			farewell = "\nHave a lovely day...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(50);
				--farewellLength;
				++farewellPrint;
			}
		} else if (currentHour > 12 && currentHour < 17) {
			farewell = "\nHave a lovely afternoon...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(50);
				--farewellLength;
				++farewellPrint;
			}
		} else {
			farewell = "\nHave a good night...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(50);
				--farewellLength;
				++farewellPrint;
			}
		}

		input.close();
	}

}
