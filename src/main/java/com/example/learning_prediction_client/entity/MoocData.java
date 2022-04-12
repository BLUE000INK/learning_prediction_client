package com.example.learning_prediction_client.entity;

public class MoocData {
    private Long id;

    private String codeModule;

    private String codePresentation;

    private String idStudent;

    private String gender;

    private String region;

    private String highestEducation;

    private String imdBand;

    private String ageBand;

    private String numOfPrevAttempts;

    private String studiedCredits;

    private String disability;

    private String finalResult;

    private String modulePresentationLength;

    private String sumClick;

    private Float score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeModule() {
        return codeModule;
    }

    public void setCodeModule(String codeModule) {
        this.codeModule = codeModule == null ? null : codeModule.trim();
    }

    public String getCodePresentation() {
        return codePresentation;
    }

    public void setCodePresentation(String codePresentation) {
        this.codePresentation = codePresentation == null ? null : codePresentation.trim();
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent == null ? null : idStudent.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }

    public String getImdBand() {
        return imdBand;
    }

    public void setImdBand(String imdBand) {
        this.imdBand = imdBand == null ? null : imdBand.trim();
    }

    public String getAgeBand() {
        return ageBand;
    }

    public void setAgeBand(String ageBand) {
        this.ageBand = ageBand == null ? null : ageBand.trim();
    }

    public String getNumOfPrevAttempts() {
        return numOfPrevAttempts;
    }

    public void setNumOfPrevAttempts(String numOfPrevAttempts) {
        this.numOfPrevAttempts = numOfPrevAttempts == null ? null : numOfPrevAttempts.trim();
    }

    public String getStudiedCredits() {
        return studiedCredits;
    }

    public void setStudiedCredits(String studiedCredits) {
        this.studiedCredits = studiedCredits == null ? null : studiedCredits.trim();
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability == null ? null : disability.trim();
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult == null ? null : finalResult.trim();
    }

    public String getModulePresentationLength() {
        return modulePresentationLength;
    }

    public void setModulePresentationLength(String modulePresentationLength) {
        this.modulePresentationLength = modulePresentationLength == null ? null : modulePresentationLength.trim();
    }

    public String getSumClick() {
        return sumClick;
    }

    public void setSumClick(String sumClick) {
        this.sumClick = sumClick == null ? null : sumClick.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}