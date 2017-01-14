package college;

// Author David Klickman
// 20161201 
// itse2317003007-asg11
public class Aircraft {
    private String acMake;
    private String acModel;
    private String acColor;
    private String pilotNeeded;
    
    public Aircraft() { 
        acMake = "";
        acModel = "";
        acColor = "";
        pilotNeeded = "";
    }
    
    public Aircraft(String acMake, String acModel, String acColor, String pilotNeeded)
    {
        this.acMake = acMake;
        this.acModel = acModel;
        this.acColor = acColor;
        this.pilotNeeded = pilotNeeded;
    }
    public void setAcMake(String acMake) {
        this.acMake = acMake;
    }
    public String getAcMake() {
        return acMake;
    }
    
    public void setAcModel(String acModel) {
        this.acModel = acModel;
    }
    public String getAcModel() {
        return acModel;
    }
    
    public void setAcColor(String acColor) {
        this.acColor = acColor;
    }
    public String getAcColor() {
        return acColor;
    }
    
    public void setPilotNeeded(String pilotNeeded) {
        this.pilotNeeded = pilotNeeded;
    }
    public String getPilotNeeded() {
        return pilotNeeded;
    }
    
} // end class Aircraft.java
