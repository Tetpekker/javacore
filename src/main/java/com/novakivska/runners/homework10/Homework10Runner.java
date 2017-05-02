package com.novakivska.runners.homework10;

import com.novakivska.app.homework.homework10.ArrayParser;
import com.novakivska.app.homework.homework10.CharsExtractor;
import com.novakivska.app.homework.homework10.KeywordReplace;

/**
 * Created by Tas_ka on 5/2/2017.
 */
public class Homework10Runner {

    public static void main(String[]args){

        KeywordReplace keywordReplace = new KeywordReplace();
        CharsExtractor charsExtractor = new CharsExtractor();
        ArrayParser arrayParser = new ArrayParser();

        keywordReplace.extract();
        charsExtractor.extract();
        arrayParser.sortArray();
    }
}
