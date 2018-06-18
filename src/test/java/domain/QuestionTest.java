package domain;

import org.junit.Test;

/**
 * Created by rabah on 15/06/18.
 */
public class QuestionTest {


    @Test(expected = Exception.class)
    public void responseListExceedSize() throws Exception {
        Question question = new Question(2, 2);
        question.addresponse(new Response()).addresponse(new Response()).addresponse(new Response());
    }

}