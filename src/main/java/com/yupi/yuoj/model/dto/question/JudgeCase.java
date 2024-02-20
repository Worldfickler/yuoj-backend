package com.yupi.yuoj.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 * @author Fickler
 * @date 2024/2/19 15:37
 */

@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
