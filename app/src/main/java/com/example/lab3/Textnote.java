package com.example.lab3;

public class Textnote  extends  Note{
    //Attribute
    public String textContent;
    //private String textContent;

    //getter Method
    public String getTextContent(){
        return textContent;
    }

    //setter Method
    public void setTextContent(String newContent){
        this.textContent = newContent;
    }

    //Method
    public String getSummary() {
        return title + ": " + textContent + " (" + createdDate + ")";
        //System.out.prinln(title + ": " + textContent + " (" + createdDate + ")");
    }

    public void setContents(String title, String content, String date) {
    }
}