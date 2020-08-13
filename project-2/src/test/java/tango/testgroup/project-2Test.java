package tango.testgroup;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import tango.testgroup.project-2;
import org.junit.Test;
import org.tango.DeviceState;

public class project-2Test {

    @Test
    public void testInit() throws Exception {
        project-2 instance = new project-2();

        instance.init();

        assertThat(instance.getState(), is(DeviceState.ON));
    }
}