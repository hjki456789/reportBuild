package com.jump.test;

import com.jump.utils.report.anno.Render;
import com.jump.utils.report.base.BasePaddingPlaceholder;
import com.jump.utils.report.handler.RenderHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Jump
 * @date 2020/2/26 13:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ReportInfo extends BasePaddingPlaceholder {

    /**
     * 样本编号
     */
    @Render(value = RenderHandler.FILED, anchor = "sampleNo")
    private String sampleNo;

    @Render(value = RenderHandler.FILED, anchor = "periodDate")
    private String periodDate;


    @Render(value = RenderHandler.FILED, anchor = "out_province_yhbhs")
    private String out_province_yhbhs;

    @Render(value = RenderHandler.FILED, anchor = "in_province_yhbhs")
    private String in_province_yhbhs;


    @Render(value = RenderHandler.FILED, anchor = "yh_sex_age")
    private String yh_sex_age;



}
