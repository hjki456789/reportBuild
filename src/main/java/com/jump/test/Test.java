package com.jump.test;

import com.jump.utils.report.generate.ReportBuilder;

import java.io.File;
import java.io.IOException;

/**
 * @author Jump
 * @date 2020/6/17 9:05
 */
public class Test {

    public static void main(String[] args) {
        try {
            ReportInfo reportInfo = new ReportInfo();
            reportInfo.setSampleNo("2022年2月30日");
            reportInfo.setPeriodDate("2021年12月30日至2022年2月30日期间");
            reportInfo.setOut_province_yhbhs("相比去年同期，省外游客中，来自重庆的游客增加最多，增加1234人，而四川游客降幅最大，减少323人");
            reportInfo.setIn_province_yhbhs("去年同期，省内游客中，来自大理的游客增加最多，增加422人，而玉溪游客降幅最大，减少1234人");
            reportInfo.setYh_sex_age("45-64岁游客提升比例最高，提升了13.74个百分点，而15-24岁游客下降幅度最大，下降为12.25个百分点");


            String templatePath = System.getProperty("user.dir") + File.separator + "src/static/template" + File.separator + "楚雄彝族自治州游客分析.docx";
            ReportBuilder.build(reportInfo, templatePath, "D:\\test.docx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
