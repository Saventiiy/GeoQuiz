package com.bignerdranch.android.geoquiz;

public class Question {
    private int textResId;
    private boolean answer;

    Question(int textResId, boolean answer){
        this.textResId = textResId;
        this.answer = answer;
    }

    public int getTextResId(){
        return textResId;
    }

    public void setTextResId(int textResId){
        this.textResId = textResId;
    }

    public boolean getAnswer(){
        return answer;
    }

    public void setAnswer(boolean answer){
        this.answer = answer;
    }

}
