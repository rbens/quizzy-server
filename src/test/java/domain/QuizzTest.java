package domain;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rabah on 18/06/18.
 */
public class QuizzTest {

    @Test
    public void createQuizzTest(){
        Quizz quizz = Quizz.createQuizz(10);
        Assert.assertNotNull(quizz);
    }

    @Test
    public void addQuestionTest(){

    }


}