package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

// ���Ȼ���
public class ActualWorkingHours {
    private InTime inTime;
    private OutTime outTime;

    public ActualWorkingHours(InTime inTime, OutTime outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
    }

    // ϫƯ���ַ׻�
    public Hour getWorkingHours(){
        return null;
    }

    // �ĶȻ��ַ׻�
    public Hour getOverWorkHours() {
        return null;
    }

    // ���Ȼ��ַ׻�
    public Hour ActualWorkingHours() {
        return null;
    }
}
