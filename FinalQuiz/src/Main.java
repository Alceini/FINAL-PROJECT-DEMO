/*
Write an application that contains an array of 10 multiple-choice quiz questions related to your favorite hobby. 
Each question contains three answer choices. Also create an array that holds the correct answer to each question—A, B, or C. 
Display each question and verify that the user enters only A, B, or C as the answer—if not, keep prompting the user until a valid response is entered. 
If the user responds to a question correctly, display Correct!; otherwise, display The correct answer is and the letter of the correct answer. 
After the user answers all the questions, display the number of correct and incorrect answers.
*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner roe = new Scanner(System.in);
		Scanner elk = new Scanner(System.in);
		System.out.println("Welcome to the Music Quiz, ");
		System.out.println("Press enter to Start >> ");
		String enter = roe.nextLine();
		
		String[] correct = {"C", "A", "C", "B", "B", "C", "A", "B", "C", "A"};
		
		String[] questions = {"Which of the three are in Alice In Chains?", "Which song is not by Stone Temple Pilots?", "When did Prince's album, 'Around the World In a Day', come out?", 
				"What os the highest grossing album of all time?", "How many copies did Pink Floyd's album, 'Wish You Were Here', sell?", "Who wrote and created the song 'Hurt'?", "When was the band, Sade, formed?", 
				"Where was the band New Edition formed?", "What is Nirvana's most popular album?", "What Was MTV's First Music Video?"};
		
		String[] description = { 
				"Buddy Waters", 
				"Reptile",
				"1987",
				"Hotel California",
				"17 Million",
				"Johnny Cash",
				"1982",
				"Columbus",
				"In Utero",
				"Video Killed The Radio Star",
		};
		
		String[] description2 = { 
				"Chris Cornell",
				"Creep", 
				"1990",
				"Thriller",
				"23 Million",
				"Bob Dylan",
				"1983",
				"Boston",
				"Bleach",
				"Billie Jean",
		};
		
		String[] description3 = { 
				"Jerry Cantrell",
				"Plush", 
				"1985",
				"Rumors",
				"9 Million",
				"Trent Reznor",
				"1979",
				"Chicago",
				"Nevermind",
				"Once In A Life Time",
		};
		
		int score = 0;	
		int incorr = 0;
	
		System.out.println("------------------------");
		System.out.println("To answer a question, type the capital letter of your choice then hit enter.");
		System.out.println("There are 10 questions, each question has 3 choices: A, B, or C.");
		System.out.println("------------------------");
		System.out.println("");
		
		int i = 0;
		
		for (; i < correct.length -1; ) {
			System.out.println("");
			System.out.println("Question " + (i + 1) + ": " + questions[i]);
			System.out.println("A) " + description[i]);
			System.out.println("B) " + description2[i]);
			System.out.println("C) " + description3[i]);
			System.out.print(">> ");
			
			String answers = correct[i];
			String answer = elk.next();
			
			if(answers.equals(answer)) {	
				System.out.println("Correct, next question");
				++i;
				++score;
				
			}
			
			if(!answers.equals(answer)) {
				System.out.println("Incorrect, the answer was "  + answers);
				++i;
				++incorr;
				
			}	
			
			
			//FUCK YES IT FINALLY WORKS
			//IM GONNA BREAK IM GONNA BREAK MY RUSTY CAGE AND RUN
		}
		
		if (i == 9) {
			System.out.println("");
			System.out.println("Question " + (i + 1) + ": " + questions[i]);
			System.out.println("A) " + description[i]);
			System.out.println("B) " + description2[i]);
			System.out.println("C) " + description3[i]);
			System.out.print(">> ");
			
			String answers = correct[i];
			String answer = elk.next();
			
			if(answers.equals(answer)) {	
				System.out.println("Correct");
				++i;
				++score;
				
			}
			
			if(!answers.equals(answer)) {
				System.out.println("Incorrect, the answer was "  + answers);
				++i;
				++incorr;
				
			}
			
		}		
		
		if (i >= correct.length) {
			System.out.println("");
			System.out.println("------------------------");
			System.out.println("Congrats, you have finished the Quiz");
			System.out.println("Your score is: " + score + " / 10");
			System.out.println("This is how many you got wong: " + incorr + " / 10");
			System.out.println("------------------------");
			elk.close();
	
		}
		
	}

}
