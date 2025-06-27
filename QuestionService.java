public class QuestionService {

    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] = new Questions(1,"size of int","2","6","4","8","4");
        questions[1] = new Questions(2,"size of char","2","4","8","16","2");
        questions[2] = new Questions(3,"size of float","2","4","8","16","4");
        questions[3] = new Questions(4,"size of double","2","4","8","16","8");
        questions[4] = new Questions(5,"size of long","2","4","8","16","8");
    }
    public void displayQuestions(){
        
        for (Questions q : questions){
            System.out.println(q);
        }
    }
}