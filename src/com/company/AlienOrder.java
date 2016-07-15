package com.company;

import java.util.*;

/**
 * Created by dangineering on 7/13/16.
 */
public class AlienOrder {

    public String alienOrder(String[] words) {
        // step 1-- construct graph
        // step 2 -- contruct order
        // step 3 -- traverse graph

        //Initialize graph
        HashMap<Character, Character> map = new HashMap<>();


        for(int i = 0; i < words.length; i++){
            //Note:We need to go through all characters, not only the first character.

            for(int j = 0; j < words[i].length(); j++){

                if(!map.containsKey(words[i].charAt(j))){
                    map.put(words[i].charAt(j), null);
                }
            }
            // we have created a hashset for every letter we found in the words.

            if(i > 0){
                order(map, words[i-1], words[i]);
            }
        }
        //Traverse to find Order
        return topSort(map);
    }


    public String topSort(HashMap<Character, Character> graph){
        Queue<Character> queue = new LinkedList<Character>();
        Map<Character, Integer> indegree = new HashMap<Character, Integer>();

        StringBuilder sb = new StringBuilder();

        //Build indegree graph
        for(char c: graph.keySet()){

            Character a = graph.get(c);
            if (a == null) continue;

            int count = indegree.containsKey(a)?indegree.get(a)+1:1;
            indegree.put(a,count);

        }
        //Find the indegree zero -- smallest character
        for(char c: graph.keySet()){
            if(!indegree.containsKey(c)){
                queue.offer(c);
            }
        }

        while(!queue.isEmpty()){
            char c = queue.poll();
            sb.append(c);

            Character a = graph.get(c);
            if (a == null) continue;


            indegree.put(a, indegree.get(a)-1);
            if(indegree.get(a) == 0){
                queue.offer(a);
            }

        }

        for(int a: indegree.values()){
            if(a != 0){
                return "";
            }
        }

        return sb.toString();
    }


    // we are taking in the previous word and current word and then the map.
    // the contents of the map are the character that come later in the alphabet then the key
    // find where they first diverge then add that to map.

    public void order(HashMap<Character,Character> map, String prev, String curr){

        int minlength = Math.min(prev.length(), curr.length());


        for(int i = 0; i< minlength; i++){

            char p = prev.charAt(i);
            char c = curr.charAt(i);

            if(p != c){
                map.put(p, new Character(c));
//                System.out.println("the size of the map.get(p) for P: " + p + " " +
//                map.get(p).size());
                break;
            }
        }
    }
}
