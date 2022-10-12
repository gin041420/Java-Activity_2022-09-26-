public class Singer<VariableType>{
    
    private String musicname;
    private String daterelease;
    private VariableType singername;

    public void setSingername(VariableType singername) {
        this.singername = singername;
    }
    public VariableType getSingername() {
        return singername;
    }
    public void setMusicname(String musicname) {
        this.musicname = musicname;
    }
    public String getMusicname() {
        return musicname;
    }
    public void setDaterelease(String daterelease) {
        this.daterelease = daterelease;
    }
    public String getDaterelease() {
        return daterelease;
    }
}