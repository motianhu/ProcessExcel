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
        String xlsFile = currFilePath + "/data.xls";
        NewLibAction action = new NewLibAction();
        action.readExcel(xlsFile);
    }

    private static void readOldLib(String currFilePath) {
        String xlsFile = currFilePath + "/data.xls";
        OldLibAction action = new OldLibAction();
        action.readExcel(xlsFile);
    }

}
