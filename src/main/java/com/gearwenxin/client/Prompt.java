package com.gearwenxin.client;

import com.gearwenxin.model.chatmodel.ChatPromptRequest;
import com.gearwenxin.model.response.PromptResponse;

/**
 * @author Ge Mingjia
 * @date 2023/7/20
 */
public interface Prompt {

    /**
     * Prompt模板对话 (Get请求 不支持流式返回)
     * （非流式）
     *
     * @param request 请求实体类
     * @return ChatResponse 响应实体类
     */
    PromptResponse chatPrompt(ChatPromptRequest request);

}
