package com.smona.base.excel.oldlib;

import java.util.ArrayList;
import java.util.List;

import com.smona.base.excel.action.CSVAction;
import com.smona.base.excel.action.QueryCarBillListVo;

public class OldLibActionCSV extends CSVAction {

    private List<QueryCarBillListVo> mcontentDatas = new ArrayList<QueryCarBillListVo>();

    public List<QueryCarBillListVo> getCellDatas() {
        return mcontentDatas;
    }

    @Override
    public void readFile(List<String> vos) {
        QueryCarBillListVo vo = null;
        int column = 0;
        String content = null;
        // 行数(表头的目录不需要，从1开始)
        for (int i = 2; i < vos.size(); i++) {
            try {
                vo = new QueryCarBillListVo();
                String[] splits = vos.get(i).split(",");

                column = 0;
                content = splits[column];
                vo.setCarBrandName(content);

                column++;
                content = splits[column];
                vo.setCarSetName(content);

                // 评估单号
                column++;
                content = splits[column];
                vo.setCarBillId(content);
                // 车主
                column++;
                content = splits[column];
                vo.setCarUserName(content);
                // 车牌号码
                column++;
                content = splits[column];
                vo.setCarNo(content);
                // 排量
                column++;
                content = splits[column];
                vo.setCarDisplace(content);
                // 功率
                column++;
                content = splits[column];
                vo.setPower(Double.valueOf(content));
                // 发动机号
                column++;
                content = splits[column];
                vo.setEngineNum(content);
                // 车架号
                column++;
                content = splits[column];
                vo.setCarFrameNum(content);
                // 登记日期
                column++;
                content = splits[column];
                vo.setRegDate(content);
                // 出厂日期
                column++;
                content = splits[column];
                vo.setProductionDate(content);
                // 环保标准
                column++;
                content = splits[column];
                vo.setEnvironmentType(content);
                // 公里数
                column++;
                content = splits[column];
                vo.setRunNum(Integer.valueOf(content));
                // 车牌型号
                column++;
                content = splits[column];
                vo.setLabelTypeNum(content);
                // 车辆类型
                column++;
                content = splits[column];
                vo.setCarTypeInfo(content);
                // 品牌
                column++;
                content = splits[column];
                vo.setCarBrandName(content);
                // 车系
                column++;
                content = splits[column];
                vo.setCarSetName(content);
                // 车型
                column++;
                content = splits[column];
                vo.setCarTypeName(content);
                // 座位数
                column++;
                content = splits[column];
                vo.setSeat(content);
                // 颜色
                column++;
                content = splits[column];
                vo.setColor(content);
                // 年审有效期
                column++;
                content = splits[column];
                vo.setYearCheckDate(content);
                // 提报人手机号
                column++;
                content = splits[column];
                vo.setTakeUserPhone(content);
                // escysjg
                column++;
                content = splits[column];
                vo.setPreSalePrice(Double.valueOf(content));
                // 使用性质
                column++;
                content = splits[column];
                vo.setUseNature(content);
                // 变速箱形式
                column++;
                content = splits[column];
                vo.setChangeSpeed(content);
                // 车门型式
                column++;
                content = splits[column];
                vo.setCarDoor(content);
                // 传动方式
                column++;
                content = splits[column];
                vo.setDriveType(content);
                // 供油系统
                column++;
                content = splits[column];
                vo.setOilSystem(content);
                // 进气方式
                column++;
                content = splits[column];
                vo.setAirSystem(content);
                // 特殊车管业务
                column++;
                content = splits[column];
                vo.setSpecialBizInfo(content);
                // 特殊配置说明
                column++;
                content = splits[column];
                vo.setSpecialConfigInfo(content);
                // 备注
                column++;
                content = splits[column];
                vo.setCarInfoMark(content);
                // 新车价格
                column++;
                content = splits[column];
                vo.setNewCarPrice(Double.valueOf(content));
                // 优惠价
                column++;
                content = splits[column];
                vo.setFavorablePrice(Double.valueOf(content));
                // 购置税
                column++;
                content = splits[column];
                vo.setPurchaseTax(Double.valueOf(content));
                // 购入价
                column++;
                content = splits[column];
                vo.setPurchasePrice(Double.valueOf(content));
                // 成新率
                column++;
                content = splits[column];
                vo.setNewRate(Integer.valueOf(content));
                // 车龄调整
                column++;
                content = splits[column];
                vo.setCarAgeChange(Double.valueOf(content));
                // 市场冷热
                column++;
                content = splits[column];
                vo.setMarketDeep(Double.valueOf(content));
                // 更新换代
                column++;
                content = splits[column];
                vo.setUpgrading(Double.valueOf(content));
                // 车龄版本系数
                column++;
                content = splits[column];
                vo.setCarVersionParam(Double.valueOf(content));
                // 公里系数
                column++;
                content = splits[column];
                vo.setRunParam(Double.valueOf(content));
                // 车况等级
                column++;
                content = splits[column];
                vo.setCarCondition(Double.valueOf(content));
                // 颜色系数
                column++;
                content = splits[column];
                vo.setColorParam(Double.valueOf(content));
                // 整修费
                column++;
                content = splits[column];
                vo.setRepairCost(Double.valueOf(content));
                // 评估价格
                column++;
                content = splits[column];
                vo.setEvaluatePrice(Integer.valueOf(content));
                // 评估日期
                column++;
                content = splits[column];
                vo.setEvaluateDate(content);

                mcontentDatas.add(vo);
            } catch (Exception e) {
                System.out.println("Exception " + vo);
            }
        }
    }
    
	@Override
	protected String getEncode() {
		return "UTF-8";
	}

}
