package com.smona.base.excel;

import com.smona.base.excel.newlib.NewLibAction;
import com.smona.base.excel.oldlib.OldLibAction;

public class Main {

    public static void main(String[] args) {
        String currFilePath = System.getProperty("user.dir");
        readNewLib(currFilePath);
        readOldLib(currFilePath);
    }

    private static void readNewLib(String currFilePath) {
        String carBrandFile = currFilePath + "/sqlResult_581995.csv";
        String carSetFile = currFilePath + "/sqlResult_581999.csv";
        String carTypeFile = currFilePath + "/sqlResult_582002.csv";
        NewLibAction action = new NewLibAction();
        action.readCarBrand(carBrandFile);
        action.readCarSet(carSetFile);
        action.readCarType(carTypeFile);
    }

    private static void readOldLib(String currFilePath) {
        String xlsFile = currFilePath + "/data.xls";
        OldLibAction action = new OldLibAction();
        action.readExcel(xlsFile);
    }

}
