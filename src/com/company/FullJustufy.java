package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dangineering on 7/14/16.
 */
public class FullJustufy {
    public static class Word {
        String word;
        int spaces;

        public Word(String word, int spaces) {
            this.word = word;
            this.spaces = spaces;
        }

        public int getSpaces() {
            return this.spaces;
        }

        public String getWord() {
            return this.word;
        }

        public void addSpace() {
            this.spaces++;
        }
    }

    private String insertLastLine(List<Word> words, int L) {
        StringBuilder sb = new StringBuilder();
        int currentLength = 0;
        for (int i=0; i<words.size(); i++) {
            String word = words.get(i).getWord();
            sb.append(word);
            currentLength = currentLength + word.length();
            if (i==words.size()-1) {
                while (currentLength<L) {
                    sb.append(" ");
                    currentLength = currentLength + 1;
                }
            } else {
                sb.append(" ");
                currentLength = currentLength + 1;
            }
        }
        return sb.toString();
    }

    private String insertWhitespace(List<Word> words, int currentLength, int maxLength) {
        StringBuilder sb = new StringBuilder();
        int spaces = maxLength-currentLength;
        if (words.size()==1) {
            for (int i=0; i<spaces; i++) {
                words.get(0).addSpace();
            }
        } else {
            // the last word gets 0 spaces
            while (spaces>0) {
                for (int j=0; j<words.size()-1; j++) {
                    if (spaces>0) {
                        words.get(j).addSpace();
                        spaces--;
                    }
                }
            }
        }

        for (Word word : words) {
            sb.append(word.getWord());
            for (int j=0; j<word.getSpaces(); j++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public List<String> fullJustify1(String[] words, int L) {
        List<String> results = new ArrayList<String>(); //good

        if (words==null||words.length==0) {
            return results;
        }

        int currentLength = 0;
        List<Word> list = new ArrayList<Word>();

        for (int i=0; i<words.length; i++) {
            String newWord = words[i];

            int newLength = currentLength+newWord.length();

            //count required whitespaces between words

            int newSpaces = list.size();
            //if this word has to be in the next line
            if (newLength+newSpaces>L) {
                //handle current line
                String line = insertWhitespace(list, currentLength, L);
                results.add(line);

                list.clear();
                currentLength = 0;
            }

            Word word = new Word(newWord, 0);
            list.add(word);
            currentLength = currentLength + newWord.length();

            //handle last line
            if (i==words.length-1) {
                String line = insertLastLine(list, L);
                results.add(line);
            }
        }
        return results;
    }
}
