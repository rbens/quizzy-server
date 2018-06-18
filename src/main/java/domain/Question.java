package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rabah on 10/10/17.
 */
public class Question {

    private final long id;
    private final List<Response> responses;
    private final int numberOfResponses;


    public Question(long id, int numberOfResponses) {
        this.id = id;
        this.numberOfResponses = numberOfResponses;
        responses = new ArrayList<Response>(numberOfResponses);
    }

    public List<Response> getResponses() {
        return responses;
    }

    public Question addresponse(Response response) {
        if (responses.size() >= numberOfResponses) {
            throw new UnsupportedOperationException("Number of questions exceed the questions sizes defined : " + this.responses.size());
        }
        responses.add(response);
        return this;
    }


}
