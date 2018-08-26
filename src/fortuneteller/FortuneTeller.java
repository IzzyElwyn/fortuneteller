package fortuneteller;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) throws InterruptedException {

		// added throws InterruptedException so I could use sleep between printed
		// characters
		// this adds a level of creepy interactivity for the virtual fortune teller
		// setup for user input
		Scanner input = new Scanner(System.in);
		// setup for currency for bank balance
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		// set for checking local time
		LocalTime today = LocalTime.now();

		// get the current time of day to be specific with greeting message
		int currentHour = today.getHour();
		String greeting;
		if (currentHour < 12) {
			greeting = "Good Morning...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			// while loops that print the line one character at a time, pausing between
			// each as though someone is typing to you
			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(90);
				--greetingLength;
				++greetingPrint;
			}
		} else if (currentHour > 12 && currentHour < 17) {
			greeting = "Good Afternoon...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(90);
				--greetingLength;
				++greetingPrint;
			}
		} else {
			greeting = "Good Evening...";
			int greetingLength = greeting.length();
			int greetingPrint = 0;

			while (greetingLength > 0) {
				System.out.print(greeting.charAt(greetingPrint));
				Thread.sleep(90);
				--greetingLength;
				++greetingPrint;
			}
		}

		System.out.println(" ");
		// Ask for the user's first name
		String getFirstName = "What is your first name?";
		int getFirstNameLength = getFirstName.length();
		int getFirstNamePrint = 0;
		while (getFirstNameLength > 0) {
			System.out.print(getFirstName.charAt(getFirstNamePrint));
			Thread.sleep(90);
			--getFirstNameLength;
			++getFirstNamePrint;
		}

		System.out.println(" ");
		String firstName = input.nextLine();
		// Check the input to use if user wants to quit
		if (firstName.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's last name
		String getLastName = ("Thank you, " + firstName + ". \n Now, what is your last name?");
		int getLastNameLength = getLastName.length();
		int getLastNamePrint = 0;
		while (getLastNameLength > 0) {
			System.out.print(getLastName.charAt(getLastNamePrint));
			Thread.sleep(90);
			--getLastNameLength;
			++getLastNamePrint;
		}

		System.out.println(" ");
		String lastName = input.nextLine();
		// Check the input to use if user wants to quit
		if (lastName.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's age
		String getAge = ("Lovely. And how old are you?");
		int getAgeLength = getAge.length();
		int getAgePrint = 0;
		while (getAgeLength > 0) {
			System.out.print(getAge.charAt(getAgePrint));
			Thread.sleep(90);
			--getAgeLength;
			++getAgePrint;
		}

		System.out.println(" ");
		String userAge = input.nextLine();
		// Check the input to use if user wants to quit
		if (userAge.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		} else {
			Integer.parseInt(userAge);
		}

		// Ask the user for their birth month as an integer
		String getBirthMonth = "Excellent. And what is the number of the month in which you were born?";
		int getBirthMonthLength = getBirthMonth.length();
		int getBirthMonthPrint = 0;
		while (getBirthMonthLength > 0) {
			System.out.print(getBirthMonth.charAt(getBirthMonthPrint));
			Thread.sleep(90);
			--getBirthMonthLength;
			++getBirthMonthPrint;
		}

		System.out.println(" ");
		String userBirthMonth = input.nextLine();
		// Check the input to use if user wants to quit
		if (userBirthMonth.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		} else {
			Integer.parseInt(userBirthMonth);
		}

		// Ask for the user's favorite ROYGBIV color and offer help if they need it
		String getRoygbivColor = "Thank you. Now, of the ROYGBIV colors, which is your favorite? \nIf you don't know what ROYGBIV is, "
				+ "simply ask for \"help\".";
		int getRoygbivColorLength = getRoygbivColor.length();
		int getRoygbivColorPrint = 0;
		while (getRoygbivColorLength > 0) {
			System.out.print(getRoygbivColor.charAt(getRoygbivColorPrint));
			Thread.sleep(90);
			--getRoygbivColorLength;
			++getRoygbivColorPrint;
		}

		System.out.println(" ");
		String userColor = input.nextLine();
		// do a while loop to check for 'help' as the input and provide explanation
		// prompt to re-enter color choice, loops if they ask for help again
		// if user quits let them exit
		while (userColor.equalsIgnoreCase("help")) {
			String roygbivHelp = "The ROYGBIV colors are red, orange, yellow, green, blue, indigo, and violet \n Which ROYGBIV color is your favorite?";
			int roygbivHelpLength = roygbivHelp.length();
			int roygbivHelpPrint = 0;
			while (roygbivHelpLength > 0) {
				System.out.print(roygbivHelp.charAt(roygbivHelpPrint));
				Thread.sleep(90);
				--roygbivHelpLength;
				++roygbivHelpPrint;
			}
			System.out.println(" ");
			userColor = input.nextLine();
		}
		// Check the input to use if user wants to quit
		if (userColor.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		}

		// Ask for the user's number of siblings
		String getSiblingCount = "Last question, how many siblings do you have?";
		int getSiblingCountLength = getSiblingCount.length();
		int getSiblingCountPrint = 0;
		while (getSiblingCountLength > 0) {
			System.out.print(getSiblingCount.charAt(getSiblingCountPrint));
			Thread.sleep(90);
			--getSiblingCountLength;
			++getSiblingCountPrint;
		}

		System.out.println(" ");
		String userSiblings = input.nextLine();
		// Check the input to use if user wants to quit
		if (userSiblings.equalsIgnoreCase("quit")) {
			String quitShaming = "Nobody likes a quitter...";
			int quitShamingLength = quitShaming.length();
			int quitShamingPrint = 0;
			while (quitShamingLength > 0) {
				System.out.print(quitShaming.charAt(quitShamingPrint));
				Thread.sleep(90);
				--quitShamingLength;
				++quitShamingPrint;
			}
			System.exit(0);
		} else {
			Integer.parseInt(userSiblings);
		}

		// declare variable for number of years until retirement so I can make this
		// different based on a users age
		int retirementNumYears;
		// determine if the user's age is even or odd and use that to set the
		// retirementNumYears variable
		if ((Integer.parseInt(userAge) % 2) > 0) {
			retirementNumYears = Integer.parseInt(userAge) + 5;
		} else {
			retirementNumYears = Integer.parseInt(userAge) - 4;
		}
		// now that I've done my creative math, I'll declare my final retirementYears
		// variable for my fortune
		String retirementYears = retirementNumYears + " years";

		// declare variable for vacation home
		String vacationHome;

		// determine if the user entered a number greater than or equal to 0, of they
		// did we have cases for various inputs
		// if they entered a negative number then we follow the else statement which
		// puts them in the darvazas gas crater
		if (Integer.parseInt(userSiblings) >= 0) {
			switch (Integer.parseInt(userSiblings)) {
			case 1:
				vacationHome = "Michican City, IN";
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

		// declare variable for mode of transportation
		String transportMode;

		// set the userColor variable to lower case so I can use switch/case and not a
		// million if/else
		userColor = userColor.toLowerCase();

		// use Switch/Case to set our transportMode variable based on the user's ROYGBIV
		// choice
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

		// declare variable for bank balance
		double bankBalance;

		// if/else to set their bankBalance based on the month in which they were born
		if (Integer.parseInt(userBirthMonth) > 6 && Integer.parseInt(userBirthMonth) < 12) {
			bankBalance = (Integer.parseInt(userBirthMonth) * 8.5) * Integer.parseInt(userBirthMonth);
		} else if (Integer.parseInt(userBirthMonth) < 6 && Integer.parseInt(userBirthMonth) > 0) {
			bankBalance = (Integer.parseInt(userBirthMonth) * 9.75) * Integer.parseInt(userBirthMonth);
		} else {
			bankBalance = 0.00;
		}

		String finalPrediction = firstName + " " + lastName + " will retire in " + retirementYears + " with "
				+ currency.format(bankBalance) + " in " + "the bank, \na vacation home in " + vacationHome
				+ ", and travel by " + transportMode + ".";
		int finalPredictionLength = finalPrediction.length();
		int finalPredictionPrint = 0;
		while (finalPredictionLength > 0) {
			System.out.print(finalPrediction.charAt(finalPredictionPrint));
			Thread.sleep(90);
			--finalPredictionLength;
			++finalPredictionPrint;
		}

		System.out.println(" ");
		String farewell;
		if (currentHour < 12) {
			farewell = "Have a lovely day...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			// while loops that print the line one character at a time, pausing between
			// each as though someone is typing to you
			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(90);
				--farewellLength;
				++farewellPrint;
			}
		} else if (currentHour > 12 && currentHour < 17) {
			farewell = "Have a lovely afternoon...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(90);
				--farewellLength;
				++farewellPrint;
			}
		} else {
			farewell = "Good night...";
			int farewellLength = farewell.length();
			int farewellPrint = 0;

			while (farewellLength > 0) {
				System.out.print(farewell.charAt(farewellPrint));
				Thread.sleep(90);
				--farewellLength;
				++farewellPrint;
			}
		}

		input.close();
	}

}
