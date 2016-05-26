package com.smona.base.excel;

import com.smona.base.excel.action.IAction;
import com.smona.base.excel.action.ICallback;
import com.smona.base.excel.newlib.NewLibActionCSV;
import com.smona.base.excel.oldlib.OldLibAction;

public class Main {

    public static void main(String[] args) {
        String currFilePath = System.getProperty("user.dir");
        IAction oldAction = readOldLib(currFilePath);
        ICallback newAction = readNewLib(currFilePath);
        newAction.setAction(oldAction);
        newAction.startMatch();
    }

    private static ICallback readNewLib(String currFilePath) {
        String csvFile = currFilePath + "/sqlResult_588914.csv";
        NewLibActionCSV action = new NewLibActionCSV();
        action.readFile(csvFile);
        return action;
    }

    private static IAction readOldLib(String currFilePath) {
        String xlsFile = currFilePath + "/111.xls";
        OldLibAction action = new OldLibAction();
        action.readFile(xlsFile);
        return action;
    }

}
