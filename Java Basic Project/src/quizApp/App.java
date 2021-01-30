package quizApp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String q1 = "what is data structure is used for bfs graph?\n"
					+"(a)queue\n(b)stack\n(c)list\n";
		
		String q2 = "Program highest run time complexity is?\n"
					+"(a)tower of hanoi\n(b)prime no\n(c)fibonacci\n";
		String q3 = "A pivot elem to partition unsorted list is used in?\n"
				+"(a)merge sort\n(b)quick sort\n(c)selection sort\n";
		Question [] questions = {
				new Question(q1,"a"),
				new Question(q2,"a"),
				new Question(q3,"b")
		};
		takeTest(questions);
	}
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<questions.length;i++) {
			System.out.println(questions[i].prompt);
			String answer = sc.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got "+ score +"/" +questions.length);
	}

}
