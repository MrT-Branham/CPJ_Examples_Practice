import java.util.ArrayList;
public class Furniture {
    private ArrayList<String> materials;
    public Furniture(){
        materials = new ArrayList<>();
    }
    public Furniture(ArrayList<String> materials){
        this.materials = materials;
    }
    public ArrayList<String> getMaterials() {
        return materials;
    }
    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }
}