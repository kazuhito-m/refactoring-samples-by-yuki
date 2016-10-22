package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

public class Logger {

    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;

    private int _state;

    public Logger() {
        _state = STATE_STOPPED;
    }

    public void start() {
        switch (_state) {
            case STATE_STOPPED:
                System.out.println("** START LOGGING **");
                _state = STATE_LOGGING;
                break;
            case STATE_LOGGING:
            /* Do nothing */
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }

    public void stop() {
        switch (_state) {
            case STATE_STOPPED:
            /* Do nothing */
                break;
            case STATE_LOGGING:
                System.out.println("** STOP LOGGING **");
                _state = STATE_STOPPED;
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }

    public void log(String info) {
        switch (_state) {
            case STATE_STOPPED:
                System.out.println("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                System.out.println("Logging: " + info);
                break;
            default:
                System.out.println("Invalid state: " + _state);
        }
    }
}
