package beginningPractice.oopp;

public class Technology {

    private int memory;
    private boolean hasInternet;
    private boolean hasCamera;

    public Technology(){

    }
    public Technology(int memory,boolean hasInternet,boolean hasCamera){
        this.memory = memory;
        this.hasInternet = hasInternet;
        this.hasCamera = hasCamera;
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public boolean getHasInternet(){
        return hasInternet;
    }
    public void setHasInternet(boolean hasInternet){
        this.hasInternet = hasInternet;
    }

    public boolean getHasCamera(){
        return hasCamera;
    }
    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "memory=" + memory +
                ", hasInternet=" + hasInternet +
                ", hasCamera=" + hasCamera +
                '}';
    }
}


