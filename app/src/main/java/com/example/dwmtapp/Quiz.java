package com.example.dwmtapp;

public class Quiz {
    public int id;
    public String Question;
    public String Answer1;
    public String Answer2;
    public String Answer3;
    public String Answer4;
    public int Rightans;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }
    public String getQuestion() {
        return Question;
    }

    public void setAnswer1(String Answer1) {
        this.Answer1 = Answer1;
    }
    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer2(String Answer2) {
        this.Answer2 = Answer2;
    }
    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer3(String Answer3) {
        this.Answer3 = Answer3;
    }
    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer4(String Answer4) {
        this.Answer4 = Answer4;
    }
    public String getAnswer4() {
        return Answer4;
    }

    public void setRightans(int Rightans) {
        this.Rightans = Rightans;
    }
    public int getRightans() {
        return Rightans;
    }
}
