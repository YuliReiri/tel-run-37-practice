import java.util.ArrayList;
import java.util.List;

public class App {
   
    public static void main(String[] args) throws Exception {
       
        BirchTree birch = new BirchTree(10,10);
        OakTree oak = new OakTree( 20,20);

        birch.growth();
        oak.growth();

        System.out.println( "birch: "  + birch.getTreeSize() );
        System.out.println( "oak: " + oak.getTreeSize());

        List< Tree > trees = new ArrayList<Tree>();
        
        trees.add( oak );
        trees.add( birch );

        for ( int i = 0; i< 10; i++ ){
            for( Tree tree : trees ) {
                tree.growth();
                System.out.println(((TreeSound) tree).getSoundType());
                
            }
        }
        System.out.println( "birch: "  + birch.getTreeSize() );
        System.out.println( "oak: " + oak.getTreeSize());
    }
}
