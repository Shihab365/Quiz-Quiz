package com.quizquizapps.asus.quizapplication;

public class EntQuestion {

    private String EQuestion[]={
            "The Headquarters of the Food and Agricultural Organisation\n" +
                    "(FAO) is at:",
            "World Trade Organization(WTO) was started in the year of:",
            "Which of the following is not associated with the UN \n" +
                    "organisation?",
            "Where is the headquarters of European Union located?",
            "The number of judges in the International Court of Justice is -"
    };

    private String EChoices[][]={
            {"New York","Paris","Geneva","Rome"},
            {"1984","1994","1995","1996"},
            {"ILO","WHO","FAO","ASEAN"},
            {"London","Paris","Brussels","Bonn"},
            {"11","15","18","7"},
    };

    private String ECorrectAns[]={"Rome","1995","ASEAN","Brussels","15"};

    public String getQuestion(int a){
        String question=EQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=EChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=EChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=EChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=EChoices[a][3];
        return choice3;
    }

    public String getCorrectAns(int a){
        String answer=ECorrectAns[a];
        return answer;
    }
}
