package com.yupi.yuoj.judge.strategy;

import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;

/**
 * @author Fickler
 * @date 2024/3/20 10:56
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);

}
