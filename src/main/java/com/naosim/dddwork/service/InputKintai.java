package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.KintaiRepositoryCSV;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.daily_kintai.DailyKintaiFactory;
import com.naosim.dddwork.domain.daily_kintai.KintaiRepository;

public class InputKintai {

    // spring���Ȥ����DI��
    private KintaiRepository kintaiRepository = new KintaiRepositoryCSV();

    public void execute(String[] args){
        // ���ޥ�ɰ��������å�
        if(args.length != 4){
            // TODO: �������ͤ���
        }

        String date = args[1];
        String inTime = args[2];
        String outTime = args[3];
        DailyKintai kintai = DailyKintaiFactory.createDailyKintai(date, inTime, outTime);
        kintaiRepository.registerKintai(kintai);
    }
}
