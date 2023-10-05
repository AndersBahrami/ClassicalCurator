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
public class Playlist{
    
    private String name;
    private int size;
    private PieceHeap music;

    public Playlist() {
        name = "";
        music = new PieceHeap();
        size = 0;
    }
    public Playlist(String name) {
        this.name = name;
        this.size = 0;
        this.music = new PieceHeap();
    }
    public Playlist(String name, PieceHeap music) {
        this.name = name;
        this.size = music.getSize();
        this.music = music;
    }
    public void add(Piece piece){
        music.add(piece);
        size += 1;
    }
    public void addWorks(ArrayList<Work> works){
        
        for (Work work : works){
            music.add(new Piece(work, work.getComposer()));
            size += 1;
        }
    }
    public void addComposers(ArrayList<Composer> composers){
        
        for (Composer composer : composers){
            music.add(new Piece(null, composer));
            size += 1;
        }
    }
    public void remove(Piece piece){
        music.remove(piece);
        size -= 1;
    }
    public boolean contains(Piece piece){
        //System.out.println("Duplicate :: " + music.getList().indexOf(piece));
        return music.getList().contains(piece);

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PieceHeap getMusic() {
        return music;
    }

    public void setMusic(PieceHeap music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
