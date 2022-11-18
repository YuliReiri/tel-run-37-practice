
public class OakTree extends Tree  {

    public OakTree(Integer xPos, Integer yPos) {
        super(xPos, yPos);
        //TODO Auto-generated constructor stub
    }
    Integer sizeTree = 0;

    public void growth() {
        sizeTree = sizeTree + 20;        
    }
    public Integer getTreeSize() {
        return sizeTree;
    }
    @Override
    public Freq getSoundType() {
        return Freq.LOW;
    }

}