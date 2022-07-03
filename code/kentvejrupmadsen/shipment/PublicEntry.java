package kentvejrupmadsen.shipment;


/**
 * @author Kent Madsen
 */
public class PublicEntry 
{
    /**
     * @author Kent Madsen
     * @param args Console Arguments
     */
    public static void main( String[] args )
    {
        Program program = new Program( args );
        
        program.initialise();
        program.execution();
        program.gc();
    }
}
