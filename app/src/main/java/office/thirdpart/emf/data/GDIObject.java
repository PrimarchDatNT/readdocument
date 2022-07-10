package office.thirdpart.emf.data;

import office.thirdpart.emf.EMFRenderer;

/**
 * A GDIObject uses a {@link office.thirdpart.emf.EMFRenderer}
 * to render itself to a Graphics2D object.
 *
 * @author Steffen Greiffenberg
 * @version $Id$
 */
public interface GDIObject {

    /**
     * displays the tag using the renderer
     *
     * @param renderer EMFRenderer storing the drawing session data
     */
    public void render(EMFRenderer renderer);
}
