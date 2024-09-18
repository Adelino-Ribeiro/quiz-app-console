import java.util.Scanner;

public class QuestionService {

  Question[] questions = new Question[5];

  Integer selection[] = new Integer[5];

  public QuestionService () {

    questions[0] = new Question(1, "What is the most widely used programming language?", "Java", "Cpp", "Python", "C#", "Java");
    questions[1] = new Question(2, "Which language is known for its use in Android app development?", "Swift", "Cpp", "Python", "Java", "Java");
    questions[2] = new Question(3, "Which language is often used for web development?", "Java", "Python", "HTML", "C#", "HTML");
    questions[3] = new Question(4, "What language is famous for its use in machine learning?", "Cpp", "Python", "Ruby", "Java", "Python");
    questions[4] = new Question(5, "Which of these is a statically-typed language?", "JavaScript", "Ruby", "Python", "Java", "Java");
    // questions[5] = new Question(6, "Which language is known for its simplicity and readability?", "Python", "Java", "Cpp", "C#", "Python");
    // questions[6] = new Question(7, "What language is commonly used for system programming?", "Python", "C#", "Cpp", "Ruby", "Cpp");
    // questions[7] = new Question(8, "Which language is best known for its use in game development?", "Java", "C#", "Python", "Cpp", "Cpp");
    // questions[8] = new Question(9, "Which language is primarily used for building Windows applications?", "Python", "Cpp", "C#", "Java", "C#");
    // questions[9] = new Question(10, "Which of these is a cross-platform language?", "Swift", "Kotlin", "Java", "HTML", "Java");

  }

  public void playQuiz () {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;

    for (Question q : questions) {

        System.out.println("Question no. : " + q.getId());
        System.out.println(q.getQuestion());
        System.out.println("1. " + q.getOpt1());
        System.out.println("2. " + q.getOpt2());
        System.out.println("3. " + q.getOpt3());
        System.out.println("4. " + q.getOpt4());
        System.out.print("Your answer: ");
        selection[i] = sc.nextInt();
        i++;
    }

    sc.close();

    // for (String s : selection) {

    //     System.out.print(s + " ");

    // }


  }

  public void printScore () {

    int score = 0;

    for (int i = 0; i < questions.length; i++) {

        Question question = questions[i];

        String actualAnswer = question.getAnswer();

        String userAnswer = "";
            switch (selection[i]) {
                case 1:
                    userAnswer = question.getOpt1();
                    break;
                case 2:
                    userAnswer = question.getOpt2();
                    break;
                case 3:
                    userAnswer = question.getOpt3();
                    break;
                case 4:
                    userAnswer = question.getOpt4();
                    break;
                default:
                    System.out.println("Invalid selection for question " + (i + 1));
                    continue;
            }
        

        if (actualAnswer.equals(userAnswer)) score++;

    }

    System.out.println("Your score is: " + score + "/" + questions.length);

  }

}