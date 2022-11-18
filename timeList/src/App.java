import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        int iterationCount = 1000;
        List<Double> lList = new LinkedList<Double>();
        List<Double> aList = new ArrayList<Double>();

        long tl1 = System.currentTimeMillis();
        for ( int i = 0; i < iterationCount; i ++ ){
            lList.add( Math.random());
        }
        long tl2 = System.currentTimeMillis();

        long ta1 = System.currentTimeMillis();
        for ( int i  = 0; i < iterationCount; i++ ) {
            aList.add( Math.random() );
        }
        long ta2 = System.currentTimeMillis();

        System.out.println( "Time spent insertion to Linked List: "  + (tl2-tl1) );
        System.out.println( "Time spent on insertion to Array List: " + (ta2 - ta1));

        Iterator lL = lList.iterator();
        Iterator aL = aList.iterator();

      /*   long lt3 = System.currentTimeMillis();
        int indx = 0;
        while(lL.hasNext()) {
            indx ++;
            lL.next();
            if ( indx == 10 ) {
                indx = 0;
                lL.remove();
            }
        }
        long lt4 = System.currentTimeMillis();

        long at3 = System.currentTimeMillis();
        indx = 0;
        while ( aL.hasNext() ) {
            indx ++ ;
            aL.next();
            if ( indx == 10 ) {
                indx = 0;
                aL.remove();
            }
        }
        long at4 = System.currentTimeMillis();
*/
        int indx = 0;
        for ( int i = iterationCount; i > 0; i -- ) {
            if ( indx == 10 ){
                aList.remove(i);
                indx = 0;
            }
            indx ++;
        }

     /*    System.out.println( 
            "time spent to remove elements in LinkedList: " + ( lt4-lt3) 
        );

        System.out.println( 
            "time spent to remove elements in ArrayList: " + (at4 - at3)
        );*/

    }
}
