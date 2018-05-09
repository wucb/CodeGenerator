package com.codegen.util;

import com.codegen.service.CodeGeneratorConfig;
import com.codegen.service.CodeGeneratorManager;

public class Utils {

    /**
     * 包组织方式
     * @param sign
     * @return
     */
    public static String getEndWithPack(String sign) {
        if (CodeGeneratorConfig.PACK_TYPE == 1) {
            return "/" + sign + "/";
        } else {
            return "";
        }
    }
}
