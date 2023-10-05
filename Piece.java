/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classicalcurator;

import javax.swing.ImageIcon;

/**
 *
 * @author andersbahrami
 */
public class Piece {
    
    private Work work;
    private Composer composer;
    private String duplicateChecker;
    //private String sheetMusicLink;
    //private ImageIcon sheetMusic;

    public Piece() {
        String workTitle = "";
        String composerName = "";
        
        if (work != null)
            workTitle = work.getTitle();
        
        if (composer != null)
            composerName = composer.getName();
        
        duplicateChecker = workTitle+composerName;
    }
    
    public Piece(Work work, Composer composer) {
        this.work = work;
        this.composer = composer;
        
        String workTitle = "";
        String composerName = "";
        
        if (work != null)
            workTitle = work.getTitle();
        
        if (composer != null)
            composerName = composer.getName();
        
        duplicateChecker = workTitle+composerName;
    }
    
    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
        
        String workTitle = "";
        String composerName = "";
        String input = "";
        
        if (work != null)
            workTitle = work.getTitle();
        
        if (composer != null)
            composerName = composer.getName();
        
        input = workTitle+composerName;
        
        setDuplicateChecker(input);
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
        
        String workTitle = "";
        String composerName = "";
        String input = "";
        
        if (work != null)
            workTitle = work.getTitle();
        
        if (composer != null)
            composerName = composer.getName();
        
        input = workTitle+composerName;
        
        setDuplicateChecker(input);
    }

    public String getDuplicateChecker() {
        return duplicateChecker;
    }

    public void setDuplicateChecker(String duplicateChecker) {
        this.duplicateChecker = duplicateChecker;
    }
    
    
    public String toString(){
        String output = "";
        
        if(work == null && composer == null){
            output = "";
        }
        else if (work != null && composer != null)
            output = work.getTitle() + " by: " + composer.getName();
        else if (work == null && composer != null){
            output = composer.getComplete_name();
        }
        return output;
    }
    
}
