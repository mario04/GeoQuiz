package com.example.geoquiz;

/**
 * Created by Alex on 21/07/14.
 */
public class TrueFalse {

    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion=question;
        mTrueQuestion=trueQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }
}
