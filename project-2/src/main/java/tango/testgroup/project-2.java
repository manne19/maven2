package tango.testgroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.tango.DeviceState;
import org.tango.server.ServerManager;
import org.tango.server.annotation.Device;
import org.tango.server.annotation.Init;
import org.tango.server.annotation.State;
import org.tango.server.annotation.StateMachine;

/**
 * project-2 Tango-Controls server
 *
 * @author durga prasad <mannedurgaprasad@gmail.com>
 * @since Thu Aug 13 17:26:31 IST 2020
 */
@Device
public class project-2 {
    private final Logger logger = LoggerFactory.getLogger(project-2.class);
    private final XLogger xlogger = XLoggerFactory.getXLogger(project-2.class);

    @State
    private volatile DeviceState state;

    public DeviceState getState() {
        return state;
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    @Init
    @StateMachine(endState = DeviceState.ON)
    public void init() throws Exception {
        xlogger.entry();

        setState(DeviceState.ON);

        xlogger.exit();
    }

    public static void main(String[] args) {
        ServerManager.getInstance().start(args, project-2.class);
    }
}