import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    String[] selection =  new String[5];

    public QuestionService(){
        questions[0] = new Questions(1,"size of int","2","6","4","8","4");
        questions[1] = new Questions(2,"size of char","1","4","8","16","1");
        questions[2] = new Questions(3,"size of float","2","4","8","16","4");
        questions[3] = new Questions(4,"size of double","2","4","8","16","8");
        questions[4] = new Questions(5,"size of long","2","4","8","16","8");
    }
    public void PlayQuiz(){
        int i=0;
        for (Questions q : questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. "+q.getOpt1());
            System.out.println("2. "+q.getOpt2());
            System.out.println("3. "+q.getOpt3());
            System.out.println("4. "+q.getOpt4());
            System.out.print("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }
    }
    public void printScore(){
        int score =0 ;
        for(int i=0;i<questions.length;i++){
            Questions q = questions[i];
            String ActualAnswer = q.getAnswer();
            String UserAnswer = selection[i];
            if(ActualAnswer.equals(UserAnswer)){
                score++;
                System.out.println("Correct Answer for Question no. "+q.getId());
            } else {
                System.out.println("Wrong Answer for Question no. "+q.getId());
            }
        }
        System.out.println("Your score is: " + score + " out of " + questions.length);
    }
}