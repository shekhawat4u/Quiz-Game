import java.util.Scanner;

class Question {
    String question;
    String[] choices;
    int correctAnswer;

    public Question(String question, String[] choices, int correctAnswer) {
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(int choice) {
        return choice == correctAnswer;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define questions
        Question[] questions = new Question[]{
            new Question("What is the capital of France?", new String[]{"1. Paris", "2. London", "3. Rome", "4. Berlin"}, 1),
            new Question("Which planet is known as the Red Planet?", new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}, 2),
            new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"1. Harper Lee", "2. Mark Twain", "3. J.K. Rowling", "4. Jane Austen"}, 1)
        };

        int score = 0;

        // Ask questions
        for (Question question : questions) {
            System.out.println(question.question);
            for (String choice : question.choices) {
                System.out.println(choice);
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Display final score
        System.out.println("You got " + score + " out of " + questions.length + " questions correct.");

        scanner.close();
    }
}
