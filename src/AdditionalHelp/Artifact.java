package AdditionalHelp;

public class Artifact {
    int number;
    String cultName;
    int century;

    public Artifact(int number){
        this.number = number;
    }
    public Artifact(int number, String cultName){
        this.number = number;
        this.cultName = cultName;
    }
    public Artifact(int number, String cultName, int century){
        this.number = number;
        this.cultName = cultName;
        this.century = century;
    }
}
