public class GradStudent extends Student {
    private String dissertationTopic;
    public GradStudent(String name, int id, String dissertationTopic){
        super(name, id);
        this.dissertationTopic = dissertationTopic;
    }
    public String getTopic(){
        return this.dissertationTopic;
    }
    public void setTopic(String topic){
        this.dissertationTopic = topic;
    }
    public void printWelcome(){
        System.out.println(getName() + ", Welcome to graduate School!");
    }
}
