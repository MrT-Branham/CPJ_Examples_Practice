import java.util.ArrayList;

public class Table extends Furniture{
    private int legs;
    //Constructor with no arguments

    //Overloaded constructor with arguments for materials and legs
    

    public void setLegs(int legs){this.legs = legs; }
    public int getLegs(){return legs;}

    public String toString(){
        StringBuilder output = new StringBuilder(String.format(
                "%s[legs=%d, materials=",
                getClass().toString(),
                legs));
        if (getMaterials().size() == 0){
            output.append("none]");
        }
        else{
            for(String material: getMaterials()){
                output.append(material + ",");
            }
            output.deleteCharAt(output.length() -1);
            output.append("]");
        }
        return output.toString();
    }

    public boolean equals(Object otherObject){
        if (otherObject == null){
            return false;
        }
        if (getClass() != otherObject.getClass()){
            return false;
        }
        Table other = (Table) otherObject;
        return legs == other.legs &&
                getMaterials().size() == other.getMaterials().size() &&
                getMaterials().containsAll(other.getMaterials()); }
}