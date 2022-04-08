public class Ubuntu extends Debian {
    private String desktopEnvironment;
    private boolean isLTS;
    public Ubuntu(String packageManager, boolean stability, String version, String architecture, String desktopEnvironment, boolean isLTS) {
        super(packageManager, stability, version, architecture);
        this.desktopEnvironment = desktopEnvironment;
        this.isLTS = isLTS;
    }
    public String toString(){
        return super.toString() + "\nDesktop Environment: " + this.desktopEnvironment + "\nIs LTS (Long term support) version: " + this.isLTS;
    }
    public boolean equals(Object other){
        Ubuntu otherObj = (Ubuntu) other;
        return (super.equals(otherObj) && this.desktopEnvironment == otherObj.desktopEnvironment && this.isLTS == otherObj.isLTS);
    }
    public String architecture(){
        if (super.architecture().equals("Wow, ARM! You are from the future!")){
            return "Wow, ARM! Now supported on Ubuntu!";
        }
        else{
            return super.architecture();
        }
    }
    public String release(){
        if (this.isLTS){
            return "Ubuntu " + super.getVersion() + " LTS";
        }
            return "Ubuntu " + super.getVersion();
    }
    public String otherDistros(){
        return "Other Ubuntu-based distros include: Pop_OS!\n Kubuntu\n Lubuntu\n Xubuntu\n Ubuntu Studio\n Ubuntu MATE\n Linux Mint\n elementary OS";
    }
}
