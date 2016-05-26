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
                vo.setCarBrandName(content.substring(1, content.length() - 1));

                column++;
                content = splits[column];
                vo.setCarSetName(content.substring(1, content.length() - 1));

                // 评估单号
                column++;
                content = splits[column];
                vo.setCarBillId(content.substring(1, content.length() - 1));
                // 车主
                column++;
                content = splits[column];
                vo.setCarUserName(content.substring(1, content.length() - 1));
                // 车牌号码
                column++;
                content = splits[column];
                vo.setCarNo(content.substring(1, content.length() - 1));
                // 排量
                column++;
                content = splits[column];
                vo.setCarDisplace(content.substring(1, content.length() - 1));
                // 功率
                column++;
                content = splits[column];
                vo.setPower(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 发动机号
                column++;
                content = splits[column];
                vo.setEngineNum(content.substring(1, content.length() - 1));
                // 车架号
                column++;
                content = splits[column];
                vo.setCarFrameNum(content.substring(1, content.length() - 1));
                // 登记日期
                column++;
                content = splits[column];
                vo.setRegDate(content.substring(1, content.length() - 1));
                // 出厂日期
                column++;
                content = splits[column];
                vo.setProductionDate(content.substring(1, content.length() - 1));
                // 环保标准
                column++;
                content = splits[column];
                vo.setEnvironmentType(content.substring(1, content.length() - 1));
                // 公里数
                column++;
                content = splits[column];
                vo.setRunNum(Integer.valueOf(content.substring(1,
                        content.length() - 1)));
                // 车牌型号
                column++;
                content = splits[column];
                vo.setLabelTypeNum(content.substring(1, content.length() - 1));
                // 车辆类型
                column++;
                content = splits[column];
                vo.setCarTypeInfo(content.substring(1, content.length() - 1));
                // 品牌
                column++;
                content = splits[column];
                vo.setCarBrandName(content.substring(1, content.length() - 1));
                // 车系
                column++;
                content = splits[column];
                vo.setCarSetName(content.substring(1, content.length() - 1));
                // 车型
                column++;
                content = splits[column];
                vo.setCarTypeName(content.substring(1, content.length() - 1));
                // 座位数
                column++;
                content = splits[column];
                vo.setSeat(content.substring(1, content.length() - 1));
                // 颜色
                column++;
                content = splits[column];
                vo.setColor(content.substring(1, content.length() - 1));
                // 年审有效期
                column++;
                content = splits[column];
                vo.setYearCheckDate(content.substring(1, content.length() - 1));
                // 提报人手机号
                column++;
                content = splits[column];
                vo.setTakeUserPhone(content.substring(1, content.length() - 1));
                // escysjg
                column++;
                content = splits[column];
                vo.setPreSalePrice(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 使用性质
                column++;
                content = splits[column];
                vo.setUseNature(content.substring(1, content.length() - 1));
                // 变速箱形式
                column++;
                content = splits[column];
                vo.setChangeSpeed(content.substring(1, content.length() - 1));
                // 车门型式
                column++;
                content = splits[column];
                vo.setCarDoor(content.substring(1, content.length() - 1));
                // 传动方式
                column++;
                content = splits[column];
                vo.setDriveType(content.substring(1, content.length() - 1));
                // 供油系统
                column++;
                content = splits[column];
                vo.setOilSystem(content.substring(1, content.length() - 1));
                // 进气方式
                column++;
                content = splits[column];
                vo.setAirSystem(content.substring(1, content.length() - 1));
                // 特殊车管业务
                column++;
                content = splits[column];
                vo.setSpecialBizInfo(content.substring(1, content.length() - 1));
                // 特殊配置说明
                column++;
                content = splits[column];
                vo.setSpecialConfigInfo(content.substring(1,
                        content.length() - 1));
                // 备注
                column++;
                content = splits[column];
                vo.setCarInfoMark(content.substring(1, content.length() - 1));
                // 新车价格
                column++;
                content = splits[column];
                vo.setNewCarPrice(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 优惠价
                column++;
                content = splits[column];
                vo.setFavorablePrice(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 购置税
                column++;
                content = splits[column];
                vo.setPurchaseTax(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 购入价
                column++;
                content = splits[column];
                vo.setPurchasePrice(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 成新率
                column++;
                content = splits[column];
                vo.setNewRate(Integer.valueOf(content.substring(1,
                        content.length() - 1)));
                // 车龄调整
                column++;
                content = splits[column];
                vo.setCarAgeChange(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 市场冷热
                column++;
                content = splits[column];
                vo.setMarketDeep(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 更新换代
                column++;
                content = splits[column];
                vo.setUpgrading(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 车龄版本系数
                column++;
                content = splits[column];
                vo.setCarVersionParam(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 公里系数
                column++;
                content = splits[column];
                vo.setRunParam(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 车况等级
                column++;
                content = splits[column];
                vo.setCarCondition(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 颜色系数
                column++;
                content = splits[column];
                vo.setColorParam(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 整修费
                column++;
                content = splits[column];
                vo.setRepairCost(Double.valueOf(content.substring(1,
                        content.length() - 1)));
                // 评估价格
                column++;
                content = splits[column];
                vo.setEvaluatePrice(Integer.valueOf(content.substring(1,
                        content.length() - 1)));
                // 评估日期
                column++;
                content = splits[column];
                vo.setEvaluateDate(content.substring(1, content.length() - 1));

                mcontentDatas.add(vo);
            } catch (Exception e) {
                System.out.println("Exception " + vo);
            }
        }
    }

}
