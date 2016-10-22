package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.State.STATE_LOGGING;
import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.State.STATE_STOPPED;

public class Logger {

    private State _state;

    public Logger() {
        _state = STATE_STOPPED;
    }

    public void start() {
        _state.start();
        _state = STATE_LOGGING;
    }

    public void stop() {
        _state.stop();
        _state = STATE_STOPPED;
    }

    public void log(String info) {
        _state.log(info);
    }

}
