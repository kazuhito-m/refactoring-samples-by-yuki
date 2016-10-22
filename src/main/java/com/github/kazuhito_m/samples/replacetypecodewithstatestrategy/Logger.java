package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

public class Logger {

    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;

    private int _state;

    public Logger() {
        setState(STATE_STOPPED);
    }

    public void start() {
        switch (getState()) {
            case STATE_STOPPED:
                output("** START LOGGING **");
                setState(STATE_LOGGING);
                break;
            case STATE_LOGGING:
            /* Do nothing */
                break;
            default:
                output("Invalid state: " + getState());
        }
    }

    public void stop() {
        switch (getState()) {
            case STATE_STOPPED:
            /* Do nothing */
                break;
            case STATE_LOGGING:
                output("** STOP LOGGING **");
                setState(STATE_STOPPED);
                break;
            default:
                output("Invalid state: " + getState());
        }
    }

    public void log(String info) {
        switch (getState()) {
            case STATE_STOPPED:
                output("Ignoring: " + info);
                break;
            case STATE_LOGGING:
                output("Logging: " + info);
                break;
            default:
                output("Invalid state: " + getState());
        }
    }

    /**
     * ログを媒体いに出力する。
     * ※標準出力以外に出したく成った時用に、とりあえずまとめとく。
     *
     * @param log メッセージ。
     */
    private void output(String log) {
        System.out.println(log);
    }

    private int getState() {
        return this._state;
    }

    private void setState(int state) {
        this._state = state;
    }

}
