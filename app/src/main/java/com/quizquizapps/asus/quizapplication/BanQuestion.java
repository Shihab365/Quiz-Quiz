package com.quizquizapps.asus.quizapplication;

public class BanQuestion {

    private String BQuestion[]={
      "Which type of government in Bangladesh?",
      "Which is the capital of Bangladesh?",
      "Over 90% of Bangladesh is on average what height above sea level?",
      "Calling code of Bangladesh?",
      "Which district of Bangladesh was part of Assam?"
    };

    private String BChoices[][]={
            {"Republic","Kingdom","Non-Republic","Military Based"},
            {"Rangpur","Barishal","Dhaka","Sylhet"},
            {"8 meters","10 metres","28 meters","15 meters"},
            {"+91","+880","+1","+44"},
            {"Dhaka","Chottogram","Noakhali","Sylhet"},
    };

    private String BCorrectAns[]={"Republic","Dhaka","10 metres","+880","Sylhet"};

    public String getQuestion(int a){
        String question=BQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=BChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=BChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=BChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=BChoices[a][3];
        return choice3;
    }

    public String getCorrectAns(int a){
        String answer=BCorrectAns[a];
        return answer;
    }
}
