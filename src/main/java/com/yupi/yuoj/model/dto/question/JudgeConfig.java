package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 * @author Fickler
 * @date 2024/2/19 15:37
 */

@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（kb）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（kb）
     */
    private Long stackLimit;

}
