package com.smona.base.excel.newlib;

import java.util.ArrayList;
import java.util.List;

import com.smona.base.excel.action.CSVAction;
import com.smona.base.excel.action.IAction;
import com.smona.base.excel.action.ICallback;
import com.smona.base.excel.action.QueryCarBillListVo;
import com.smona.base.excel.oldlib.OldLibAction;

public class NewLibActionCSV extends CSVAction implements ICallback {
    private List<CarDatas> mCarDatas = new ArrayList<CarDatas>();

    private IAction mOldAction;

    public void setAction(IAction oldAction) {
        this.mOldAction = oldAction;
    }

    public void readFile(List<String> brands) {
        CarDatas car = null;
        String content = null;
        int index = 0;
        // 行数(表头的目录不需要，从1开始)
        for (int i = 1; i < brands.size(); i++) {
            car = new CarDatas();
            String[] splits = brands.get(i).split(",");
            /*
             * 品牌ID/Name
             */
            index = 0;
            content = splits[index];
            car.setCarBrandId(Integer.valueOf(content.substring(1,
                    content.length() - 1)));
            index++;
            content = splits[index];
            car.setCarBrandName(content.substring(1, content.length() - 1));

            /*
             * 车系ID/Name
             */
            index++;
            content = splits[index];
            car.setCarSetId(Integer.valueOf(content.substring(1,
                    content.length() - 1)));
            index++;
            content = splits[index];
            car.setCarSetName(content.substring(1, content.length() - 1));
            /*
             * 车型ID/Name
             */
            index++;
            content = splits[index];
            car.setCarTypeId(Integer.valueOf(content.substring(1,
                    content.length() - 1)));
            index++;
            content = splits[index];
            car.setCarTypeName(content.substring(1, content.length() - 1));

            mCarDatas.add(car);
        }

        for (CarDatas carBrand : mCarDatas) {
            //System.out.println(carBrand);
        }
    }

    public void startMatch() {
    	OldLibAction action = (OldLibAction) mOldAction;
        List<QueryCarBillListVo> datas = action.getCellDatas();
        List<QueryCarBillListVo> result = new ArrayList<QueryCarBillListVo>();
        int size = 0;
        for (QueryCarBillListVo data : datas) {
            size = result.size();
            for (CarDatas car : mCarDatas) {
                if (car.getCarBrandName().equals(data.getCarBrandName())
                        && car.getCarSetName().equals(data.getCarSetName())
                        && car.getCarTypeName().equals(data.getCarTypeName())) {
                    result.add(data);
                }
            }
            if (size == result.size()) {
                //System.out.println(data);
            }
        }
        System.out.println("can insert: " + result.size() + ", source: " + datas.size());
    }

	@Override
	protected String getEncode() {
		return "GB2312";
	}
}
