package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.logstatus;

import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.Logger.STATE_LOGGING;

/**
 * ログ状態「ログ出力中」のステートクラス。
 */
public class StateLogging implements State {
    @Override
    public int getTypeCode() {
        return STATE_LOGGING;
    }
}
