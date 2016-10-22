package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.logstatus;

import static com.github.kazuhito_m.samples.replacetypecodewithstatestrategy.Logger.STATE_STOPPED;

/**
 * ログ状態「停止」のステートクラス。
 */
public class StateStopped implements State {
    @Override
    public int getTypeCode() {
        return STATE_STOPPED;
    }
}
