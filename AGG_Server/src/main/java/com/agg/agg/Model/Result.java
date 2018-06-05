package com.agg.agg.Model;
import javax.persistence.*;

import java.util.LinkedList;

import java.util.List;



@Entity

@Table(name = "result")

public class Result {


    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private int id;


    @Column(name = "teamname", nullable = false)

    private String teamname;


    @Column(name = "avReuslt", nullable = false)

    private Double avReuslt;


    @Column(name = "tvReuslt", nullable = false)

    private Double tvReuslt;


    @Column(name = "exeReuslt", nullable = false)

    private Double exeReuslt;


    @Column(name = "finalResult", nullable = false)

    private Double finalResult;

    @Column(name = "sensorResult", nullable = false)

    private Double sensorResult;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAvReuslt() {
        return avReuslt;
    }

    public Double getExeReuslt() {
        return exeReuslt;
    }

    public Double getTvReuslt() {
        return tvReuslt;
    }

    public String getTeamname() {
        return teamname;
    }

    public Double getSensorResult() {
        return sensorResult;
    }

    public void setSensorResult(Double sensorResult) {
        this.sensorResult = sensorResult;
    }

    public Double getFinalResult() {
        return finalResult;
    }

    public void setAvReuslt(Double avReuslt) {
        this.avReuslt = avReuslt;
    }

    public void setTvReuslt(Double tvReuslt) {
        this.tvReuslt = tvReuslt;
    }

    public void setExeReuslt(Double exeReuslt) {
        this.exeReuslt = exeReuslt;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void setFinalResult(Double finalResult) {
        this.finalResult = finalResult;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
