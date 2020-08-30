package com.quizquizapps.asus.quizapplication;

public class QActivity {

    private String QQuestion[]={
            "In which year did Maradona score a goal with his hand?",
            "How matches did Mohammed Ali lose in his career?",
            "What was the Olympic city of 1992?",
            "What is the national sport in Japan?",
            "What is the largest stadium in the world?",
            "Which device do we use to look at the stars?",
            "What are the three primary colors?",
            "Which planet is nearest the sun?",
            "Who was the inventor of the steam engine?",
            "Who is the father of the atomic bomb?",
            "Who is the first person to reach Mount Everest?",
            "Who is the first person to reach North Pole?",
            "Which is the first country to issue paper currency?",
            "Who is the first President of the U.S.A.?",
            "Which is the first country to win football World cup? ",
            "Which is the first country to prepare a constitution?",
            "Who was the first person to fly aero plane?",
            "Which was the first city on which the atom bomb was-",
            "Who was the first person to land on the moon?",
            "Who was the first woman to climb Mount Everest?",
            "Who gave the name ‘Computer Virus’?",
            "Who is regarded as Father of Wi-Fi?"
    };

    private String QChoices[][]={
            {"1950","1974","1986","2018"},
            {"Only one Match","No match","Only Ten Matches","Every matches"},
            {"Texas","London","Spain","Barcelona"},
            {"Tennis","Volleyall","Wrestling","Sumo Wrestling"},
            {"SBNCS","Azteca Stadium","Michigan Stadium","MCG"},
            {"Camera","Telescope","Sun Glasses","Microscope"},
            {"Orange,white,Blue","White,Fade,Green","Pink,Black,Red","Blue,yellow,Red"},
            {"Mercury","Venus","Earth","Mars"},
            {"Albert Einstein","Isaac Newton","James Watt","John Carry"},
            {"Albert Einstein","Jagdish Chandra Bose","Robert Oppenheimer","Thomas Perry"},
            {"Sherpa Tensing","Rajesh Sharma","Charles Hillary","Johan don"},
            {"Robert Peary","Rajesh Sharma","Charles Hillary","Johan"},
            {"UK","USA","China","India"},
            {"Robert Walpole","George Washington","Henry Waterloo","George Bush"},
            {"India","Brazil","Portugal","Uruguay"},
            {"U.S.A.","India","USA","UK"},
            {"Henry Waterloo","George Bush","Wright Brothers","Robert Walpole"},
            {"Hiroshima","Singapore","Pataya ","Canada"},
            {"Taylor","Robert Walpole","Roberto","Neil Armstrong"},
            {"Mrs. Junko Tabei","Hilary","Katrina Joy","Michel"},
            {"Chad Hurley","Steve Chen","Jawed Karim","Dr. Fred Kohen"},
            {"Vic Hayes","Larry Page","Sergey Brin","Steve Chen"},
    };

    private String QCorrectAns[]={"1986","Only one Match","Barcelona","Sumo Wrestling","Azteca Stadium","Telescope","Blue,yellow,Red","Mercury","James Watt","Robert Oppenheimer","Sherpa Tensing","Robert Peary","China","George Washington","Uruguay","U.S.A.","Wright Brothers","Hiroshima","Neil Armstrong","Mrs. Junko Tabei","Dr. Fred Kohen","Vic Hayes"};

    public String getQuestion(int a){
        String question=QQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=QChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=QChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=QChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3=QChoices[a][3];
        return choice3;
    }

    public String getCorrectAns(int a){
        String answer=QCorrectAns[a];
        return answer;
    }
}
