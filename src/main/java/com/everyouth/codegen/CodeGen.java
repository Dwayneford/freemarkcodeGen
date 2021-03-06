package com.everyouth.codegen;/**
 * @Author: dyb
 * @Date: 2021/2/26 17:09
 * @Description:
 * @Version: 1.0.0
 */

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * powered by freemark
 * @author DYB
 * @date 2021年02月26日 17:09
 */
public class CodeGen {

    private static final String TEMPLATE_PATH = "src/main/resources/templates";
    private static final String CLASS_PATH = "src/main/java/com/everyouth/codegen";
    private static final String CODE_PATH = "src/main/resources/code";

    public static void main(String[] args) {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {

            String ChineseName = "个人学习工作经历" ;
            String ClassName = "SecretPersonnelStudyOrWorkRecord" ;
            String className = "secretPersonnelStudyOrWorkRecord" ;
            String classPath = "com.everyouthtech.secret" ;


            List<String> types = new ArrayList<String>();
            types.add("Controller");
            types.add("Service");
            types.add("ServiceImpl");
            types.add("Param");
            types.add("Result");

            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("ClassName", ClassName);
            dataMap.put("className", className);
            dataMap.put("classPath", classPath);
            dataMap.put("ChineseName", ChineseName);
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
            dataMap.put("date", sdf.format(new Date()));

            for (String type : types) {
                // step4 加载模版文件
                Template template = configuration.getTemplate(type+".ftl");
                // step5 生成数据
                File docFile = new File(CODE_PATH + "\\" + ClassName+type+".java");
                out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
                // step6 输出文件
                template.process(dataMap, out);
            }
            System.out.println("文件创建成功!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }



}
