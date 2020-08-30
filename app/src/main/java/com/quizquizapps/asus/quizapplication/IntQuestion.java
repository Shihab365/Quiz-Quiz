package com.quizquizapps.asus.quizapplication;

public class IntQuestion {

    public String banQues[]={
      "What runs between the North Sea and the Atlantic Ocean ?",
      "Congo River in Africa is how many miles long ?",
      "Out of the following which country does not have a river ?",
      "Which planet in the Solar System has highest density?",
      "Which team won the IPL (2009)?",
            "Which cricketer had scored fastest century in ODI cricket?",
      "Which cricketer had scored highest individual score in ODI cricket?",
      "Who cricketer has recorded maximum sixes in Test cricket?",
      "Which cricketer has recorded maximum sixes in international cricket?",
      "Since which year Basketball has been a regular Olympic event ?",
      "What was the name of the mascot for the 1992 Olympic games?",
      "In which year were women allowed to participate in modern Olympic Games?",
      "In which year Ranji Trophy tournament was launched in India?",
      "Who of the following bowler is the highest wicket taker in test cricket?",
      "The inaugural Cricket World Cup was hosted in 1975 by?",
      "Which of the following country won the first one day cricket world cup?",
      "Which country successfully test-launched its first hypersonic aircraft?",
      "Which space agency is going to build a quiet supersonic manned plane?"
    };

    private String banOpt[][]={
            {"Labrador Sea","James Bay","The English Channel","Greenland Sea"},
            {"2720","3720","2270","3270"},
            {"Bahamas","Tonga","Yemen","All of them"},
            {"Earth","Uranus","Neptune","Jupiter"},
            {"Deccan Chargers","Chennai Super Kings","Kolkata Knight Riders","Delhi Daredevils"},
            {"Vivian Richards","Corey Anderson","Shahid Afridi","AB de Villiers"},
            {"Virender Sehwag","Chris Gayle","Martin Guptill","Rohit Sharma"},
            {"Adam Gilchrist","Brendon McCullum","Chris Gayle","Jack Kallis"},
            {"Sanath Jayasuriya","Chris Gayle","Sachin Tendulkar","Shahid Afridi"},
            {"1972","1990","1936","None of the above"},
            {"Bear","Elk","Beaver","Cobi"},
            {"1900, Paris","1924, Chamonix","1904, St Louis","1924, Paris"},
            {"1924","1934","1944","1954"},
            {"Muttiah Muralitharan","Shane Warne","Anil Kumble","Glenn McGrath"},
            {"India","Pakistan","Australia","England"},
            {"India","Australia","Pakistan","West Indies"},
            {"US","Russia","China","India"},
            {"ISRO","Roscosmos ","NASA","CSA"},
    };

    private String banAns[]={
            "The English Channel","2720","Tonga","Earth","Deccan Chargers","AB de Villiers","Rohit Sharma","Brendon McCullum","Shahid Afridi","1936","Cobi","1900, Paris","1934","Muttiah Muralitharan","England","West Indies","China","NASA"
    };

    public String getQues(int a){
     String question=banQues[a];
     return question;
    }

    public String getOpt1(int a){
        String options=banOpt[a][0];
        return options;
    }
    public String getOpt2(int a){
        String options=banOpt[a][1];
        return options;
    }
    public String getOpt3(int a){
        String options=banOpt[a][2];
        return options;
    }
    public String getOpt4(int a){
        String options=banOpt[a][3];
        return options;
    }

    public String getAns(int a){
        String answer=banAns[a];
        return answer;
    }
}
