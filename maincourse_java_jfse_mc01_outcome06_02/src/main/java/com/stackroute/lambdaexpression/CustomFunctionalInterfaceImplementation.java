package com.stackroute.lambdaexpression;

import java.util.ArrayList;
public class CustomFunctionalInterfaceImplementation {
        MyFunction<Integer> cube = (Integer num) ->{
            return num*num*num;
        };
        MyFunction <String> changecase = (String str) ->{
            if(str!=null){
                char [] string = str.toCharArray();
                for(int i=0;i<str.length();i++){
                    if(Character.isLowerCase(string[i])){
                        string[i] = Character.toUpperCase(string[i]);
                    }else{
                        string[i] = Character.toLowerCase(string[i]);
                    }
                }
                return new String(string);
            }else{
                return null;
            }
        };

}
