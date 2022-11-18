public abstract class Tree implements TreeSound {

    public Integer xPos;
    public Integer yPos;
    protected Integer sizeTree;

    public Tree(Integer xPos, Integer yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        sizeTree = 0;
    }
    public Integer getTreeSize() {
        return sizeTree;
    }
    public abstract void growth ();
}