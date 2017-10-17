package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

// �������եե����ȥ꡼
public class DailyKintaiFactory {

    public static DailyKintai createDailyKintai(String date, String inTime, String outTime){

        KintaiDate kintaiDate  = new KintaiDate(date);
        if(!kintaiDate.isDate()) return null;
        InTime setInTime = new InTime(inTime);
        if(!setInTime.check()) return null;
        OutTime setOutTime = new OutTime(outTime);
        if(!setOutTime.check()) return null;
        // InTime��OutTime����ߴ�Ϣ�����å��Ϥ����Ǽ��� TODO

        ActualWorkingHours actualWorkingHours = new ActualWorkingHours(setInTime, setOutTime);
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, actualWorkingHours);
        return dailyKintai;
    }
}
