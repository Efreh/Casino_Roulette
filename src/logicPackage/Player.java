package logicPackage;

public class Player {
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
}
