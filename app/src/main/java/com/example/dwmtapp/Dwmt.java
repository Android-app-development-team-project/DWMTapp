package com.example.dwmtapp;



import java.util.Random;


public class Dwmt {
    //메트로놈 횟수 기록 관련
    private static int metroRepeat;
    //문제 생성 관련
    private int answertype;
    private int userans;
    private int rightans;
    private Random random;
    //점수 계산 관련
    private int corrects;
    private int dwmtScore;



    public Dwmt(int answertype, int userans, int rightans){
        this.answertype = answertype;
        this.userans = userans;
        this. rightans = rightans;
        random = new Random();
    }

    public void createDWMT(){
        if(answertype == 1){//OX 문제만 할때
            //quizList 테이블에서 짝수행만 가져옴

        }
        if(answertype == 2){//4지선다 문제만 할때
            //quizList 테이블에서 홀수행만 가져옿

        }
        else{//모든 문제를 할때
            //quizList 테이블 전체를 가져옴

        }





    }










}
