package com.quizquizapps.asus.quizapplication;

public class SciQuestion {

    private String SQuestion[]={
            "Brass gets discoloured in air because of the presence of which \n" +
                    "of the following gases in air?",
            "Which of the following is a non metal that remains liquid at \n" +
                    "room temperature?",
            "Which of the following is used in pencils?",
            "Which of the following metals forms an amalgam with other \n" +
                    "metals?",
            "The inert gas which is substituted for nitrogen in the air used \n" +
                    "by deep sea divers for breathing, is"
    };

    private String SChoices[][]={
            {"Oxygen","Hydrogen sulphide","Carbon dioxide","Nitrogen"},
            {"Phosphorous","Chlorine","Helium","Bromine"},
            {"Graphite","Silicon","Charcoal","Phosphorous"},
            {"Tin","Lead","Mercury","Zinc"},
            {"Argon","Xenon","Helium","Krypton"},
    };

    private String SCorrectAns[]={"Hydrogen sulphide","Bromine","Graphite","Mercury","Helium"};

    public String getQuestion(int a){
        String question=SQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=SChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=SChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=SChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=SChoices[a][3];
        return choice3;
    }

    public String getCorrectAns(int a){
        String answer=SCorrectAns[a];
        return answer;
    }
}
