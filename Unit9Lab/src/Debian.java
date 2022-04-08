public class Debian extends LinuxDistro{
    private String version;
    private String architecture;
    public Debian(String packageManager, boolean stability, String version, String architecture){
        super(packageManager, stability);
        this.version = version;
        this.architecture = architecture;
    }
    public String toString(){
        return super.toString() + "\nVersion: " + this.version + "\nArchitecture: " + this.architecture;
    }
    public boolean equals(Object other){
        Debian otherObj = (Debian) other;
        return (super.equals(otherObj) && this.version == otherObj.version && this.architecture == otherObj.architecture);
    }
    public String architecture(){
        if (this.architecture.equals("x86")){
            return "You are old! 32-bit??";
        }
        else if(this.architecture.equals("x64")){
            return "Nice! 64-bit!";
        }
        else if(this.architecture.equals("ARM")){
            return "Wow, ARM! You are from the future!";
        }
        else{
            return this.architecture + " , cool.";
        }
    }
    public String getVersion(){
        return this.version;
    }
    public String stability(){
        return "Yes, you are stable!";
    }
}
