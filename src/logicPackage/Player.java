package logicPackage;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.io.*;

public class Player implements Serializable{
    IconVariables iconVar = new IconVariables();
    
    private String name = "Игрок";
    public String getName(){return name;}
    public void setName(String s){name= s;}
    
    private int budget = 1000;
    public int getBudget(){return budget;}
    public void setBudget(int i){budget= i;}
    
    private int winAndLuseSize = 0;
    public int getWinAndLuseSize(){return winAndLuseSize;}
    public void setWinAndLuseSize(int i){winAndLuseSize= i;}
    
    private int currentRate = 25;
    public int getCurrentRate() {return currentRate;}
    public void setCurrentRate(int i) {currentRate = i;}
    
    private int allStav=0;
    public int getAllStav (){return allStav;}
    public void setAllStav(int i){allStav= i;}
    
    private String profileIcon=iconVar.jokerPlayerIcon;
    public String getProfileIcon (){return profileIcon;}
    public void setProfileIcon(String s){profileIcon= s;}
    
    //Установка имени, размера бюджета и иконки профиля на mainframe
    public void playerSetLabelText(JLabel nameL, JLabel BetSizeL,JButton button){
        nameL.setText(getName());
        BetSizeL.setText("Бюджет: "+Integer.toString(getBudget()));
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource(getProfileIcon())));
    }
}
