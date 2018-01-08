

package rectangle;

/**
 *
 * @author dmr
 */
public class Rectangle {
       
    private Rectangle() { }
    
    private static class RectangleHolder {
        private final static Rectangle instance = new Rectangle();
    }
    
    public static Rectangle getInstance() {
         return RectangleHolder.instance;
    }
    
    
}
