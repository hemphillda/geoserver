package org.geoserver.wps.gs;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import org.geoserver.wps.WPSTestSupport;
import org.geotools.factory.CommonFactoryFinder;
import org.geotools.filter.function.RenderingTransformation;
import org.junit.Test;
import org.opengis.filter.FilterFactory;
import org.opengis.filter.expression.Function;

public class GeorectifyCoverageTest extends WPSTestSupport {

    @Test
    public void testIsRenderingProcess() {
        FilterFactory ff = CommonFactoryFinder.getFilterFactory();
        Function f = ff.function("gs:GeorectifyCoverage");
        assertTrue(f instanceof RenderingTransformation);
        assertNotNull(f);
    }
}