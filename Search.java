/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search;

/**
 *
 * @author hp
 */
import java.util.*;
public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }   
    
}
