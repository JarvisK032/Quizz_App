package com.example.quizzapp;

public class QuestionAnswer {

    public static String question[] ={
            "Find the average rate of change of the function f(x)=−3x^2+30x−69 on the interval [3,3+h].",
            "Find the slope of the tangent line to the graph of f(x)=2x+6 at x=−2.",
            "Find the average rate of change of the function f(x)=x^2−8x+22 on the interval [3,t].",
            "Given f(x)=−3x^2−6x−13 , find f′(3) using the definition of a derivative.",
            "Given f(x)=−2x−6, find f′(10) using the definition of a derivative."
    };

    public static String choices[][] = {
            {"12-3h","h","30-2h","0"},
            {"2","0","4","6"},
            {"t-10","t-5","0","2t-3"},
            {"-33","33","-24","-13"},
            {"-10","2","-2","-6"}
    };

    public static String correctAnswers[] = {
            "12-3h",
            "2",
            "t-5",
            "-24",
            "-2"
    };

}
