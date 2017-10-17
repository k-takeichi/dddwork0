package com.naosim.dddwork.api;

import com.naosim.dddwork.service.InputKintai;

public class Main {

    public static void main(String args[]){
        try {
            // ���������å�
            if(args.length < 1) {
                throw new RuntimeException("������­��ޤ���");
            }
            String serviceType = args[0];

            if(ServiceType.getEnum(serviceType).isInput()){
                // �������ϥ����ӥ���Ƥ�
                InputKintai kintai = new InputKintai();
                kintai.execute(args);
            }
            if(ServiceType.getEnum(serviceType).isTotal()){
                // ���ս��ץ����ӥ���Ƥ�
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
