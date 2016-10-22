package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.State.LOGGING;
import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.State.STOPPED;

public class Logger {

    private State _state;

    public Logger() {
        _state = STOPPED;
    }

    public void start() {
        _state.start();
        _state = LOGGING;
    }

    public void stop() {
        _state.stop();
        _state = STOPPED;
    }

    public void log(String info) {
        _state.log(info);
    }

}
