/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classicalcurator;

import java.util.ArrayList;

/**
 *
 * @author andersbahrami
 */
public class PieceHeap {
    private ArrayList<Piece> list;
    private ArrayList<Piece> reversedList;
    private int size;

    public PieceHeap()
    {
        list = new ArrayList<Piece>();
        reversedList = new ArrayList<Piece>();
        
    }
    
    public PieceHeap(ArrayList<Piece> pieces)
    {
        list = pieces;
        
    }
    
    public ArrayList<Piece> getList(){
        return list;
    }
    
    public void add(Piece piece)
    {
        if (piece != null){
            list.add(piece);
            size++;
            //System.out.println("heeehheehhh " + list.toString() + " yee " + piece.getWork().getTitle());
            swapUp(list.size()-1);
        }
    }

    public void swapUp(int bot)
    {
        //int index = idx;
        
        if (bot == 0)
            return;
        
        int parent = (int)Math.floor((bot - 1)/2.0);
        if (getVal(list.get(bot)) > getVal(list.get(parent))){
            swap(parent, bot);
            swapUp(parent);
        }
        else {
            return;
        }
    }

    public Piece remove()
    {
        Piece temp = list.get(0);
        list.set(0,list.get(list.size()-1));
        list.remove(list.size() - 1);
        size--;
        swapDown(0);
        return temp;
    }
    
    public Piece remove(Piece piece)
    {
        int idx = list.indexOf(piece);
        //System.out.println("index: " + idx);
        Piece temp = list.get(idx);
        
        //Piece removed = list.remove(idx);
        list.set(idx,list.get(list.size()-1));
        list.remove(list.size() - 1);
        size--;
        swapDown(idx);
        return temp;
    }

    public void swapDown(int top)
    {
        int left = 2*top + 1;
        int right = 2*top + 2;
        if (2*top + 1 > list.size() - 1)
            return;
        else if (2*top + 2 > list.size() - 1)
        {
            right = 2*top+1;
        }
        
        int max = 0;
        if (Math.max(getVal(list.get(left)), getVal(list.get(right))) == getVal(list.get(left))){
            max = left;
        }
        else
            max = right;
        
        //int parent = (int)Math.floor((top - 1)/2.0);
        if (getVal(list.get(max)) > getVal(list.get(top))){
            swap(max, top);
            swapDown(max);
        }
        else {
            return;
        }
        
    }
	
    private void swap(int start, int finish)
    {
        Piece startPiece = list.get(start);
        list.set(start, list.get(finish));
        list.set(finish, startPiece);
    }
    
    public void print()
    {
        String output = "";
        
        for (int i = 0; i < list.size(); i++){
            int level = (int)(Math.log(i + 1) / Math.log(2)) + 1;
            int numLevels = (int)((Math.log(list.size()) / Math.log(2)) + 1);
            
            if (((double)((int)(Math.log(i + 1) / Math.log(2)) + 1)) == (Math.log(i + 1) / Math.log(2)) + 1){
                output += "\n";
                int L = numLevels - level + 1;
                String spaces = String.format("%" + L + "s", "");
                output += spaces;
            }
            
            output += list.get(i) + " ";
            
        }
        System.out.println("PRINTING THE HEAP!" + output + "\n\n");
    }
    
    //REWRITE SO IT ACTUALLY WORKS WITH THIS!!!!!!!!!!!!!!!!!
    public void heapSort(Piece[] pieces)
    {
    // Add the values from the array to the heap
    // Sort the list to a seperate structure
    // Reassign the sorted structure to <list>
        PieceHeap heap = new PieceHeap();
        for (Piece piece : pieces){
            heap.add(piece);
    }
        int size = heap.getList().size();
        for (int i = 0; i < size; i++){
            list.add(heap.remove());
        }
    }
    
    public int getVal(Piece piece){
        if (piece.getWork() != null)
            return piece.getWork().getTitle().charAt(0);
        else 
            return piece.getComposer().getName().charAt(0);
    }
     
    public void setReversedList(){
        for (int i = list.size() - 1; i > -1; i--){
            reversedList.add(list.get(i));
        }
    }

    public int getSize() {
        return size;
    }
    
    

    public String toString()
    {
        return list.toString();
    }
}
