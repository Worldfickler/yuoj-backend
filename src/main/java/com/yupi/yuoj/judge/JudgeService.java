package com.yupi.yuoj.judge;

import com.yupi.yuoj.model.entity.QuestionSubmit;

/**
 * @author Fickler
 * @date 2024/3/20 10:26
 */
public interface JudgeService {

    /**
     * 判题服务
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);

}
