package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

/**
 * Loggerの状態を表すenum。
 */
public enum State {

    STOPPED {
        @Override
        public void start() {
            output("** START LOGGING **");
        }

        @Override
        public void stop() {
            /* Do nothing */
        }

        @Override
        public void log(String info) {
            output("Ignoring: " + info);
        }
    },
    LOGGING {
        @Override
        public void start() {
            /* Do nothing */
        }

        @Override
        public void stop() {
            output("** STOP LOGGING **");
        }

        @Override
        public void log(String info) {
            output("Logging: " + info);
        }
    };


    /**
     * ログを媒体いに出力する。
     * ※標準出力以外に出したく成った時用に、とりあえずまとめとく。
     *
     * @param log メッセージ。
     */
    private static void output(String log) {
        System.out.println(log);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void log(String info);

}
