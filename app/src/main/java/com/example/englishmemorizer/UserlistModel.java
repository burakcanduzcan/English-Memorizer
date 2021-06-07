package com.example.englishmemorizer;

public class UserlistModel {

    private int id;
    private String category;
    private String word;
    private String definition;
    private String exampleSentence;
    private String synonyms;
    private String antonyms;
    private String imagePath;

    public UserlistModel(int id, String category, String word, String definition, String exampleSentence, String synonyms, String antonyms, String imagePath) {
        this.id = id;
        this.category = category;
        this.word = word;
        this.definition = definition;
        this.exampleSentence = exampleSentence;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
        this.imagePath = imagePath;
    }

    public UserlistModel() {
    }

    @Override
    public String toString() {
        return word + " (" + category + ")";
        /*
        return "UserlistModel{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", exampleSentence='" + exampleSentence + '\'' +
                ", synonyms='" + synonyms + '\'' +
                ", antonyms='" + antonyms + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
                */
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExampleSentence() {
        return exampleSentence;
    }

    public void setExampleSentence(String exampleSentence) {
        this.exampleSentence = exampleSentence;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(String antonyms) {
        this.antonyms = antonyms;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
