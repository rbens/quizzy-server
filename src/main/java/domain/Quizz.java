package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rabah on 18/06/18.
 */
public class Quizz {

    private long id;

    private final List<Question> questions;


    private Quizz(List<Question> questions) {
        this.questions = questions;
    }

    public static Quizz createQuizz(int numberOfquestion){
        return new Quizz(new ArrayList<>());
    }

    public Quizz addQuestion(Question ... question){
         this.questions.addAll(Arrays.asList(question));
         return this;
    }
}
