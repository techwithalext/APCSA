public class LinuxDistro {
    private String packageManager;
    private boolean stability;
    public LinuxDistro(String packageManager, boolean stability){
        this.packageManager = packageManager;
        this.stability = stability;
    }
    public String toString(){
        return "Package Manager: " + this.packageManager + "\nStable: " + this.stability;
    }
    public boolean equals(Object other){
        LinuxDistro otherObj = (LinuxDistro) other;
        return (this.packageManager == otherObj.packageManager && this.stability == otherObj.stability);
    }
    public String amIStable(){
        if(this.stability == true){
            return "Yes, you are stable!";
        }
        return "No, you like to live on the edge!";
    }
    public String whatIsLinux(){
        return "Linux is a family of open-source Unix-like operating systems based on the Linux kernel, an operating system kernel first released on September 17, 1991, by Linus Torvalds. Linux is typically packaged in a Linux distribution.";
    }
}
