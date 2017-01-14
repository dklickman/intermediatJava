package college;

// Author David Klickman
// 20161201 
// itse2317003007-asg11
public class Automobile {
    private String abMake;
    private String abModel;
    private String abColor;
    private String bondGirlNeeded;
    
    public Automobile() { 
        abMake = "";
        abModel = "";
        abColor = "";
        bondGirlNeeded = "";
    }
    
    public Automobile(String abMake, String abModel, String abColor, String bondGirlNeeded)
    {
        this.abMake = abMake;
        this.abModel = abModel;
        this.abColor = abColor;
        this.bondGirlNeeded = bondGirlNeeded;
    }
    public void setAbMake(String abMake) {
        this.abMake = abMake;
    }
    public String getAbMake() {
        return abMake;
    }
    
    public void setAbModel(String abModel) {
        this.abModel = abModel;
    }
    public String getAbModel() {
        return abModel;
    }
    
    public void setAbColor(String abColor) {
        this.abColor = abColor;
    }
    public String getAbColor() {
        return abColor;
    }
    
    public void setBondGirlNeeded(String bondGirlNeeded) {
        this.bondGirlNeeded = bondGirlNeeded;
    }
    public String getBondGirlNeeded() {
        return bondGirlNeeded;
    }
    
} // end class Aircraft.java

