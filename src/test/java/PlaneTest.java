import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BIG);
    }

    @Test
    public void getPlaneType() {
        assertEquals(PlaneType.BIG, plane.getPlaneType());
    }
}
