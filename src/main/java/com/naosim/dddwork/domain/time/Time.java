package com.naosim.dddwork.domain.time;

import java.time.LocalDateTime;

// ����
abstract class Time {
    protected String inputTime;
    protected LocalDateTime time;

    // �����å�
    public boolean formatCheck(){
        // �ե����ޥåȥ����å�
        return true;
    }

    abstract boolean check();

    public LocalDateTime getTime() {
        return time;
    }
}
