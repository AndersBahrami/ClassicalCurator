/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classicalcurator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andersbahrami
 */
public class MusicalInformation {
    
    private List<Composer> composers;
    private Composer composer;
    private List<Work> works;
    private Work work;
    private List<Piece> results; //0th index contains only composer and no work
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public List<Composer> getComposers() {
        return composers;
    }

    public void setComposers(List<Composer> composers) {
        this.composers = composers;
    }

    public List<Piece> getResults() {
        return results;
    }

    public void setResults(List<Piece> results) {
        this.results = results;
    }
    
    @Override
    public String toString() {
        return "composers: " + composers.get(0).getComplete_name() + ", " + composers.get(1).getId() + '}';
    }
    
}
